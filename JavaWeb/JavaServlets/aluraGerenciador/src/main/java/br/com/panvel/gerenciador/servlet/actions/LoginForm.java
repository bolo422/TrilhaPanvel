package br.com.panvel.gerenciador.servlet.actions;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginForm implements IAction {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		return "forward:formLogin.jsp";
	}

}
