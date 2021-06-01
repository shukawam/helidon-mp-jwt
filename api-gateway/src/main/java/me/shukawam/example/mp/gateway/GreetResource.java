package me.shukawam.example.mp.gateway;

import io.helidon.security.annotations.Authenticated;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("greet")
public class GreetResource {

    @GET
    public String greet() {
        return "Hello world!!";
    }
}
