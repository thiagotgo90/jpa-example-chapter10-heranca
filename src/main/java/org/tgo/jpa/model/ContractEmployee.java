package org.tgo.jpa.model;

import javax.persistence.Entity;

@Entity
public class ContractEmployee extends Employee{

	private String contractEmployee;

	public String getContractEmployee() {
		return contractEmployee;
	}

	public void setContractEmployee(String contractEmployee) {
		this.contractEmployee = contractEmployee;
	}

}
