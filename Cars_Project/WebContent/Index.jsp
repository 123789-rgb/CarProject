<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/formCss.css"/>

<title>Login Page</title>
</head>
<body>
<h2>Please Login Here!!!!!</h2> 
<p style="color:red;">
<%
if(request.getAttribute("errormsg")!=null){
	out.println(request.getAttribute("errormsg"));
}
%>
</p>

<br>

<div class="container">
  <form action="LoginController" method="post">
    <label for="Email Id">Email Id</label>
    <input type="text" id="Email Id" name="emailId" >
    <label for="Password">Password</label>
    <input type="Password" id="Password" name="password" >
    <input type="submit" value="Login">
  </form>
</div>
</body>
</html>