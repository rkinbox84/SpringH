<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>


<form action="add3">

	<input type="text" name="num1"><br>
	<input type="text" name="num2"><br>
	<input type="submit"><br>
	
</form>


</body>
</html>
