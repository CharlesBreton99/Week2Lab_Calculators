<%-- 
    Document   : ageCalculator
    Created on : Sep 23, 2020, 9:23:56 AM
    Author     : Birdd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>

        <form method="post" action="">

            <label>Enter your age: </label> <input type="number" name="age" value="">   

            <p>${message}</p>

            <input type="submit" value="Age next birthday">
        </form>

        <a href="./arithmetic">Arithmetic Calculator</a>
    </body>
</html>
