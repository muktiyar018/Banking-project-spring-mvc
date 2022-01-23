<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
</head>
<body class="bg-info"><br> <br><br> <br>
<h2 style="text-align:center;color:red">${msg1}</h2>
<h2 style="text-align:center">${msg}</h2>
<H1 style="text-align:center">User Login</H1>
<form align="center" name="userloginform"  action="/userlogged" method="GET">  
  
<label> Enter User Id &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;</label>         
<input type="text" name="uid" size="15"/> <br> <br>  
<label> Enter Password &nbsp; : &nbsp;</label>     
<input type="text" name="upass" size="15"/> <br> <br>  
<input type="submit" value="Submit"/>   </form> 
<br/>
<p style="text-align:center">Don't have an account?</p>
<form align="center" name="userloginform"  action="/registeruser" method="GET">  
	<input type="submit" value="Apply Here"/>   </form> 
	<br><form align="center" name="bankingform"  action="/" >
	<input type=submit  value="Back to Home"></form>
</body>
</html>