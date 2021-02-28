<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/formCss.css"/>

<title>Search</title>
</head>
<body>
<h2>Search Here!!!!!!</h2>

<div class="container">
  <form action="SearchController" method="post">
    <label for="search">Search</label>
    <input type="text" id="search" name="search" placeholder="Enter Model/Color/Price Range/Year Of Purchase" > 
    <input type="submit" value="Search">
  </form>
</div>
</body>
</html>