package org.tgo.jpa.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tgo.jpa.model.FullTimeEmployee;
import org.tgo.jpa.model.PartTimeEmployee;

public class Main {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("chapter10");
		EntityManager entityManager = entityManagerFactory.createEntityManager();


		entityManager.getTransaction().begin();

		FullTimeEmployee fullTime = new FullTimeEmployee();
		fullTime.setEmployee("campo employee");
		fullTime.setCompanyEmployee("company Employee");
		fullTime.setFullTimeEmployee("full time");

		PartTimeEmployee partTime = new PartTimeEmployee();
		partTime.setEmployee("campo employee");
		partTime.setCompanyEmployee("company Employee");
		partTime.setPartTimeEmployee("part time");


		entityManager.persist(fullTime);
		entityManager.persist(partTime);

		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();

	}

}
