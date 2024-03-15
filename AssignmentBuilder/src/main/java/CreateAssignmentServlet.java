import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/createAssignment")
public class CreateAssignmentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        String deadline = request.getParameter("deadline");

        // Construct Assignment object using Builder pattern
        Assignment assignment = new AssignmentBuilder()
            .setTitle(title)
            .setDescription(description)
            .setDeadline(deadline)
            .build();

        // Save the assignment to database or do further processing

        // Set attributes to pass to JSP
        request.setAttribute("assignment", assignment);

        // Forward to assignmentCreated.jsp
        request.getRequestDispatcher("assignmentCreated.jsp").forward(request, response);
    }
}
