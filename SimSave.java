package com.jsp.sim;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SimSave {
	
	public static void main(String[] args) {
		
		
        EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Anisul");
		
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Sim sim= new Sim();
		
		sim.setName("reliance");
		sim.setNumber(7890677890l);
		sim.setBand("5G");
		entityTransaction.begin();
		entityManager.persist(sim);
		entityTransaction.commit();
		
		
		

		
		
		
		
	}

}
