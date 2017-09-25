<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String delword = (String)request.getAttribute("delword"); %>
<html>

<head>
<meta charset="UTF-8">
<title>Result2</title>
</head>

<body>
<p> <%= delword %>　を削除しました！</p>

<br>

<p><a href="touroku.html">さらに削除する</a></p>
<p><a href="select.jsp">操作選択に戻る</a></p>
</body>

</html>