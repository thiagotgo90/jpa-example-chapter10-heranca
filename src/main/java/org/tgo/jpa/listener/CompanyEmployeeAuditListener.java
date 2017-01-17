package org.tgo.jpa.listener;

import javax.persistence.PrePersist;

import org.tgo.jpa.model.CompanyEmployee;

public class CompanyEmployeeAuditListener {

    @PrePersist
    private void postPersistCompanyEmployee(CompanyEmployee companyEmployee) {
        System.out.println("Pre Persist: " + companyEmployee.getCompanyEmployee());
    }

}
