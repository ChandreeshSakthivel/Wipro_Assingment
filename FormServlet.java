// import java.io.IOException;
// import java.io.PrintWriter;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// @WebServlet("/FormServlet")
// public class FormServlet extends HttpServlet {
//     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//         response.setContentType("text/html");
//         PrintWriter out = response.getWriter();

//         String name = request.getParameter("name");
//         String email = request.getParameter("email");
//         String message = request.getParameter("message");

//         out.println("<html><body>");
//         out.println("<h2>Thank You, " + name + "!</h2>");
//         out.println("<p>Email: " + email + "</p>");
//         out.println("<p>Your Message: " + message + "</p>");
//         out.println("</body></html>");
//     }
// }

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form-handler") // URL Mapping
public class FormServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        // Get current date and time
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        // Display response in browser
        response.setContentType("text/html");
        response.getWriter().println("<h2>Form Submission Details:</h2>");
        response.getWriter().println("<p><b>Name:</b> " + name + "</p>");
        response.getWriter().println("<p><b>Email:</b> " + email + "</p>");
        response.getWriter().println("<p><b>Message:</b> " + message + "</p>");
        response.getWriter().println("<hr>");
        response.getWriter().println("<h3>Current Date and Time:</h3>");
        response.getWriter().println("<p>Date & Time: " + formattedDateTime + "</p>");
    }
}