package com.inherit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestApp {
	
	public static void main(String ar[])
	{
		EntityManagerFactory  emf=Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em=emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Account account=new Account();
		//account.setA_id(1000001);
		account.setAname("rahul");
		
		SavingAccount  savingAccount=new SavingAccount();
		
		savingAccount.setAmount(34000);
		
		em.persist(account);
		em.persist(savingAccount);
		
		em.getTransaction().commit();
	}

}
