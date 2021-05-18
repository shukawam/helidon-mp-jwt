package me.shukawam.example.mp;

import io.helidon.security.SecurityContext;
import io.helidon.security.abac.scope.ScopeValidator;
import io.helidon.security.annotations.Authenticated;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Inject;
import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.Collections;

/**
 * @author shuhei.kawamura
 */
@Path("oidc")
public class OidcResource {
    private static final JsonBuilderFactory JSON = Json.createBuilderFactory(Collections.emptyMap());

    /**
     * Return a worldly greeting message.
     *
     * @return {@link JsonObject}
     */
    @GET
    @Path("greet")
    @Authenticated
    @ScopeValidator.Scope("first_scope")
    @ScopeValidator.Scope("second_scope")
    @Produces(MediaType.APPLICATION_JSON)
    public JsonObject getDefaultMessage(@Context SecurityContext securityContext) {
        String msg = String.format("%s %s!", "Hello", securityContext.userName());
        return JSON.createObjectBuilder()
                .add("message", msg)
                .build();
    }
}
