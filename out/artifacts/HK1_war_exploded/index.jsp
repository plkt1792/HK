<%--
  Created by IntelliJ IDEA.
  User: Pulkit.singh
  Date: 1/7/2015
  Time: 4:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Login</title>
</head>
<body>
<form action="LoginController" method="post">
    <table>
        <tr>
            <td align="center"><b>Username</b></td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td align="center"><b>Password</b></td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td align="center"><input type="submit" value="Login" ></td>
            <td align="center"><a href="Register.jsp">Sign UP</a></td>
        </tr>
    </table>
</form>

</body>
</html>