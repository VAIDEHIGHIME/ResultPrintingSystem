package SystemControllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DisplayController extends HttpServlet
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {        
            String department=request.getParameter("dpt").toUpperCase();
            String year=request.getParameter("year");
            String semester=request.getParameter("semester");
            String enrollmentid=request.getParameter("ID");
            if("2017".equals(year))
            {
                if("CSE".equals(department))
                {
                    if("1".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2017CSE1stSem.jsp");   
                    }
                    if("2".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2017CSE2ndSem.jsp"); 
                    }
                }
                if("ECE".equals(department))
                {
                    if("1".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2017ECE1stSem.jsp");
                    }
                    if("2".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2017ECE2ndSem.jsp");
                    }
                }
            } 
            if("2016".equals(year))
            {
                if("CSE".equals(department))
                {
                    if("1".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2016CSE1stSem.jsp");
                    }
                    if("2".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2016CSE2ndSem.jsp");
                    }
                    if("3".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2016CSE3rdSem.jsp");
                    }
                    if("4".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2016CSE4thSem.jsp");
                    }
                        
                }
                if("ECE".equals(department))
                {
                    if("1".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2016ECE1stSem.jsp");
                    }
                    if("2".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2016ECE2ndSem.jsp");
                    }
                    if("3".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2016ECE3rdSem.jsp");
                    }
                    if("4".equals(semester))
                    {
                        HttpSession session=request.getSession();
                        session.setAttribute("enrollmentid",enrollmentid);
                        session.setAttribute("semester", semester);
                        session.setAttribute("department",department);
                        response.sendRedirect("Display2016ECE4thSem.jsp");
                    }
                        
                }
            }
            out.close();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        processRequest(request, response);
    }    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Cannot display the marksheet!!!Kindly contact the developers...";
    }
}