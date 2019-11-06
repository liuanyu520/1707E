<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>编号</td>
			<td>用户名</td>
			<td>密码</td>
		</tr>
		<c:forEach items="${list }" var="a">
			<tr>
				<td>${a.id }</td>
				<td>${a.username }</td>
				<td>${a.password }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>