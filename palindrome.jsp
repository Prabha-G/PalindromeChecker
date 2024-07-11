<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Boolean booleanValue=(Boolean) request.getAttribute("booleanValue");
if(booleanValue!=null){
	if(booleanValue){
		out.print("palindrome");
	}
	else{
		out.print("not palindrome");
	}
}

%>
</body>
</html>