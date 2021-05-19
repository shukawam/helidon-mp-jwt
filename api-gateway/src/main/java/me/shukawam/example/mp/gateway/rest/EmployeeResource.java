package me.shukawam.example.mp.gateway.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@RegisterRestClient(baseUri = "http://employee:8080/")
public interface EmployeeResource {
    @GET
    @Path("health")
    Object healthCheck();

    @GET
    @Path("employee")
    List<Employee> getAllEmployee();
}
