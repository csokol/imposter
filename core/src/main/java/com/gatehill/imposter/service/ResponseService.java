package com.gatehill.imposter.service;

import com.gatehill.imposter.ImposterConfig;
import com.gatehill.imposter.model.ResponseBehaviour;
import com.gatehill.imposter.plugin.config.BaseConfig;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.RoutingContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Pete Cornish {@literal <outofcoffee@gmail.com>}
 */
public interface ResponseService {
    InputStream loadResponseAsStream(ImposterConfig imposterConfig, RoutingContext routingContext, BaseConfig mockConfig) throws IOException;

    JsonArray loadResponseAsJsonArray(ImposterConfig imposterConfig, RoutingContext routingContext, BaseConfig config);

    ResponseBehaviour getResponseBehaviour(RoutingContext routingContext, BaseConfig config);
}
