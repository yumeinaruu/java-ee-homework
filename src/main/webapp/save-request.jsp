
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Ввод заявки</h1>
<form action="request-servlet" method="POST">
    <p>Имя: <input type="text" name="name" required></p>
    <p>Телефон: <input type="text" name="phone" required></p>
    <p><input type="submit" value="Отправить"></p>
</form>
</body>
</html>
