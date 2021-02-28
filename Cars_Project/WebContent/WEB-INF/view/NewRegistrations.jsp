<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/formCss.css"/>
<title>Insert title here</title>
</head>
<body>
<h2 >Add Details Here!!!</h2>
<p style="color:red;">
<%
if(request.getAttribute("msg1")!=null)
out.println(request.getAttribute("msg1"));
%>
</p>
<br>

<div class="container">
  <form action="NewRegistrationController" method="post">
    <label for="company">Company</label>
    <input type="text" id="company" name="company" placeholder="ex:-BMW" >

   <label for="model">Model</label>
    <input type="text" id="model" name="model" placeholder="ex:-X5" >
    
    <label for="color">Color</label>
    <input type="text" id="color" name="color" placeholder="ex:-Red">
    
    <label for="date">Date of purchase</label>
    <input type="text" id="date" name="date"placeholder="Format:YYYY-MM-DD ex:-2021-02-04">
    
    <label for="price">Price</label>
    <input type="text" id="price" name="price" placeholder="ex:-1750000">
    
     <label for="engineCapacity">Engine Capacity</label>
    <input type="text" id="engineCapacity" name="engineCapacity" placeholder="ex:-2998CC">
    
     <label for="licencePlateNumber">Licence Plate Number</label>
    <input type="text" id="licencePlateNumber" name="licencePlateNumber" placeholder=" ex:-KA20ME9080" >
    
     <label for="seatingCapacity">Seating Capacity</label>
    <input type="text" id="seatingCapacity" name="seatingCapacity" placeholder="ex:-5">
    
    <label for="priceRange">Price Range</label>
    <input type="text" id="priceRange" name="priceRange" placeholder="ex:-1700000-2100000">
    
     <label for="year">Purchase Year</label>
    <input type="text" id="year" name="year" placeholder="Format:-YYYY ex:-2021">
    
    <input type="submit" value="Save">
  </form>
</div>
</body>
</html>