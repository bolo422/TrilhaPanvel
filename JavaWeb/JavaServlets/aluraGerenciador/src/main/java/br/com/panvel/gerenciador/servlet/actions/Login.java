package br.com.panvel.gerenciador.servlet.actions;

import br.com.panvel.gerenciador.modelo.DataBase;
import br.com.panvel.gerenciador.modelo.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class Login implements IAction {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		System.out.println("login: "  + login + "\npass: " + password);
		
		User user = DataBase.validadeLogin(login, password);
		if(user != null)
		{
			HttpSession session = req.getSession();
			session.setAttribute("loggedUser", user);
			return "redirect:entry?action=ListCompanies";
		}
		
		return "redirect:entry?action=LoginForm";
	}

}
