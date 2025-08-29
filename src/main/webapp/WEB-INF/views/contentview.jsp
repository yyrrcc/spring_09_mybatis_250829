<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내용</title>
</head>
<body>
	<h3>글 내용</h3>
	<hr>
	글 제목 : ${boardDto.btitle } <br />
	글 내용 : ${boardDto.bcontent } <br />
	작성자 : ${boardDto.bname } <br />
	작성일 : ${boardDto.bdate } <br />
	<input type="button" value="글 수정" onclick="javascript:window.location.href='contentmodify?bnum=${boardDto.bnum }'">
	<input type="button" value="글삭제" onclick="javascript:window.location.href='deleteOk?bnum=${boardDto.bnum }'">
	<input type="button" value="목록으로 가기" onclick="javascript:window.location.href='boardlist'">
	
</body>
</html>