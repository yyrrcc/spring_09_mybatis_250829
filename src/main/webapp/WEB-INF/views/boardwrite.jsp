<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
</head>
<body>

	<form action="boardwriteOk">
		글제목 <input type="text" name="btitle"><br />
		글내용 <textarea rows="10" cols="50" name="bcontent"></textarea><br />
		작성자 <input type="text" name="bname"><br />
		<input type="submit" value="글작성">
		<a href="boardlist">글목록으로 가기</a>
		<input type="button" value="취소" onclick="javascript:window.location.href='boardlist'">
	</form>

</body>
</html>