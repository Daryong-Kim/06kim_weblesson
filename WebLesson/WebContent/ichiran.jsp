<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.ArrayList"%>
<%@ page import="JspLesson01.Word" %>
<% ArrayList<Word> WordList = (ArrayList<Word>)request.getAttribute("wordList"); %>
<html>

<head>
<meta charset="UTF-8">
<title>ichiran</title>
</head>
<body>

<h2>登録されている単語一覧</h2>
<br>

<% for(Word word : WordList){
	out.println(word);
	out.println("<br>");
	}
%>

<p><a href="select.jsp">操作選択に戻る</a></p>
</body>
</html>