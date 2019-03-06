<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding= "UTF-8" isELIgnored ="false"%> <!-- isELIgnored for enabling el -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Result is : <%= request.getAttribute("result") %> <!-- It should work -->
Result is : ${result} <!-- Might be not worked, cuz el is not enable -->
</body>
</html>