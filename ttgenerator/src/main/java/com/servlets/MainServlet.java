package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entities.DetailsFaculty;
import com.entities.TimeTable;
import com.helper.FactoryProvider;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MainServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			int SubCode = Integer.parseInt(request.getParameter("SubCode"));
			String Facultyname = request.getParameter("Facultyname");
			int Hour = Integer.parseInt(request.getParameter("Hour"));

			DetailsFaculty details = new DetailsFaculty(SubCode, Facultyname, Hour);
			Session session = FactoryProvider.getFactory().openSession();
			Transaction tx = session.beginTransaction();

			TimeTable mon;
			TimeTable tue;
			TimeTable wed;
			TimeTable thu;
			TimeTable fri;
			TimeTable sat;

			// creating time table for a semester and intialising with 0 values
			if (session.createQuery("select Day from TimeTable").setFetchSize(1).list().isEmpty()) {
				mon = new TimeTable("Monday", 0, 0, 0, 0, 0, 0);
				tue = new TimeTable("Tuesday", 0, 0, 0, 0, 0, 0);
				wed = new TimeTable("Wednesday", 0, 0, 0, 0, 0, 0);
				thu = new TimeTable("Thursday", 0, 0, 0, 0, 0, 0);
				fri = new TimeTable("Friday", 0, 0, 0, 0, 0, 0);
				sat = new TimeTable("Saturday", 0, 0, 0, 0, 0, 0);

				session.save(mon);
				session.save(tue);
				session.save(wed);
				session.save(thu);
				session.save(fri);
				session.save(sat);
			}


			session.save(details);// faculty details which are taken from index.jsp are stored in detailsfaculty
									// table

			tx.commit();
			session.close();
			if(SubCode>500&&SubCode<600)
			{
				request.setAttribute("deatilsFacultyObject", details);
				RequestDispatcher rd = request.getRequestDispatcher("MainServlet2");
				rd.forward(request, response);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}