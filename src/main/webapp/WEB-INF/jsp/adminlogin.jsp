<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
</head>
<body class="bg-info"><br> <br><br> <br>
<h2 style="text-align:center; color:red">${msg2}</h2>
<H1 style="text-align:center">Admin Login</H1>
<form align="center" name="userloginform"  action="/adminlogged" method="GET">  
  
<label> Enter admin Id &nbsp;&nbsp;&nbsp;: &nbsp;</label>         
<input type="text" name="aid" size="15"/> <br> <br>  
<label> Enter Password &nbsp; : &nbsp;</label>     
<input type="text" name="apass" size="15"/> <br> <br>  
<input type="submit" value="Submit"/>   </form> 
<br/><br><form align="center" name="bankingform"  action="/" >
	<input type=submit  value="Back to Home"></form>
</body>
</html>