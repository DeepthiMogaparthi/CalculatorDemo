

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
        {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        int a1= Integer.parseInt(request.getParameter("n1"));
        int a2= Integer.parseInt(request.getParameter("n2"));
        
        RequestDispatcher rd;
        
        		
        Calculations cobj=new Calculations();
        
        if(request.getParameter("r1").equalsIgnoreCase("add"))
        {
        	response.sendRedirect("index.jsp?result="+  cobj.add(a1, a2));
        	
        }
        if(request.getParameter("r1").equalsIgnoreCase("sub"))
        {
        	rd=request.getRequestDispatcher("index.jsp?result="+  cobj.sub(a1, a2));
        	rd.include(request, response);
        }
        if(request.getParameter("r1").equalsIgnoreCase("mul"))
        {
        	rd=request.getRequestDispatcher("index.jsp?result="+  cobj.mul(a1, a2));
        	rd.forward(request, response);
        }
        if(request.getParameter("r1").equalsIgnoreCase("div"))
        {
        	rd=request.getRequestDispatcher("index.jsp?result="+  cobj.div(a1, a2));
        	rd.forward(request, response);
        }
        }
        catch(Exception e)
        {

        }
        
      
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
