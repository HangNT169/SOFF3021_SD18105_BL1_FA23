<%--
  Created by IntelliJ IDEA.
  User: hangnt
  Date: 22/01/2023
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form method="post" action="/sinh-vien/update" modelAttribute ="sv">
    MSSV: <form:input path="mssv" />
    <form:errors path="mssv"/>
    <br/>
    Ten: <form:input path="ten" />
    <form:errors path="ten"/>
    <br>
    Tuoi: <form:input path="tuoi"/>
    <br>
    Dia chi:<form:input path="diaChi"/>
    <br>
    Gioi tinh:<form:radiobutton path="gioiTinh" value="true" checked="true"/>Nam
    <form:radiobutton path="gioiTinh" value="false"/> Nu
    <br>
    <form:button type ="submit">Add</form:button>
</form:form>

</body>
</html>
