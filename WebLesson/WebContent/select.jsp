<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String id = (String)session.getAttribute("id"); %>
<% String pass = (String)session.getAttribute("pass"); %>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="style.css" type="text/css">
<title>select</title>
</head>
<body>
<div class="header_sel">
<h2>ようこそ<%= id %>さん </h2>
<div class="open_image"></div>
</div>
<h2>〇操作を選択して下さい〇</h2>
	<table>
	<tr><th><a href="touroku.html">単語登録・削除</a></th></tr>
	<tr><th><a href="list">一覧表示</a></th></tr>
	</table>
</body>
</html>