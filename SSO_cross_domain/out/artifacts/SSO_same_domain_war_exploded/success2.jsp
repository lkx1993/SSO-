<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
demo2
    <c:forEach var="url" items="${hiddenUrl}">
        <iframe src="${url}" width="0px" height="0px" style="display: none"></iframe>
    </c:forEach>
</body>
</html>