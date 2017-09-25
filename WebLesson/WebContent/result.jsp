<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String English = (String)session.getAttribute("English"); %>
<% String Japanese = (String)session.getAttribute("Japanese"); %>
<% int count = (int)request.getAttribute("recordNum"); %>
<html>

<head>
<meta charset="UTF-8">
<title>Result</title>
</head>

<body>
<p>【英】：<%= English %>　＝　【日】：<%= Japanese %>　を登録しました！</p>

<br>
<p>登録件数は<%= count %>です。</p>

<p><a href="touroku.html">登録に戻る</a></p>
<p><a href="select.jsp">操作選択に戻る</a></p>
</body>

</html>