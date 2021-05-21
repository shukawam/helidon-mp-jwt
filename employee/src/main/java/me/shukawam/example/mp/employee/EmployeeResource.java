package me.shukawam.example.mp.employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("employee")
public class EmployeeResource {
    @PersistenceContext(unitName = "H2DataSource")
    private EntityManager entityManager;

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Employee getEmployeeById(@PathParam("id") Integer id) {
        return entityManager.find(Employee.class, id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Employee> getAllEmployee() {
        return entityManager.createNamedQuery("getAllEmployee", Employee.class).getResultList();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Employee createEmployee(Employee employee) {
        entityManager.persist(employee);
        return entityManager.find(Employee.class, employee.getId());
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void deleteEmployee(@PathParam("id") Integer id) {
        var employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}
