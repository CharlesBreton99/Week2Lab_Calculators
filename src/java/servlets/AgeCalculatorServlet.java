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
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Getting initial values
        String input = request.getParameter("age");
        
         //Setting up global variable
        request.setAttribute("age", input);

        
        //Getting initial validation check
        if (input == null || input.equals("")) {
            request.setAttribute("message", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                    .forward(request, response);
            return;
        }
        
        
        //Checking if age is a number as well as setting age to be able to do calculation on it
        int age;
          try {
           age = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            request.setAttribute("message", "Invalid input type");

            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                    .forward(request, response);
            return;
        }

        //Display result
        request.setAttribute("message", "Your age next birthday will be " + ++age);

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

}
