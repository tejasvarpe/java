import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		double num1 = Double.parseDouble(req.getParameter("txtN1"));
		double num2 = Double.parseDouble(req.getParameter("txtN2"));
		double answer=0;
		String operand = req.getParameter("opr");
		
		if(operand.equals("+")) {
			answer = num1 + num2;
		}
		else if(operand.equals("-")) {
			answer = num1 - num2;
		}
		else if(operand.equals("*")) {
			answer = num1 * num2;
		}
		else if(operand.equals("/")) {
			answer = num1 / num2;
		}
		
		out.println("<h1>"+num1+" "+operand+" "+num2+" = "+answer+"</h1>");
	}
}
