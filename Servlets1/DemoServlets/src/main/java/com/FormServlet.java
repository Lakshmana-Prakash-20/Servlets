package com;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FormServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
	String name	=req.getParameter("name");
		
	String email=	req.getParameter("email");
	
	String pass=	req.getParameter("password");
	
	
	
	res.getWriter().print("<h1> Email : "+ email  + "  Password : " + pass + " , Name  "+ name + "</h1> ");
		
		
		
		
		
		
	}

	
}
