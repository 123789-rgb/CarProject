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
import Cars_Collecttion.Model.Database_Logics;

@WebServlet("/NewRegistrationController")
public class NewRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewRegistrationController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session.getAttribute("emailId")!=null) {
		try {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/NewRegistrations.jsp");
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
		HttpSession session = request.getSession(false);
		if(session.getAttribute("emailId")!=null) {
		try {
			String company = request.getParameter("company");
			String model = request.getParameter("model");
			String color = request.getParameter("color");
			String date = request.getParameter("date");
			String price1 = request.getParameter("price");
			int price = Integer.parseInt(price1);
			String engineCapacity = request.getParameter("engineCapacity");
			String licencePlateNumber = request.getParameter("licencePlateNumber");
			String seating = request.getParameter("seatingCapacity");
			int seatingCapacity = Integer.parseInt(seating);
			String priceRange = request.getParameter("priceRange");	
			String year = request.getParameter("year");
			DatabaseConnection db = new DatabaseConnection();
			Connection con = db.databaseConnection();
			Database_Logics dbLogics = new Database_Logics();
			dbLogics.addNewCar(company, model, color, date, price, engineCapacity, licencePlateNumber, seatingCapacity,
					priceRange,year,con);
			request.setAttribute("msg1", "data is inserted");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/NewRegistrations.jsp");
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

}
