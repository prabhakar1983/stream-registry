/* Copyright (c) 2018-Present Expedia Group.
 * All rights reserved.  http://www.homeaway.com

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *      http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.homeaway.streamplatform.streamregistry.configuration;

import java.util.Map;

import javax.validation.Valid;

import lombok.Data;
import lombok.NonNull;

/**
 * Configurations required for the Infra Manager Plugin
 */
@Data
public class InfraManagerConfig {

    /**
     * Infra Manager Class name
     */
    @Valid
    @NonNull
    String className;

    /**
     * Specific configurations required by the Infra Manager class
     */
    @Valid
    @NonNull
    Map<String, Object> config;
}
