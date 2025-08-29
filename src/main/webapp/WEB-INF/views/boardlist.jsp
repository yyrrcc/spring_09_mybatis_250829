<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 목록</title>
</head>
<body>
	<h3>게시판 글목록 입니다.</h3>
	<h4>총 게시글 수 : []</h4>
	<hr />
	글번호 / 글제목 / 글쓴이 / 조회수 / 작성일 <br />
	<c:forEach items="${boardDtos }" var="b">
	${b.bnum } / ${b.btitle } / ${b.bname } / ${b.bhit } /${b.bdate } <br /> 
	</c:forEach>
	<hr />
	<a href="boardwrite">글쓰기</a>
	<a href="delete">글삭제</a>
</body>
</html>