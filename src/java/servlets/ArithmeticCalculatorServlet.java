/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Birdd
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Set up initial page loadup
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Getting initial values
        String firstNumber = request.getParameter("first_number");
        String secondNumber = request.getParameter("second_number");
        
        //Setting up global variable
        request.setAttribute("firstNumber", firstNumber);
        request.setAttribute("secondNumber", secondNumber);

       //Getting initial validation check
        if (firstNumber == null || firstNumber.equals("") || secondNumber == null || secondNumber.equals("")) {
            request.setAttribute("message", "Invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                    .forward(request, response);
            return;
        }

        //Getting values into int with a validation check and setting up result variable
        int first;
        int second;
        int result; 
        
        try {
           first = Integer.parseInt(firstNumber);
           second = Integer.parseInt(secondNumber);
        } catch (NumberFormatException ex) {
            request.setAttribute("message", "Invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                    .forward(request, response);
            return;
        }

        //Checking which submit chosen and doing appropriate calculation
        if (request.getParameter("+") != null) {
            result = first + second;
            request.setAttribute("message", result);
        } else if (request.getParameter("-") != null) {
            result = first - second;
            request.setAttribute("message", result);
        } else if (request.getParameter("*") != null) {
            result = first * second;
            request.setAttribute("message", result);
        } else {
            result = first % second;
            request.setAttribute("message", result);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

}
