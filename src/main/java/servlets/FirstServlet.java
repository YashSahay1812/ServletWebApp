package servlets;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/first-servlet")
public class FirstServlet implements Servlet {

    private ServletConfig servletConfig;

    /*
        LIFECYCLE METHODS
     */

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("FirstServlet initialized!");
        this.servletConfig = servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("FirstServlet is invoked!");
    }

    @Override
    public void destroy() {
        System.out.println("FirstServlet is destructed!");
    }


    /*
        NON-LIFECYCLE METHODS
     */

    @Override
    public String getServletInfo() {
        return String.format("{\nServletName: %s, \nServletPath: %s, \nCreatedBy: %s \n}",
                "FirstServlet", "/first-servlet", "Implementing the Servlet Interface");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

}
