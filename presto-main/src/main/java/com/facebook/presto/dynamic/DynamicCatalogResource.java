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

import com.facebook.presto.connector.ConnectorManager;
import com.facebook.presto.metadata.Catalog;
import com.facebook.presto.metadata.CatalogManager;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.facebook.presto.PrestoMediaTypes.APPLICATION_JACKSON_SMILE;
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

    @Inject
    public DynamicCatalogResource(ConnectorManager connectorManager, CatalogManager catalogManager) {
        this.connectorManager = connectorManager;
        this.catalogManager = catalogManager;
    }

    @PUT
    @Path("/{catalog}")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    public Response put(@PathParam("catalog") String catalog, CatalogInfo catalogInfo) {
        connectorManager.putConnection(catalogInfo.getCatalog(), catalogInfo.getConnector(), catalogInfo.getProperties());
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
}
