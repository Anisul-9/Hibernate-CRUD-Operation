package com.jsp.sim;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SimUpdate {
	
	
	public static void main(String[] args) {
		
		
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Anisul");
		
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Sim sim=entityManager.find(Sim.class,1);
		
		sim.setName("jio");
		sim.setBand("3G");
		
		
		entityTransaction.begin();
		entityManager.merge(sim);
		entityTransaction.commit();
		
		
		
		
	}

}
