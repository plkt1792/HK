<%--
  Created by IntelliJ IDEA.
  User: Pulkit.singh
  Date: 1/8/2015
  Time: 10:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Register</title>
    <script language="JavaScript">
        function doSubmit(){
            var unm=document.getElementById("uname");
            var pwd=document.getElementById("pwd");
            var rpwd=document.getElementById("rpwd");
            if(unm.value=="" || pwd.value=="" || rpwd.value==""){
                alert("Fields can't be left blank");
                return false;
            }
            if(pwd.value!=rpwd.value){
                alert("Passwords don't match");
                return false;
            }
        }
    </script>
</head>
<body>
<form method="post" action="RegisterController" onSubmit="return doSubmit()">
    <table>
        <tr>
            <td><b>Username</b></td>
            <td><input type="text" name="username" id="uname"></td>
        </tr>
        <tr>
            <td><b>Enter Password</b></td>
            <td><input type="password" name="password" id="pwd"></td>
        </tr>
        <tr>
            <td><b>Re-enter Password</b></td>
            <td><input type="password" name="repassword" id="rpwd"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" name="submit" ></td>
        </tr>
    </table>
</form>
</body>
</html>