package br.com.figueiredoisaac.TelaLogin;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.figueiredoisaac.DBConection.DAO.UserDAO;
import br.com.figueiredoisaac.DBConection.bean.User;

/**
 * Servlet implementation class LoginUserServlet
 */
@WebServlet("/LoginUser")
public class LoginUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("usuario");
		System.out.println(userName);
		String userPassword = request.getParameter("senha");
		System.out.println(userPassword);
		
		UserDAO dao = new UserDAO();
		
		List<User> listaUsuarios = null;
		
		try {
			listaUsuarios = dao.Select();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		String urlred = "/index.jsp";
		for (User u : listaUsuarios) {
			if(userName.contentEquals(u.getUser())){
				if(userPassword.contentEquals(u.getPassword())){
					urlred = "loginSucesso.jsp";
				}
			}
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(urlred);
		rd.forward(request, response);
		
	}

}
