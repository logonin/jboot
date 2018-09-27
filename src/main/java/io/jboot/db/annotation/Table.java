/**
 * Copyright (c) 2015-2018, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jboot.db.annotation;

import io.shardingjdbc.core.api.config.strategy.ShardingStrategyConfiguration;

import java.lang.annotation.*;

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Table {

    String tableName();

    String primaryKey() default "";

    Class<? extends ShardingStrategyConfiguration> databaseShardingStrategyConfig() default ShardingStrategyConfiguration.class;

    Class<? extends ShardingStrategyConfiguration> tableShardingStrategyConfig() default ShardingStrategyConfiguration.class;

    String actualDataNodes() default "";

    String keyGeneratorColumnName() default "";

    Class keyGeneratorClass() default Void.class;

    String datasource() default "";
    
}