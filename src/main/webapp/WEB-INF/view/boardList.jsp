<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>	
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
</head>
<body>

  <c:forEach var="b" items="${list}">
    <div>
      ${b.boardNo} ${b.boardTitle}
      <a href="/remove?boardNo=${b.boardNo}">삭제</a>
    </div>
  </c:forEach>

</body>
</html>