package Cars_Collection.Controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Cars_Collecttion.Model.DatabaseConnection;
import Cars_Collecttion.Model.Login;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String emailId = request.getParameter("emailId");
			String password = request.getParameter("password");
			DatabaseConnection db = new DatabaseConnection();
			Connection con = db.databaseConnection();
			Login lg = new Login();
			Boolean results = lg.login(emailId, password, con);
			HttpSession session = request.getSession(true);
			if (results == true) {
				session.setAttribute("emailId", emailId);
				RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/HomePage.jsp");
				rd.forward(request, response);

			} else {
				request.setAttribute("errormsg", "invalid Email Id/Password");
				RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
