package carserv;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Boolean a;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname=request.getParameter("fn");
		String lname=request.getParameter("ln");
		int ag=Integer.parseInt(request.getParameter("age"));
		String gnd=request.getParameter("gender");
		int cnum=Integer.parseInt(request.getParameter("cn"));
		String ud=request.getParameter("uid");
		String pd=request.getParameter("pwd");
		RegisterBean b=new RegisterBean();
		b.setFname(fname);
		b.setLname(lname);
		b.setAge(ag);
		b.setGnd(gnd);
		b.setCn(cnum);
		b.setUname(ud);
		b.setPwd(pd);
		a=b.validateUser();
		request.setAttribute("result", fname);
		if(a)
		{
			
			request.getRequestDispatcher("/success.jsp").forward(request, response);
			
		}
		else{
			
			request.getRequestDispatcher("/failure.jsp").forward(request, response);
			
		}
		
		
		
		
		doGet(request, response);
	}

}
