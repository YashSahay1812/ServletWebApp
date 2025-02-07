package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/third-servlet")
public class ThirdServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ThirdServlet is invoked!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String formInput = req.getParameter("input");

        System.out.println(String.format("{Input: %s}", formInput));

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.print("<h1>Input Received</h1>");
        writer.print("""
                <h3>Input: %s</h3>
                <h3>Current date: %s</h3>
        """.formatted(formInput, new Date()));

    }
}
