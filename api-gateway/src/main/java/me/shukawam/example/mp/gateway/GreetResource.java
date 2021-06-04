package me.shukawam.example.mp.gateway;


import io.helidon.security.abac.scope.ScopeValidator;
import io.helidon.security.annotations.Authenticated;

import javax.annotation.security.RolesAllowed;
import javax.json.Json;
import javax.json.JsonBuilderFactory;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Collections;

@Path("greet")
public class GreetResource {
    private static final JsonBuilderFactory JSON = Json.createBuilderFactory(Collections.emptyMap());

    @GET
    @Path("hello1")
    @Authenticated
    public JsonObject hello1() {
        return defaultMessage();
    }

    @GET
    @Path("hello2")
    @Authenticated
    @RolesAllowed({"Guest"})
    public JsonObject hello2() {
        return defaultMessage();
    }

    @GET
    @Path("hello3")
    @Authenticated
    @RolesAllowed({"Admin"})
    public JsonObject hello3() {
        return defaultMessage();
    }

    @GET
    @Path("hello4")
    @Authenticated
    @RolesAllowed({"Admin", "Guest"})
    public JsonObject hello4() {
        return defaultMessage();
    }

    @GET
    @Path("hello5")
    @Authenticated
    @RolesAllowed({"Dummy"})
    public JsonObject hello5() {
        return defaultMessage();
    }

    @GET
    @Path("hello6")
    @Authenticated
    @RolesAllowed({"Admin", "Guest"})
    @ScopeValidator.Scopes({
            @ScopeValidator.Scope("first_scope"), // require approval
            @ScopeValidator.Scope("second_scope"), // require approval
            @ScopeValidator.Scope("basic_scope") // NOT require approval
    })
    public JsonObject hello6() {
        return defaultMessage();
    }

    @GET
    @Path("hello7")
    @Authenticated
    @RolesAllowed({"Admin", "Guest"})
    @ScopeValidator.Scopes({
            @ScopeValidator.Scope("dummy_scope")
    })
    public JsonObject hello7() {
        return defaultMessage();
    }

    private JsonObject defaultMessage() {
        return JSON.createObjectBuilder()
                .add("message", "Hello world!!")
                .build();
    }
}
