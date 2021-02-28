<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.ResultSet" %>
        <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/formCss.css"/>
<title>Update Page</title>
</head>
<body>
<h2>Please Update Here</h2>
<%
ResultSet results=(ResultSet)request.getAttribute("results");
while(results.next()){%>




<div class="container">
  <form action="UpdateController" method="post">
    <label for="company">Company</label>
    <input type="text" id="company" name="company" readonly value="<%=results.getString(1)%>" >

   <label for="model">Model</label>
    <input type="text" id="model" name="model" value="<%=results.getString(2)%>">
    
    <label for="color">Color</label>
    <input type="text" id="color" name="color" value="<%=results.getString(3)%>">
    
    <label for="date">Date of purchase</label>
    <input type="text" id="date" name="date" value="<%=results.getString(4)%>">
    
    <label for="price">Price</label>
    <input type="text" id="price" name="price" value="<%=results.getInt(5)%>">
    
     <label for="engineCapacity">Engine Capacity</label>
    <input type="text" id="engineCapacity" name="engineCapacity" value="<%=results.getString(6)%>">
    
     <label for="licencePlateNumber">Licence Plate Number</label>
    <input type="text" id="licencePlateNumber" name="licencePlateNumber" value="<%=results.getString(7)%>">
    
     <label for="seatingCapacity">Seating Capacity</label>
    <input type="text" id="seatingCapacity" name="seatingCapacity" value="<%=results.getInt(8)%>">
    
     <label for="priceRange">PriceRange</label>
    <input type="text" id="priceRange" name="priceRange" value="<%=results.getString(9)%>">
    
     <label for="year">Purchase Year</label>
    <input type="text" id="year" name="year" value="<%=results.getInt(10)%>">
    
    <input type="submit" value="update">
  </form>
</div>

<%} %>
</body>
</html>