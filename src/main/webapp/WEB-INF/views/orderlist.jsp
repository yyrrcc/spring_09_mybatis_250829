<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원이 주문한 목록</title>
</head>
<body>
	<h3>주문 목록입니다.</h3>
	<hr />
	<c:forEach items="${userOrderDtos }" var="userOrderDtos">
	주문번호 : ${userOrderDtos.orderid } <br />
	주문한 상품 이름 : ${userOrderDtos.ordername } <br />
	<hr />
	</c:forEach>
</body>
</html>