<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<body>
<h3>${boardDto.bnum }번째 글 수정하세요</h3>
	<form action="contentModifyOk">
		<input type="hidden" name="bnum" value="${boardDto.bnum }"><br />
		글제목 <input type="text" name="btitle" value="${boardDto.btitle }"><br />
		글내용 <textarea rows="10" cols="50" name="bcontent">${boardDto.bcontent }</textarea><br />
		작성자 <input type="text" name="bname" value="${boardDto.bname }"><br />
		작성일자 : ${boardDto.bdate }<br />
		<input type="submit" value="수정완료">
		<input type="button" value="취소" onclick="javascript:history.go(-1)">
	</form>
</body>
</html>