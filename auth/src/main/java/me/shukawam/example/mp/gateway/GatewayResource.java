package me.shukawam.example.mp.gateway;

import io.helidon.security.abac.scope.ScopeValidator;
import io.helidon.security.annotations.Authenticated;
import me.shukawam.example.mp.gateway.rest.Employee;
import me.shukawam.example.mp.gateway.rest.EmployeeResource;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.ws.rs.*;
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
    @Authenticated
    @Path("employee/{id}")
    public Employee getEmployeeById(@PathParam("id") Integer id) {
        return employeeResource.getEmployeeById(id);
    }

    @GET
    @Path("employee")
    @Authenticated
    // A group defined in IDCS domain
    @RolesAllowed({"Admin", "Guest"})
    public List<Employee> getAllEmployee() {
        return employeeResource.getAllEmployee();
    }

    @POST
    @Path("employee")
    @Authenticated
    // A group defined in IDCS domain
    @RolesAllowed("Admin")
    public Employee createEmployee(Employee employee) {
        return employeeResource.createEmployee(employee);
    }

    // authentication and authorization(scope)
    @DELETE
    @Path("employee/{id}")
    @Authenticated
    // A group defined in IDCS domain
    @RolesAllowed("Admin")
    public void deleteEmployee(@PathParam("id") Integer id) {
        employeeResource.deleteEmployee(id);
    }

    // Dummy roles in IDCS.
    @GET
    @Path("role")
    @Authenticated
    @RolesAllowed("Tester") // Not exist in my IDCS
    public String dummyRoles() {
        return "dummy roles.";
    }

    // Dummy scopes in IDCS.
    @GET
    @Path("scope")
    @Authenticated
    @ScopeValidator.Scope("dummy_scope") // not exist in IDCS
    public String dummyScopes() {
        return "dummy scopes.";
    }
}
