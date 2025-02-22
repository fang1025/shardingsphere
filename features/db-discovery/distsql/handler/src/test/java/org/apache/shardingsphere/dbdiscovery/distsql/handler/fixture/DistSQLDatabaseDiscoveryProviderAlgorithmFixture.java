/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.dbdiscovery.distsql.handler.fixture;

import lombok.Getter;
import org.apache.shardingsphere.dbdiscovery.spi.DatabaseDiscoveryProviderAlgorithm;
import org.apache.shardingsphere.dbdiscovery.spi.ReplicaDataSourceStatus;

import javax.sql.DataSource;
import java.util.Collection;
import java.util.Optional;
import java.util.Properties;

@Getter
public final class DistSQLDatabaseDiscoveryProviderAlgorithmFixture implements DatabaseDiscoveryProviderAlgorithm {
    
    private Properties props;
    
    @Override
    public void init(final Properties props) {
        this.props = props;
    }
    
    @Override
    public void checkEnvironment(final String databaseName, final Collection<DataSource> dataSource) {
    }
    
    @Override
    public boolean isPrimaryInstance(final DataSource dataSource) {
        return false;
    }
    
    @Override
    public ReplicaDataSourceStatus loadReplicaStatus(final DataSource replicaDataSource) {
        return new ReplicaDataSourceStatus(true, 0L);
    }
    
    @Override
    public Optional<Integer> getMinEnabledReplicas() {
        return Optional.empty();
    }
    
    @Override
    public String getType() {
        return "DISTSQL.FIXTURE";
    }
}
