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
	 * GET ȣ�� ��
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("TEST?");
		process(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * POST ȣ�� ��
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		PrintWriter out = res.getWriter();
		
		// request.getParameter
		// request �� �������� name �� �ش��ϴ� ���� �о��
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		// response ���������� �ۼ�
		out.println("<html>");
		out.println("<head><title>����ó</title></head>");
		out.println("<body>");
		out.println("<h3>����ó</h3>");
		out.println("<a href='mailto:" + email + "'>" + name + "</a>");
		out.println("</body>");
		out.println("</html>");
		
	}
}	
