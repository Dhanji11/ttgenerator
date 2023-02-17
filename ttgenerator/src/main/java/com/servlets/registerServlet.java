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

@WebServlet("/register")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		register obj=new register(email,name,password);
		
		Session session=FactoryProvider.getFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		boolean isRegistered=false;
		Query q= session.createQuery("from register");
		List l=q.getResultList();
		for(Object o:l)
		{
			register r=(register)o;
			if(r.getEmail().equals(email))
			{
				isRegistered=true;	
				break;
			}
				
		}
		
		if(isRegistered)
		{
			response.setContentType("text/html");
//			PrintWriter out=response.getWriter();
//			out.println("<h2> already a user please login</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.forward(request, response);
		}
		else
		{
			session.save(obj);						
//			response.setContentType("text/html");
//			PrintWriter out=response.getWriter();
//			out.println("<h2> registeration successfull</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("menu.html");
			rd.forward(request, response);
			//response.sendRedirect("MainServlet");
			
		}		
		tx.commit();
		session.close();		
	}
}
