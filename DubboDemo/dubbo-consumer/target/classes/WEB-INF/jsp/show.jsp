<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>序号</td>
        <td>名称</td>
        <td>描述</td>
    </tr>
        <c:choose>
            <c:when test="${not empty deviceList}">
                <c:forEach items="${deviceList}" var="device" varStatus="dev">
                    <tr>
                        <td>${device.id}</td>
                        <td>${device.name}</td>
                        <td>${device.desr}</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
               <tr>
                   <td colspan="2">无数据!</td>
               </tr>
            </c:otherwise>
        </c:choose>
</table>
</body>
</html>