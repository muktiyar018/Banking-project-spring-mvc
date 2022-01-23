<Html>  
<head>   
<title>  
Registration Page  
</title>  
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
</head>  
<body class="bg-info">  
 <br> <br> <br> 
 <h2 style="text-align:center; color:red">${msg}</h2>
<H1 style="text-align:center">Open Account</H1>
 
<form align="center" name="openaccform"  action="accopened" method="GET">  
  
<label> Acc No &nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;</label>         
<input type="text" name="accno" size="15"/> <br> <br>  
<label> &nbsp;Cust Id &nbsp;&nbsp;&nbsp;&nbsp;: &nbsp;</label>     
<input type="text" name="custid" size="15"/> <br> <br>  
<label>Acc Type&nbsp;&nbsp;: &nbsp;</label>         
<input type="text" name="acctype" size="15"/> <br> <br>  
  <label> Balance&nbsp;&nbsp; &nbsp;:&nbsp;&nbsp;</label>         
<input type="text" name="balance" size="15"/> <br> <br> 
<input type="submit" value="Submit"/>   </form>  
<br/>
	<form align="center" name="bankingform"  action="adminloggedin" >
	<input type=submit  value="Back to Home"></form>
</body>  
</html> 