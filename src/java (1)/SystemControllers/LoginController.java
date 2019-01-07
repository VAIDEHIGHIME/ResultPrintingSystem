
package SystemControllers;




import DAO.LoginDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet
{   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, SQLException 
    {
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            LoginDao dao=new LoginDao();
            
            try
            {                 
                if(dao.check(email, password))
                { 
                    HttpSession session=request.getSession();
                    session.setAttribute("email",email);
                    response.sendRedirect("Dashboard.jsp");
                } 
                else
                {  
                    response.sendRedirect("index.html");
                }                                              
            }
            catch(IOException ex)
            {
                out.println("Exception:"+ex);
                
            }
            
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @Override
    public String getServletInfo()
    {
        return "Login Servlet";
    }
}