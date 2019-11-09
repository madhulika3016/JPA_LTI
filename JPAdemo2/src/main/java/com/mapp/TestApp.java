package com.mapp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestApp {
	
	public static void main(String ar[])
	{
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
    
    EntityManager  em=emf.createEntityManager();
    
    em.getTransaction().begin();
    
    Library  lib=new Library();
    
    List<Member>  l1=new ArrayList<Member>();
    
    Member m1=new Member();                                
    
   // m1.setM_id(1001);
    m1.setM_name("neha");
    m1.setLibrary(lib);
    
 Member m2=new Member();
    
    //m2.setM_id(1002);
    m2.setM_name("ajay");
    m2.setLibrary(lib);
    
 Member m3=new Member();
    
   // m3.setM_id(1003);
    m3.setM_name("vishal");
    m3.setLibrary(lib);
    
    l1.add(m1);
    l1.add(m2);
    l1.add(m3);
    
    lib.setLibName("My Library");
    lib.setMember(l1);
    
    List<Book> l2=new ArrayList<Book>();
    
    Book b1=new Book();
    b1.setBook_name("java");
    b1.setMember(l1);
    
    Book b2=new Book();
    b2.setBook_name("spring");
    b2.setMember(l1);
    
    l2.add(b1);
    l2.add(b2);
    
    m1.setBook(l2);
    em.persist(m1);
    em.persist(m2);
    em.persist(m3);
    em.persist(lib);
    em.persist(b1);
    em.persist(b2);
    
    em.getTransaction().commit();
       
	}

}
