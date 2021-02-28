package Cars_Collection.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Cars_Collecttion.Model.DatabaseConnection;
import Cars_Collecttion.Model.Database_Logics;

@WebServlet("/ShowRegistrationsController")
public class ShowRegistrationsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowRegistrationsController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("emailId")!=null) {
		try {
			DatabaseConnection db = new DatabaseConnection();
			Connection con = db.databaseConnection();
			Database_Logics dbLogics = new Database_Logics();
			ResultSet results = dbLogics.displayCars(con);
			request.setAttribute("results", results);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/ShowCars.jsp");
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}else {
			request.setAttribute("errormsg", "invalid Email Id/Password");
			RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");
			rd.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
