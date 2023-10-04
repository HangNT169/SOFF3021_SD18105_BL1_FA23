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
        <th>Cate Name</th>
        <th>Cate Code </th>
        <th>Product Name</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="pr">
        <tr>
            <td>${pr.id}</td>
            <td>${pr.category.categoryName}</td>
            <td>${pr.category.categoryCode}</td>
            <td>${pr.maSP}</td>
            <td>${pr.tenSP}</td>
            <td>${pr.gia}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>