package me.shukawam.example.mp.gateway.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.*;
import java.util.List;

@RegisterRestClient(baseUri = "http://employee:8080")
public interface EmployeeResource {
    @GET
    @Path("employee/{id}")
    Employee getEmployeeById(@PathParam("id") Integer id);

    @GET
    @Path("employee")
    List<Employee> getAllEmployee();

    @POST
    Employee createEmployee(Employee employee);

    @GET
    @Path("{id}")
    void deleteEmployee(@PathParam("id") Integer id);
}
