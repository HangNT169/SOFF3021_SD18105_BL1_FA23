<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Id</th>
        <th>code</th>
        <th>name</th>
    </tr>
    </thead>
    <tbody>
        <c:forEach items="${list}" var="cat">
            <tr>
                <td>${cat.id1}</td>
                <td>${cat.categoryCode}</td>
                <td>${cat.categoryName}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>