package org.tgo.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tgo.jpa.model.ContractEmployee;
import org.tgo.jpa.model.FullTimeEmployee;
import org.tgo.jpa.model.PartTimeEmployee;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("chapter10");
		EntityManager entityManager = entityManagerFactory.createEntityManager();


		entityManager.getTransaction().begin();

		FullTimeEmployee fullTime = new FullTimeEmployee();
		fullTime.setEmployee("fullTime - employee");
		fullTime.setCompanyEmployee("fullTime - company Employee");
		fullTime.setFullTimeEmployee("fullTime - full time");
		entityManager.persist(fullTime);

		PartTimeEmployee partTime = new PartTimeEmployee();
		partTime.setEmployee("partTime - employee");
		partTime.setCompanyEmployee("partTime - company Employee");
		partTime.setPartTimeEmployee("partTime -part time");
		entityManager.persist(partTime);

		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setEmployee("contractEmployee - employee");
		contractEmployee.setContractEmployee("contractEmployee - contract Employee");
		entityManager.persist(contractEmployee);


		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}

}
