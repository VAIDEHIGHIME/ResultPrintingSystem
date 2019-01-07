package SystemControllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogoutController extends HttpServlet
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) 
        {  
            request.getRequestDispatcher("index.html").include(request, response);
            HttpSession session = request.getSession();
            session.removeAttribute("email");
            session.invalidate();
            out.close();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo()
    {
        return "Logout Servlet";
    }

}
