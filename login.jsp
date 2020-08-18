<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title> login page</title>
<style>
#o{
width:200px;
border-radius:10px;
height:30px;
}
div.fixed {
  position: fixed;
  bottom: 10px;
  right: 100px;
  width: 300px;
  opacity: 0.8;
}
</style>
</head>
<body background="ferrari_veyron_bugatti_black_italy_red_90595_1366x768.jpg" repeat= no-repeat style='position:relative'>
<div class = "fixed">
<d style="color:white;font-size:80px;font-family:pacifico;text-align:center">&nbspDOSE</d><br>
<r style="color:white;font-size:50px;font-family:Agency FB;text-align:center">&nbsp&nbsp&nbspCar Servicing </r>
<form name=f1 action=LoginServlet method="post" style="text-align:center">
<h2 style="color:white">
  Username: <input type="text" name="uname" id="o" style="opacity:100%"><br><br>
 &nbsp Password: <input type="password" name="pass" id="o"><br></h2>
  <input style="width:90px;border-radius:12px;background-color:#6495ED;color:white"  type="submit" value="Login as user" onclick="this.form.target='_self';return true;"/>
&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
  <input style="width:90px;border-radius:12px;background-color:#6495ED;color:white" type="submit" value="Login as admin" onclick="f1.action='AdminServlet';return true;"/>
</form>
 <p style="color:white;text-align:center">New User? Register <a href="registration.jsp" >here.</a></p>
</div>
</body>
</html>