import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Server")
public class Server extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException { 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
 
		String uname=request.getParameter("txtN1");
		String pwd=request.getParameter("txtN2");
		out.println("Uname="+uname+"<br>");
		out.println("Pwd="+pwd);
	} 
}