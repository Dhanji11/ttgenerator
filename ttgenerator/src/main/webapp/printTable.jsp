<%@page import="com.entities.TimeTableStringType"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*,com.entities.TimeTable"%>
<jsp:useBean id="obj" class="com.servlets.Table"></jsp:useBean>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
<title>TABLE</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<style>
		tr:hover {background-color: #D6EEEE;}
	</style>
</head>

<body>
	<%
		List<TimeTable> unSortedList = obj.getTable("TimeTable");
		List<TimeTable> list =obj.getSortedList(unSortedList);
		List<TimeTableStringType> stringList =obj.getStringList(list);
	%>
	<table class="table" border="thin" width="100%">
		<tr>
			<th colspan="7" style='text-align:center; vertical-align:middle' class="back">Sagar Institute of Science and Technology</th>
		</tr>
		<tr>
			<th colspan="7" style='text-align:center; vertical-align:middle' class="back">Department of Computer Science and Engineering</th>
		</tr>
		<tr>
			<th colspan="7" style='text-align:center; vertical-align:middle' class="back">Session: July-Dec 2022</th>
		</tr>
		<tr>
			<th colspan="7" style='text-align:center; vertical-align:middle' class="back">Time Table V Semester</th>
		</tr>
		<tr>
			<th>Day</th>
			<th>Lecture 1</th>
			<th>Lecture 2</th>
			<th>Lecture 3</th>
			<th>Lecture 4</th>
			<th>Lecture 5</th>
		</tr>
		<%
		for (TimeTableStringType t : stringList) {
		//	for (TimeTable t : list) {
		%>
		<tr>
			<td><%=t.getDay()%></td>
			<td><%=t.getLecture1()%></td>
			<td><%=t.getLecture2()%></td>
			<td><%=t.getLecture3()%></td>
			<td><%=t.getLecture4()%></td>
			<td><%=t.getLecture5()%></td>
		</tr>
		<%
		}
		%>
	
	</table>
	<div class="text-center">
		<button type="submit" onclick="window.print()">Print Table</button>
	  </div>
	
</body>
<style>
	.text-center {
       text-align: center;
		font-size:20px;
		color:rgb(151, 6, 6);
		border:2px;
		background-color: grey;

}
.back
{
	background-color: grey;
}
</style>
</html>

