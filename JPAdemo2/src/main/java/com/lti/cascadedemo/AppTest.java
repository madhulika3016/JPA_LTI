package com.lti.cascadedemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AppTest {
	
	public static void main(String ar[])
	{
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
    
    EntityManager  em=emf.createEntityManager();
    
    em.getTransaction().begin();
    
    Student s1=new Student();
  s1.setSname("nitin");
  Subject  sub1=new Subject();
  
  sub1.setSuname("java");
  sub1.setStudent(s1);
  
 Subject  sub2=new Subject();
  
  sub2.setSuname("python");
  sub2.setStudent(s1);
    
Subject  sub3=new Subject();
  
  sub3.setSuname("perl");
  sub3.setStudent(s1);
  
  
  List<Subject>  list=new ArrayList<Subject>();
  list.add(sub1);
  list.add(sub2);
  list.add(sub3);
  
 s1.setSubject(list);
  
  em.persist(s1);
  
 // em.persist(sub1);
  
 // em.persist(sub2);
  
 // em.persist(sub3);
  
  Query  query1=em.createQuery(" update Student SET sname='neha'  where s_id=221");
  query1.executeUpdate();
  
  
  Query  query2=em.createQuery("delete from  Student   where s_id=221");
  query2.executeUpdate();
  
  Query  query=em.createQuery(" from Student  s");
  
  List<Student>  student= query.getResultList();
  
  System.out.println("The name of subjects are :");
  
  
  for(Student  s:student)
  {
	  System.out.println(s.s_id +"   "+s.sname);
  }
  
  em.getTransaction().commit();
	}

}
