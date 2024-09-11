<%@ page contentType="text/html;charset=ISO-8859-1" language="java" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>To Do!</h1>
	<form action="/add" method="POST">
		<input type="text" name="content" placeholder="Add the TODO"/>
		<input type="submit" value="submit"/>
	</form>
	<h1>All ToDos</h1>
	<h1>${todos}</h1>
	<h1>${todos.size()}</h1>
	<c:forEach items="${todos}" var="lists">
       ${lists}
	</c:forEach>
</body>
</html>