<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<style>
.left{
height:600px;width: 120px;
}
.right{
height:1200px;width: 1000px;position: absolute;left: 120px;top:0;
}
</style>
<div class="left">
<a href="Book/index.action" target="rightframe">Book</a>
<br>
<a href="Type/index.action" target="rightframe">Type</a>
</div>
<div class="right">
<iframe src="Book/index.action" name="rightframe" width="500" height="400"></iframe>
</div>
</body>
</html>