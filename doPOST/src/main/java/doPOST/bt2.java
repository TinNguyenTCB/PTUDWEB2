package doPOST;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DoPost
 */
@WebServlet("/bt2")
public class DoPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public bt2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGET(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter traVe =response.getWriter();
		traVe.append("Bạn vừa gửi yêu vầu dạng GET, đây là đáp ứng của tôi");
		String noidungHTML="<form method = POST action=\"/dopost/DoPost\">"
				+ "				<label  >Họ:</label>"
				+ " 			<input type=\"text\" name=\"fname\"><br>\r\n"
				+ "				<label >Tên:</label>"
				+ "				<input type=\"text\" name=\"lname\"><br>"
				+ "				<input type=\"submit\" value=\"Gửi đi\">"
				+ "	</form>";
		traVe.append(noidungHTML);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPOST(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		String value1=request.getParameter("fname");
		String value2=request.getParameter("lname");
		PrintWriter traVe=response.getWriter();
		traVe.append("Bạn vừa gửi yêu cầu dạng POST,đây là đáp ứng của tôi");
		traVe.append("Giá trị tham số fname =");
		traVe.append(value1);
		traVe.append("\n giá trị tham số lname =");
		traVe.append(value2);
	}

}