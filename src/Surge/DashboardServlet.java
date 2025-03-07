package Surge;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DashboardServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if ("address".equals(action)) {
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String country = request.getParameter("country");
            out.println("<h2>Address Submitted</h2>");
            out.println("City: " + city + "<br>");
            out.println("State: " + state + "<br>");
            out.println("Country: " + country + "<br>");
        } else if ("education".equals(action)) {
            String qualification = request.getParameter("qualification");
            String passoutYear = request.getParameter("passoutYear");
            String percentage = request.getParameter("percentage");
            out.println("<h2>Education Details Submitted</h2>");
            out.println("Qualification: " + qualification + "<br>");
            out.println("Passout Year: " + passoutYear + "<br>");
            out.println("Percentage: " + percentage + "<br>");
        } else if ("family".equals(action)) {
            String fatherName = request.getParameter("fatherName");
            String motherName = request.getParameter("motherName");
            String siblings = request.getParameter("siblings");
            out.println("<h2>Family Details Submitted</h2>");
            out.println("Father Name: " + fatherName + "<br>");
            out.println("Mother Name: " + motherName + "<br>");
            out.println("No. of Siblings: " + siblings + "<br>");
        } else {
            out.println("<h2>Invalid Action</h2>");
        }
    }
}
