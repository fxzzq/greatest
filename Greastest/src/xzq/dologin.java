package xzq;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class dologin extends HttpServlet {


	public void destroy() {
		super.destroy(); 
	
	}


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");*/
		String uname=request.getParameter("username");
	    String upwd=request.getParameter("password");
		if("xzq".equals(uname) && "123456".equals(upwd)){
			
		   System.out.println("µÇÂ¼³É¹¦");
		   response.sendRedirect("loginsuccess.jsp");
		}else{
			   System.out.println("µÇÂ¼Ê§°Ü");
			   response.sendRedirect("loginerror.jsp");
		}
	    
	}

	public void init() throws ServletException {
		
	}

}
