
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
</head>
<body class="bg-info">
	<h2 style='text-align:center'> - ALL CUSTOMERS -</h2>
	<font size='2'><div class="container">
	<table width='70%' align='center' border=' 'class="table table-dark table-hover"	>
	<tr style='text-align:center'>
	<th>Account No</th>
	<th>Customer Id</th>
	<th>Cust Name</th>
	<th>Account type</th>
	<th>Date Of Birth</th>
	<th>Email</th>
	<th>Balance</th></tr>
	<c:forEach var="cust" items="${customers}">
				
				<tr style='text-align:center'>
				<td>${cust.getAccno()}</td>
				<td>${cust.getCustid()}</td>
				<td>${cust.getCname()}</td>
				<td>${cust.getAcctype()}</td>
				<td>${cust.getDob()}</td>
				<td>${cust.getEmail()}</td>
				<td>${cust.getBalance()}</td>
				</c:forEach>
				</table></div></font>
					<br><form align="center" name="bankingform"  action="/adminloggedin" >
	<input type=submit  value="Back to Home"></form>


</body>
</html>