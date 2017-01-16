package org.tgo.jpa.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("PART TIME")
public class PartTimeEmployee extends CompanyEmployee{


	private String partTimeEmployee;

	public String getPartTimeEmployee() {
		return partTimeEmployee;
	}

	public void setPartTimeEmployee(String partTimeEmployee) {
		this.partTimeEmployee = partTimeEmployee;
	}
}
