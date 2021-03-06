package mvc1;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DepartServlet extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 req.setCharacterEncoding("EUC-KR");
	 resp.setContentType("text/html; charset=EUC-KR");
	 
	 String depart=req.getParameter("depart");
	 DepartExpert de = new DepartExpert();
	 List<String> advice = de.getAdvice(depart);
	 
	 req.setAttribute("advice", advice);
	 RequestDispatcher view = req.getRequestDispatcher("result.jsp");
	 view.forward(req, resp);
	 // PrintWriter pw = resp.getWriter();
	// for(String msg : advice) {
	//	 pw.println("<h2>" +msg+ "</h2>");
	// }
	// PrintWriter pw = resp.getWriter();
	// pw.println("<h2>선택하신 학과 : "+depart+ " </h2>");
	 
	}

	
}
