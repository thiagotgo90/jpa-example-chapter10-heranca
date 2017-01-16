package org.tgo.jpa.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("FULL TIME")
public class FullTimeEmployee extends CompanyEmployee{


	private String fullTimeEmployee;



	public String getFullTimeEmployee() {
		return fullTimeEmployee;
	}

	public void setFullTimeEmployee(String fullTimeEmployee) {
		this.fullTimeEmployee = fullTimeEmployee;
	}

}
