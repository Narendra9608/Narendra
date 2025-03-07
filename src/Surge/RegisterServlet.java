package Surge;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieving form data
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Registration logic (placeholder for database integration)
        if (username != null && email != null && password != null) {
            // For now, just print success response
            response.getWriter().println("Registration Successful! Welcome, " + username);
        } else {
            response.getWriter().println("Error: Please fill out all fields.");
        }
    }
}
