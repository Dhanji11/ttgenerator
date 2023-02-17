package com.servlets;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.entities.Days;
import com.entities.DetailsFaculty;
import com.entities.Friday;
import com.entities.Monday;
import com.entities.Saturday;
import com.entities.Thursday;
import com.entities.TimeTable;
import com.entities.Tuesday;
import com.entities.Wednesday;
import com.helper.FactoryProvider;

import com.servlets.ArrayListToStack;
public class CreateTable {
	
	// the function performing business logic
	
	static void function(List<Days>days, List<TimeTable>timetable, List<DetailsFaculty>faculties, Stack stack,String day)
	{
		for(TimeTable t:timetable)
		{
			  if(t.getDay().equals(day))
			  {
				  int subcode=Integer.parseInt(stack.pop().toString())+500; // converting that single digit into a subcode
				  t.setLecture1(subcode);
				  for(DetailsFaculty f:faculties)
				  {
					  if(f.getsubcode()==subcode)
					  {
						  f.sethour(f.gethour()-1);
						  String fname=f.getFacultyname();
						  for(Days Mo:days) // days means Monday class , Tuesday class...
						  {
							  if(Mo.getFaculty().equals(fname))
							  {
								  Mo.setLecture1(subcode);
							  }
							  
						  }
					  }
				  }
				  
				  subcode=Integer.parseInt(stack.pop().toString())+500;
				  t.setLecture2(subcode);
				  for(DetailsFaculty f:faculties)
				  {
					  if(f.getsubcode()==subcode)
					  {
						  f.sethour(f.gethour()-1);
						  String fname=f.getFacultyname();
						  for(Days Mo:days)
						  {
							  if(Mo.getFaculty().equals(fname))
							  {
								  Mo.setLecture2(subcode);
							  }
							  
						  }
					  }
				  }
				  
				  subcode=Integer.parseInt(stack.pop().toString())+500;
				  t.setLecture3(subcode);
				  for(DetailsFaculty f:faculties)
				  {
					  if(f.getsubcode()==subcode)
					  {
						  f.sethour(f.gethour()-1);
						  String fname=f.getFacultyname();
						  for(Days Mo:days)
						  {
							  if(Mo.getFaculty().equals(fname))
							  {
								  Mo.setLecture3(subcode);
							  }
							  
						  }
					  }
				  }
				  
				  subcode=Integer.parseInt(stack.pop().toString())+500;
				  t.setLecture4(subcode);
				  for(DetailsFaculty f:faculties)
				  {
					  if(f.getsubcode()==subcode)
					  {
						  f.sethour(f.gethour()-1);
						  String fname=f.getFacultyname();
						  for(Days Mo:days)
						  {
							  if(Mo.getFaculty().equals(fname))
							  {
								  Mo.setLecture4(subcode);
							  }
							  
						  }
					  }
				  }
				  
				  subcode=Integer.parseInt(stack.pop().toString())+500;
				  t.setLecture5(subcode);
				  for(DetailsFaculty f:faculties)
				  {
					  if(f.getsubcode()==subcode)
					  {
						  f.sethour(f.gethour()-1);
						  String fname=f.getFacultyname();
						  for(Days Mo:days)
						  {
							  if(Mo.getFaculty().equals(fname))
							  {
								  Mo.setLecture5(subcode);
							  }
							  
						  }
					  }
				  }  
				  
			  }
			  
		  }
	}
	
