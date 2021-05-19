package me.shukawam.example.mp.gateway;

import io.helidon.security.abac.scope.ScopeValidator;
import io.helidon.security.annotations.Authenticated;
import me.shukawam.example.mp.gateway.rest.Employee;
import me.shukawam.example.mp.gateway.rest.EmployeeResource;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("api")
public class GatewayResource {
    @RestClient
    private final EmployeeResource employeeResource;

    @Inject
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

    @GET
    @Path("employee")
    public List<Employee> getAllEmployee() {
        return employeeResource.getAllEmployee();
    }
}
