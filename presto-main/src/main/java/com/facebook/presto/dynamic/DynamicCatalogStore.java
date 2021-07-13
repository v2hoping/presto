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

import com.facebook.airlift.log.Logger;
import com.facebook.presto.connector.ConnectorManager;
import com.facebook.presto.metadata.StaticCatalogStore;
import com.facebook.presto.metadata.StaticCatalogStoreConfig;

import javax.inject.Inject;
import java.io.File;
import java.util.List;

/**
 * Created by houping wang on 2021/7/13
 *
 * @author houping wang
 */
public class DynamicCatalogStore extends StaticCatalogStore
{
    private static final Logger log = Logger.get(DynamicCatalogStore.class);

    @Inject
    public DynamicCatalogStore(ConnectorManager connectorManager, StaticCatalogStoreConfig config) {
        super(connectorManager, config);
    }

    public DynamicCatalogStore(ConnectorManager connectorManager, File catalogConfigurationDir, List<String> disabledCatalogs) {
        super(connectorManager, catalogConfigurationDir, disabledCatalogs);
    }


}
