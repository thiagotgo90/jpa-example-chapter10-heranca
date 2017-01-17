package org.tgo.jpa.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrePersist;

import org.tgo.jpa.listener.EmployeeAuditListener;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "EMPLOYEE_TYPE")
@EntityListeners(EmployeeAuditListener.class)
public abstract class Employee {

    @Id
    @GeneratedValue
    private int id;

    private String employee;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @PrePersist
    private void employeePrePersist() {
        System.out.println("Employee - PrePresist");
    }

}
