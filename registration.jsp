<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<style>
form  
{ display: inline-block;     }
p     { display: table-row; align:center; font-size:50px;color:white }
label { display: table-cell; align:center;}
input { display: table-cell; align:center;width:200px;border-radius:10px;height:30px;}

</style>
</head>
<body align="center" background="ZSipUM (1).jpg" repeat= no-repeat>
<p style="color:grey;font-size:50px;font-family:verdana;">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp DOSE Car Servicing-REGISTRATION</p>
<h3 style="color:#910404">Note : * indicates mandatory fields</h3>
<form method="post" action="http://localhost:8082/CarServ/RegisterServlet">
<p>
<label for = "a"><t style="color:#910404;font-size:30px">*</t>First Name: </label> 
<input id="a" type="text" maxlength="50" name="fn" placeholder="Please Enter Your First Name" required />
</p>
<p>
<label for = "b"><t style="color:#910404;font-size:30px">*</t>Last Name : </label>
<input id="b" type="text" maxlength="50" name="ln" placeholder="Please Enter Your Last Name" required />
</p>
<p>
<label for = "c"><t style="color:#910404;font-size:30px">*</t>Age : </label>
<input id = "c"  type="number" size="2" maxlength="2" name="age" placeholder="Please Enter Your Age" required />
</p>
<p>
<label for = "gender">Gender : </label>
<input style="width:20px;border-radius:1px;height:10px;" id="gender" type = "radio" name = "gender" value = "MALE"> <small><small><small><small><small>Male
<input style="width:20px;border-radius:1px;height:10px;" id="gender" type = "radio" name = "gender" value = "FEMALE">Female
<input style="width:20px;border-radius:1px;height:10px;"  id ="gender" type = "radio" name = "gender" value = "OTHER"> Other</small></small></small></small></small>
</p>
<p>
<label for = "e">Contact Number : </label>
<input  id = "e" type="number" size="10" maxlength="10" name="cn" placeholder="Please Enter Your Phone Number">
</p>
<p>
<label for="f"><t style="color:#910404;font-size:30px">*</t>User ID : </label>
<input id="f" type="text" maxlength="15" name="uid" placeholder="Please Enter a Valid ID" required />
</p>
<p>
<label for = "g"><t style="color:#910404;font-size:30px">*</t>Password : </label>
<input id="g" type="password" maxlength="15" name="pwd" placeholder="Please Enter a Valid Password" required />
</p><br><br>

<input align="center" type="submit" value="Register" style="font-size:20px;align:center;width:200px;border-radius:10px;height:30px;">&nbsp&nbsp&nbsp&nbsp      

<input type="reset" value="Reset" style="font-size:20px;align:center;width:200px;border-radius:10px;height:30px;">
</form>
</body>
</html>