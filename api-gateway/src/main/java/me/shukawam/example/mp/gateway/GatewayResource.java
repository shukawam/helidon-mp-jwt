package me.shukawam.example.mp.gateway;

import io.helidon.security.abac.scope.ScopeValidator;
import io.helidon.security.annotations.Authenticated;
import me.shukawam.example.mp.gateway.rest.EmployeeResource;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

public class GatewayResource {
    @RestClient
    private final EmployeeResource employeeResource;

    public GatewayResource(EmployeeResource employeeResource) {
        this.employeeResource = employeeResource;
    }

    @GET
    @Path("employee/health")
    @Authenticated
    @ScopeValidator.Scope("first_scope")
    @ScopeValidator.Scope("second_scope")
    public Object employeeHealthCheck() {
        return employeeResource.healthCheck();
    }
}
