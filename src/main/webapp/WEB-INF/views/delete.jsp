<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글삭제</title>
</head>
<body>
	<h3>게시글 삭제</h3>
	<form action="deleteOk">
		삭제 할 글번호 : <input type="text" name="bnum"><br/>
		<input type="submit" value="삭제">
	</form>
	<hr />
	<c:if test="${not empty deleteErrorMsg }">
		<span style="color: red;">${deleteErrorMsg }</span>
	</c:if>
</body>
</html>