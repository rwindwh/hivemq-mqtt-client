/*
 * Copyright 2018 The MQTT Bee project
 *
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
 *
 */

package org.mqttbee.mqtt;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mqttbee.annotations.DoNotImplement;
import org.mqttbee.mqtt.datatypes.MqttClientIdentifier;

/**
 * @author Silvio Giebl
 */
@DoNotImplement
public interface MqttClientBuilderBase<B extends MqttClientBuilderBase<B>> {

    @NotNull B identifier(@NotNull String identifier);

    @NotNull B identifier(@NotNull MqttClientIdentifier identifier);

    @NotNull B serverHost(@NotNull String host);

    @NotNull B serverPort(int port);

    @NotNull B useSslWithDefaultConfig();

    @NotNull B useSsl(@Nullable MqttClientSslConfig sslConfig);

    @NotNull MqttClientSslConfigBuilder.Nested<? extends B> useSsl();

    @NotNull B useWebSocketWithDefaultConfig();

    @NotNull B useWebSocket(@Nullable MqttWebSocketConfig webSocketConfig);

    @NotNull MqttWebSocketConfigBuilder.Nested<? extends B> useWebSocket();

    @NotNull B executorConfig(@NotNull MqttClientExecutorConfig executorConfig);

    @NotNull MqttClientExecutorConfigBuilder.Nested<? extends B> executorConfig();
}