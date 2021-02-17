<%-- 
    Document   : login
    Created on : 16-Feb-2021, 7:46:20 PM
    Author     : rcgam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            <br>
            Username:<input type="text" name="username" value="${username}"><br>
            Password:<input type="password" name="password" value=""><br>
            <input type="submit" value="Login">
        </form>
        ${message}
    </body>
</html>
