package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.register;
import com.helper.FactoryProvider;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		Session session=FactoryProvider.getFactory().openSession();
		boolean isTrue=false;
		Query q= session.createQuery("from register");
		List l=q.getResultList();
		for(Object o:l)
		{
			register r=(register)o;
			if(r.getEmail().equals(email)&&r.getPassword().equals(password))
			{
				isTrue=true;	
				break;
			}
				
		}
		
		if(isTrue)
		{
			response.setContentType("text/html");
//			PrintWriter out=response.getWriter();
//			out.println("<h2>login successfull</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("menu.html");
			rd.forward(request, response);
			
		}
		else
		{
							
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<h2>invalid credentials</h1>");
			
		}
		
		
		session.close();		
	}
}