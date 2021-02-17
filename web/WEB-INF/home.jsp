<%-- 
    Document   : home
    Created on : 16-Feb-2021, 7:46:30 PM
    Author     : rcgam
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <br>
        Hello ${user.getName()}.<br>
        <a href="login?logout">Logout</a>
    </body>
</html>
