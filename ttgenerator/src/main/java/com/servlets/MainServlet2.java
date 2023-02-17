package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.entities.DetailsFaculty;
import com.entities.Friday;
import com.entities.Monday;
import com.entities.Saturday;
import com.entities.Thursday;
import com.entities.Tuesday;
import com.entities.Wednesday;
import com.helper.FactoryProvider;

public class MainServlet2 extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		System.out.println("MainServlet2 called----------------------------------------------------");
		DetailsFaculty obj=(DetailsFaculty)request.getAttribute("deatilsFacultyObject");
		Session session=FactoryProvider.getFactory().openSession();
		Transaction tx=session.beginTransaction();
		
//		Criteria cr = session.createCriteria(DetailsFaculty.class);
//		//System.out.println("hello1");
//		cr.add(Restrictions.between("SubCode", 500, 600));
//		//System.out.println("hello2");
//		List faculties = cr.list();
		
		
//		for(Object faculty:faculties)
//		{
//			DetailsFaculty f=(DetailsFaculty)faculty;
			System.out.println(obj.getFacultyname()+" "+obj.getsubcode());
			session.save(new Monday(obj.getFacultyname(),0,0,0,0,0,0));
			session.save(new Tuesday(obj.getFacultyname(),0,0,0,0,0,0));
			session.save(new Wednesday(obj.getFacultyname(),0,0,0,0,0,0));
			session.save(new Thursday(obj.getFacultyname(),0,0,0,0,0,0));
			session.save(new Friday(obj.getFacultyname(),0,0,0,0,0,0));
			session.save(new Saturday(obj.getFacultyname(),0,0,0,0,0,0));
		//}
		
			System.out.println("hello3");
		tx.commit();
		session.close();
		
		CreateTable t=new CreateTable();
		
	}
}
