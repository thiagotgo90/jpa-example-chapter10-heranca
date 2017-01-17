package org.tgo.jpa.model;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;

import org.tgo.jpa.listener.CompanyEmployeeAuditListener;

@MappedSuperclass
@EntityListeners({CompanyEmployeeAuditListener.class})
public abstract class CompanyEmployee extends Employee {

    private String companyEmployee;

    public String getCompanyEmployee() {
        return companyEmployee;
    }

    public void setCompanyEmployee(String companyEmployee) {
        this.companyEmployee = companyEmployee;
    }

    @PrePersist
    private void companyEmployeeprePersist() {
        System.out.println("Company Employee - PrePresist");
    }

}
