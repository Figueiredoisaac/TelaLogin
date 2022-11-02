package br.com.figueiredoisaac.TelaLogin;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.figueiredoisaac.DBConection.DAO.UserDAO;
import br.com.figueiredoisaac.DBConection.bean.User;

/**
 * Servlet implementation class CadastrarUserServlet
 */
@WebServlet("/CadastrarUser")
public class CadastrarUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("novo-usuario");
		System.out.println(userName);
		String userPassword = request.getParameter("nova-senha");
		System.out.println(userPassword);
		String passwordConf = request.getParameter("confirmar-senha");
		System.out.println(passwordConf);
		
		if(userPassword.contentEquals(passwordConf)) {
			User user = new User(userName, userPassword);
			UserDAO dao = new UserDAO();
			try {
				dao.Insert(user);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);

	}

}
