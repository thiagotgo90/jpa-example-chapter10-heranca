package org.tgo.jpa.listener;

import javax.persistence.PrePersist;

import org.tgo.jpa.model.Employee;

public class EmployeeAuditListener {

    @PrePersist
    private void postPersistEmployee(Employee employee) {
        System.out.println("Pre Persist: " + employee.getEmployee());
    }

}
