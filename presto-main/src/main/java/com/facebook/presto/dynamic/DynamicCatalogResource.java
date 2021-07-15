/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.dynamic;

import com.facebook.airlift.discovery.client.Announcer;
import com.facebook.airlift.discovery.client.ServiceAnnouncement;
import com.facebook.presto.connector.ConnectorManager;
import com.facebook.presto.execution.scheduler.NodeSchedulerConfig;
import com.facebook.presto.metadata.Catalog;
import com.facebook.presto.metadata.CatalogManager;
import com.facebook.presto.server.ServerConfig;
import com.google.common.base.Joiner;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.*;

import static com.facebook.airlift.discovery.client.ServiceAnnouncement.serviceAnnouncement;
import static com.facebook.presto.server.security.RoleType.ADMIN;
import static com.facebook.presto.server.security.RoleType.USER;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

/**
 * Created by houping wang on 2021/7/13
 * HTTP动态管理CATALOG
 * @author houping wang
 */
@Path("/v1/catalogs")
@RolesAllowed({USER, ADMIN})
public class DynamicCatalogResource
{
    private final ConnectorManager connectorManager;

    private final CatalogManager catalogManager;

    private final Announcer announcer;

    private final ServerConfig serverConfig;

    private final NodeSchedulerConfig schedulerConfig;

    @Inject
    public DynamicCatalogResource(ConnectorManager connectorManager, CatalogManager catalogManager, Announcer announcer, ServerConfig serverConfig, NodeSchedulerConfig schedulerConfig)
    {
        this.connectorManager = connectorManager;
        this.catalogManager = catalogManager;
        this.announcer = announcer;
        this.serverConfig = serverConfig;
        this.schedulerConfig = schedulerConfig;
    }

    @PUT
    @Path("/{catalog}")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response put(@PathParam("catalog") String catalog, CatalogInfo catalogInfo)
    {
        connectorManager.putConnection(catalogInfo.getCatalog(), catalogInfo.getConnector(), catalogInfo.getProperties());
        updateConnectorIds();
        return Response.ok().entity(catalogInfo).build();
    }

    @GET
    @Path("/{catalog}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("catalog") String catalog)
    {
        Optional<Catalog> catalogOptional = catalogManager.getCatalog(catalog);
        if(!catalogOptional.isPresent()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        Catalog catalogItem = catalogOptional.get();
        CatalogInfo catalogInfo = new CatalogInfo();
        catalogInfo.setCatalog(catalogItem.getCatalogName());
        catalogInfo.setProperties(catalogItem.getProperties());
        catalogInfo.setConnector(catalogItem.getConnectorName());
        return Response.ok(catalogInfo).build();
    }

    private void updateConnectorIds() {
        // get existing announcement
        ServiceAnnouncement announcement = getPrestoAnnouncement(announcer.getServiceAnnouncements());

        // automatically build connectorIds in any case
        Set<String> connectorIds = new LinkedHashSet<>();
        List<Catalog> catalogs = this.catalogManager.getCatalogs();
        // if this is a dedicated coordinator, only add jmx
        if (serverConfig.isCoordinator() && !schedulerConfig.isIncludeCoordinator()) {
            catalogs.stream()
                    .map(Catalog::getConnectorId)
                    .filter(connectorId -> connectorId.getCatalogName().equals("jmx"))
                    .map(Object::toString)
                    .forEach(connectorIds::add);
        }
        else {
            catalogs.stream()
                    .map(Catalog::getConnectorId)
                    .map(Object::toString)
                    .forEach(connectorIds::add);
        }

        // build announcement with updated sources
        ServiceAnnouncement.ServiceAnnouncementBuilder builder = serviceAnnouncement(announcement.getType());
        for (Map.Entry<String, String> entry : announcement.getProperties().entrySet()) {
            if (!entry.getKey().equals("connectorIds")) {
                builder.addProperty(entry.getKey(), entry.getValue());
            }
        }
        builder.addProperty("connectorIds", Joiner.on(',').join(connectorIds));

        // update announcement
        announcer.removeServiceAnnouncement(announcement.getId());
        announcer.addServiceAnnouncement(builder.build());
        announcer.forceAnnounce();
    }

    private static ServiceAnnouncement getPrestoAnnouncement(Set<ServiceAnnouncement> announcements)
    {
        for (ServiceAnnouncement announcement : announcements) {
            if (announcement.getType().equals("presto")) {
                return announcement;
            }
        }
        throw new IllegalArgumentException("Presto announcement not found: " + announcements);
    }
}
