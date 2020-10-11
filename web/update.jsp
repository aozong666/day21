<%@ page import="com.cs.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/10
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User us=(User)request.getAttribute("us");
%>
<form action="UserServlet?comm=update" method="post">
    <table align="center" width="500px" border="1">
        <input type="hidden" name="id" value="<%=us.getId()%>"/>
        <tr height="40px" align="center">
            <td colspan="2"><strong>用户信息</strong></td>
        </tr>
        <tr height="40px">
            <td align="right">用户名：</td>
            <td>
                <input type="text" name="username" value=" <%=us.getUsername()%>"/>
            </td>
        </tr>
        <tr height="40px">
            <td align="right">密码：</td>
            <td>
                <input type="text" name="password" value="<%=us.getPassword()%>"/>
            </td>
        </tr>
        <tr height="40px">
            <td align="right">性别：</td>
            <td>
                <input type="text" name="sex" value="<%=us.getSex()%>"/>
            </td>
        </tr>
        <tr height="40px">
            <td></td>
            <td>
                <input type="submit" value="修改"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>