<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
</head>
<body class="bg-info">
<h2 style="text-align:center">${msg1}</h2>
<H1 style="text-align:center">-BANKING APPLICATION-</H1>
<h3 style="text-align:center">Choose from following</h3>

<form align="center" name="usermenuform"  action="deposit" method="GET">deposit Amount &nbsp;&nbsp;&nbsp; <i class="bi-arrow-right"></i>  &nbsp;  <input type=submit  value=click><br/><br/></form>
  <form align="center"  name="usermenuform"  action="withdraw" method="GET">Withdraw amount &nbsp;<i class="bi-arrow-right"></i>   &nbsp;<input type=submit  value=click><br/><br/></form>
<form align="center"  name="usermenuform"  action="transfer" method="GET">Transfer Amount &nbsp;&nbsp;<i class="bi-arrow-right"></i> &nbsp;<input type=submit  value=click><br/><br/></form>
<form align="center" name="usermenuform"  action="displaycust" method="GET">display details &nbsp;&nbsp;&nbsp;&nbsp; <i class="bi-arrow-right"></i>  &nbsp;  <input type=submit  value=click><br/><br/><br/><br/></form>
<form align="center" name="usermenuform"  action="/" method="GET"><input type=submit  value=logout><br/><br/></form>
</body>
</html>