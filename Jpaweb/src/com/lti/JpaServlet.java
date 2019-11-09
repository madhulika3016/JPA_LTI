package com.lti;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/JpaServlet")
public class JpaServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
        
        EntityManager  em=emf.createEntityManager();
        
   
        
        int  id=  Integer.parseInt(request.getParameter("id"));
        
        String name=request.getParameter("name");
       
        
        em.getTransaction().begin(); 
        Student  stud=new Student();
        
       // stud.setId(id);
        stud.setName(name);
        
        em.persist(stud);
        
        em.getTransaction().commit();
        //em.close();
	}

	

}
