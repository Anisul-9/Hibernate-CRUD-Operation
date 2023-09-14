package com.jsp.sim;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SimDelete {
	
	public static void main(String[] args) {
		
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Anisul");
		
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Sim sim=entityManager.find(Sim.class,3);
		
		if(sim!=null) {
			entityTransaction.begin();
			entityManager.remove(sim);
			entityTransaction.commit();
		}
		else {
			System.out.println("not deleted");
		}
		
	}

}
