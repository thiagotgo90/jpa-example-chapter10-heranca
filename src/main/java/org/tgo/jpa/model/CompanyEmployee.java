package org.tgo.jpa.model;

import javax.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class CompanyEmployee extends Employee {


	private String companyEmployee;

	public String getCompanyEmployee() {
		return companyEmployee;
	}

	public void setCompanyEmployee(String companyEmployee) {
		this.companyEmployee = companyEmployee;
	}

}
