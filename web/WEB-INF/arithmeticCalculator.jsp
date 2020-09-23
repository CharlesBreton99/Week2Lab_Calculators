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

            <label>First: </label> <input type="number" name="first_number" value=""> 
            <br>
            <label>Second: </label> <input type="number" name="second_number" value="">   
            
            <input type="button" value="+"> <input type="button" value="-"> <input type="button" value="*"> <input type="button" value="%"> 
            
            <label>Result: ---</label><p>${message}</p>

            <a href="age">Age Calculator</a>
        </form>
    </body>
</html>
