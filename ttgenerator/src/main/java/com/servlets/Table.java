package com.servlets;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.entities.DetailsFaculty;
import com.entities.Monday;
import com.entities.TimeTable;
import com.entities.TimeTableStringType;
import com.helper.FactoryProvider;

public class Table 
{
	List<TimeTableStringType> getStringObject(List<TimeTable>intList , List<DetailsFaculty> detailsFaculty)
	{
		List<TimeTableStringType> stringList = new ArrayList();
		
				
				for(TimeTable tt:intList)
				{
					TimeTableStringType mon=new TimeTableStringType();
					mon.setDay(tt.getDay());
					
					for(DetailsFaculty df:detailsFaculty)
					{
						int subCode=tt.getLecture1();
						if(df.getsubcode()==subCode)
						{
							String s=df.getFacultyname()+"("+subCode+")";
							mon.setLecture1(s);
						}
					}
					
					for(DetailsFaculty df:detailsFaculty)
					{
						int subCode=tt.getLecture2();
						if(df.getsubcode()==subCode)
						{
							String s=df.getFacultyname()+"("+subCode+")";
							mon.setLecture2(s);
						}
					}
					
					for(DetailsFaculty df:detailsFaculty)
					{
						int subCode=tt.getLecture3();
						if(df.getsubcode()==subCode)
						{
							String s=df.getFacultyname()+"("+subCode+")";
							mon.setLecture3(s);
						}
					}
					for(DetailsFaculty df:detailsFaculty)
					{
						int subCode=tt.getLecture4();
						if(df.getsubcode()==subCode)
						{
							String s=df.getFacultyname()+"("+subCode+")";
							mon.setLecture4(s);
						}
					}
					for(DetailsFaculty df:detailsFaculty)
					{
						int subCode=tt.getLecture5();
						if(df.getsubcode()==subCode)
						{
							String s=df.getFacultyname()+"("+subCode+")";
							mon.setLecture5(s);
						}
					}
					for(DetailsFaculty df:detailsFaculty)
					{
						int subCode=tt.getLecture6();
						if(df.getsubcode()==subCode)
						{
							String s=df.getFacultyname()+"("+subCode+")";
							mon.setLecture6(s);
						}
					}
					
					stringList.add(mon);
				}
				return stringList;
		}
		
	
	public List<TimeTableStringType> getStringList(List<TimeTable>intList)
	{
		Session session=FactoryProvider.getFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Query q1=session.createQuery("from DetailsFaculty");
		List<DetailsFaculty> detailsFaculty = q1.list();
		List<TimeTableStringType> stringList = new ArrayList();
		stringList=getStringObject(intList,detailsFaculty);
		return stringList;
	}
	
	public List<TimeTable> getSortedList(List<TimeTable>l)
	{
		List<TimeTable>nl = new ArrayList();
		for(int i=1;i<=6;i++)
		{
			switch(i)
			{
			case 1:
				for(TimeTable temp:l)
				{
					if(temp.getDay().equals("Monday"))
						nl.add(temp);
				}
				break;
			case 2:
				for(TimeTable temp:l)
				{
					if(temp.getDay().equals("Tuesday"))
						nl.add(temp);
				}
				break;
			case 3:
				for(TimeTable temp:l)
				{
					if(temp.getDay().equals("Wednesday"))
						nl.add(temp);
				}
				break;
			case 4:
				for(TimeTable temp:l)
				{
					if(temp.getDay().equals("Thursday"))
						nl.add(temp);
				}
				break;
				
			case 5:
				for(TimeTable temp:l)
				{
					if(temp.getDay().equals("Friday"))
						nl.add(temp);
				}
				break;
			case 6:
				for(TimeTable temp:l)
				{
					if(temp.getDay().equals("Saturday"))
						nl.add(temp);
				}
				break;
				
			}
		}
		
		return nl;
	}
	public List<TimeTable> getTable(String s)
	{
		Session session=FactoryProvider.getFactory().openSession();
		Transaction tx=session.beginTransaction();
		
		Query q1=session.createQuery("from "+s);
		List<TimeTable>timetable = q1.list();
		
		session.close();
		
		return timetable;
	}
//	public List<Monday> getTable(String s)
//	{
//		Session session=FactoryProvider.getFactory().openSession();
//		Transaction tx=session.beginTransaction();
//		
//		Query q1=session.createQuery("from "+s);
//		List<Monday>mon = q1.list();
//		
//		session.close();
//		
//		return mon;
//	}
  
}
