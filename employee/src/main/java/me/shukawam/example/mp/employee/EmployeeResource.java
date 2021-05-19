package me.shukawam.example.mp.employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("employee")
public class EmployeeResource {
    @PersistenceContext(unitName = "H2DataSource")
    private EntityManager entityManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAllEmployee() {
        return entityManager.createNativeQuery("getAllEmployee", Employee.class).getResultList();
    }
}
