<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.sql.ResultSet" %>
        <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/table.css"/>

<title>Details</title>
</head>
<body>
<h2>Searched Results</h2>

<table id="customers">
<tr>
<th>Company</th>
<th>Model</th>
<th>Color</th>
<th>Date Of Purchase</th>
<th>Price</th>
<th>Engine Capacity</th>
<th>Licence Plate Number</th>
<th>Seating Capacity</th>
<th>Price Range</th>
<th>Purchase Year</th>

</tr>

<tr>
<%
ResultSet results=(ResultSet)request.getAttribute("results");
while(results.next()){%>
<tr>
           <td><%out.println(results.getString(1));%></td>
			<td><%out.println(results.getString(2));%></td>
			 <td><%out.println(results.getString(3));%></td>
			 <td><%out.println(results.getString(4));%></td>
			 <td><%out.println(results.getInt(5));%></td>
			 <td><%out.println(results.getString(6));%></td>
			 <td><%out.println(results.getString(7));%></td>
			 <td><%out.println(results.getInt(8));%></td>
			 <td><%out.println(results.getString(9));%></td>
			 <td><%out.println(results.getInt(10));%></td>
			 
			

</tr>

<%} %>
</table>
</body>
</html>