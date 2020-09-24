<%-- 
    Document   : arithmeticCalculator
    Created on : Sep 23, 2020, 9:41:24 AM
    Author     : Birdd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="">

            <label>First: </label> <input type="text" name="first_number" value="${firstNumber}"> 
            <br>
            <label>Second: </label> <input type="text" name="second_number" value="${secondNumber}">   
            <br>
            <input type="submit" name="+" value="+"> <input type="submit" name="-" value="-"> <input type="submit" name="*" value="*"> <input type="submit" name="%" value="%"> 
            <br><br>
            <label>Result: ${message}</label>
            <br>
            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
