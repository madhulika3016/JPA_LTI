package com.lti;

	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class TestApp {
	    public static void main( String[] args )
	    {
	        EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	        
	        EntityManager  em=emf.createEntityManager();
	        em.getTransaction().begin(); 
	       Employee employee=new Employee();
	       Laptop l1=new Laptop();
	        
	     employee.setEname("puja");
	     employee.setLaptop(l1);
	       l1.setLid(123);
	l1.setBrand("hp");
	l1.setEmployee(employee);
	        
	       em.persist(employee);
	       em.persist(l1);
	       
	        	      em.getTransaction().commit();
	        em.close();   
	    }
	}



