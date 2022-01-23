<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
</head>
<body class="bg-info">  
 <br> <br> <br>
 <h2 style="text-align:center; color:red">${msg}</h2> 
<H1 style="text-align:center">Register Form</H1>
 
<form align="center" name="registerform"  action="/registered" method="GET">  
  
<label> &nbsp;User Id &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; : &nbsp;</label>         
<input type="text" name="uid" size="15"/> <br> <br>  
<label> User Name &nbsp;: &nbsp;</label>     
<input type="text" name="uname" size="15"/> <br> <br>  
<label>&nbsp;&nbsp;&nbsp;Dob &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;</label>         
<input type="text" name="dob" size="15"/> <br> <br>  
  <label> &nbsp;&nbsp;Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;:&nbsp;&nbsp;</label>         
<input type="text" name="email" size="15"/> <br> <br> 
  <label> &nbsp;Password&nbsp;&nbsp;&nbsp;&nbsp;:&nbsp;&nbsp;</label>         
<input type="text" name="upass" size="15"/> <br> <br> 
<input type="submit" value="Submit"/>   </form>  
</body>
</html>