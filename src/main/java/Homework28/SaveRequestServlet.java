package Homework28;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;

@WebServlet("/request-servlet")
public class SaveRequestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");

        if (name == null || phone == null) {
            resp.sendRedirect("save-request.jsp");
        } else {
            Writer writer = resp.getWriter();
            writer.write("Request uploaded!");
        }
    }
}
