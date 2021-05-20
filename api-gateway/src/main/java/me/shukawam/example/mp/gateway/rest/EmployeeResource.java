package me.shukawam.example.mp.gateway.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@RegisterRestClient(baseUri = "http://employee:8080")
public interface EmployeeResource {
    @GET
    @Path("employee")
    List<Employee> getAllEmployee();

    @POST
    Employee createEmployee(Employee employee);

    @GET
    @Path("{id}")
    void deleteEmployee(@PathParam("id") Integer id);
}
