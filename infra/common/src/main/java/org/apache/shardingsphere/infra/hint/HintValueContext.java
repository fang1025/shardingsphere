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

package org.apache.shardingsphere.infra.hint;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Hint value context.
 */
@Getter
@Setter
@ToString
public final class HintValueContext {
    
    private final Multimap<String, Comparable<?>> shardingDatabaseValues = ArrayListMultimap.create();
    
    private final Multimap<String, Comparable<?>> shardingTableValues = ArrayListMultimap.create();
    
    private String dataSourceName = "";
    
    private boolean databaseShardingOnly;
    
    private boolean writeRouteOnly;
    
    private boolean useTraffic;
    
    private boolean skipEncryptRewrite;
    
    private String disableAuditNames = "";
    
    private boolean shadow;
}