	public CreateTable() {
		
		Session session=FactoryProvider.getFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Criteria cr = session.createCriteria(DetailsFaculty.class);
		cr.add(Restrictions.between("SubCode", 500, 600));
		List<DetailsFaculty> faculties = cr.list();  // loading all the faculties data from database where 500<subcode<600
		
		Query q1=session.createQuery("from TimeTable");
		List<TimeTable>timetable = q1.list();  // loading all the data from timetable database
		
		ArrayList randomList=new GetRandomList().getList();
		ArrayListToStack obj=new ArrayListToStack();

		
		List<Monday>monday =session.createQuery("from Monday").list();// loading all the data from Monday table
		List<Tuesday> tuesday =session.createQuery("from Tuesday").list();// loading all the data from Tuesday table
		List<Wednesday>wednesday =session.createQuery("from Wednesday").list();// loading all the data from Wednesday table
		List<Thursday>thursday =session.createQuery("from Thursday").list();// loading all the data from Thursday table
		List<Friday> friday =session.createQuery("from Friday").list();// loading all the data from Friday table
		List<Saturday> saturday =session.createQuery("from Saturday").list();// loading all the data from Saturday table 
		
		// intialising  the tables with zero
		
	for(TimeTable t:timetable)
	{
		t.setLecture1(0);t.setLecture2(0);t.setLecture3(0);t.setLecture4(0);t.setLecture5(0);t.setLecture6(0);
	}	
		
	for(Monday t:monday) 
	{
		t.setLecture1(0);t.setLecture2(0);t.setLecture3(0);t.setLecture4(0);t.setLecture5(0);t.setLecture6(0);
	}
	for(Tuesday t:tuesday) 
	{
		t.setLecture1(0);t.setLecture2(0);t.setLecture3(0);t.setLecture4(0);t.setLecture5(0);t.setLecture6(0);
	}
	for(Wednesday t:wednesday)
	{
		t.setLecture1(0);t.setLecture2(0);t.setLecture3(0);t.setLecture4(0);t.setLecture5(0);t.setLecture6(0);
	}
	for(Thursday t:thursday)  
	{
		t.setLecture1(0);t.setLecture2(0);t.setLecture3(0);t.setLecture4(0);t.setLecture5(0);t.setLecture6(0);
	}
	for(Friday t:friday) 
	{
		t.setLecture1(0);t.setLecture2(0);t.setLecture3(0);t.setLecture4(0);t.setLecture5(0);t.setLecture6(0);
	}
	for(Saturday t:saturday)
	{
		t.setLecture1(0);t.setLecture2(0);t.setLecture3(0);t.setLecture4(0);t.setLecture5(0);t.setLecture6(0);
	}
		
//function(List<Days>days, List<TimeTable>timetable, List<DetailsFaculty>faculties, Stack stack,String day)
		for(int i=1;i<=6;i++)
		{
			List<Days>days=null;
			Stack s=obj.getStack(Integer.parseInt(randomList.get(i-1).toString())); // stack of random digits(subject)
			
			switch (i) {
			  case 1:
				  days=(List)monday;
				  // List<Days> supers = List.copyOf( monday); // it is not working 
				  CreateTable.function(days,timetable,faculties,s,"Monday");
			    break;
			    
			  case 2:
				  days=(List)tuesday;
				  // List<Days> supers = List.copyOf( monday); // it is not working 
				  CreateTable.function(days,timetable,faculties,s,"Tuesday");
				  break;
			  case 3:
				  days=(List)wednesday;
				  // List<Days> supers = List.copyOf( monday); // it is not working 
				  CreateTable.function(days,timetable,faculties,s,"Wednesday");
				  break;
			  case 4:
				  days=(List)thursday;
				  // List<Days> supers = List.copyOf( monday); // it is not working 
				  CreateTable.function(days,timetable,faculties,s,"Thursday");
				  break;
			  case 5:
				  days=(List)friday;
				  // List<Days> supers = List.copyOf( monday); // it is not working 
				  CreateTable.function(days,timetable,faculties,s,"Friday");
				  break;
			  case 6:
				  days=(List)saturday;
				  // List<Days> supers = List.copyOf( monday); // it is not working 
				  CreateTable.function(days,timetable,faculties,s,"Saturday");
				  break;
			}
		}
		
		// updating all the data in database
		// means whatever data of the entity has been changed in this file in storing back to database 

		for(TimeTable tt:timetable) 
		{
				session.save(tt);
		}
		
		for(DetailsFaculty df:faculties)  
		{
			session.save(df);
		}
		
		for(Monday m:monday) 
		{
			session.save(m);
		}
		for(Tuesday t:tuesday)  
		{
			session.save(t);
		}
		for(Wednesday t:wednesday)
		{
			session.save(t);
		}
		for(Thursday t:thursday)
		{
			session.save(t);
		}
		for(Friday t:friday) 
		{
			session.save(t);
		}
		for(Saturday t:saturday) 
		{
			session.save(t);
		}

	
		tx.commit();
		session.close();
	}
	
}
