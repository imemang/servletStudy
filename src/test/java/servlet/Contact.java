package test.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Contact
 */
@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * GET 호출 시
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TEST?");
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * POST 호출 시
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = res.getWriter();
		
		// request.getParameter
		// request 웹 페이지의 name 에 해당하는 값을 읽어옴
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		// response 웹페이지에 작성
		out.println("<html>");
		out.println("<head><title>연락처</title></head>");
		out.println("<body>");
		out.println("<h3>연락처</h3>");
		out.println("<a href='mailto:" + email + "'>" + name + "</a>");
		out.println("</body>");
		out.println("</html>");
		
	}
}	
