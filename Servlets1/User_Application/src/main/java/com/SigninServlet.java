package com;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


public class SigninServlet  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
	String name = req.getParameter("name");
		
	String email = req.getParameter("email");
	
	String password = req.getParameter("password");
	
	String phone = req.getParameter("phone");
	
	String gender = req.getParameter("gender");
	
	
	User u = new User();
	
	User_Primary a = new User_Primary();
	a.setPhone(Long.parseLong(phone));
	
	
	
	
	u.setName(name);
	u.setPassword(password);
	u.setEmail(email);
	u.setGender(gender);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	try {

		et.begin();
		em.persist(u);
		et.commit();
		
		res.getWriter().print("<h1>Data saved successfully</h1>");
		
	} catch (Exception e) {
		e.printStackTrace();
		et.rollback();
	}
	
	}

}
