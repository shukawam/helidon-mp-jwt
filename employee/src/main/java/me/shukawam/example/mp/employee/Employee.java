package me.shukawam.example.mp.employee;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "Employee")
@Table(name = "EMPLOYEE")
@NamedQueries({
        @NamedQuery(name = "getAllEmployee", query = "SELECT e FROM Employee e")
})
@Data
public class Employee {
    @Id
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "AGE")
    private Integer age;
}
