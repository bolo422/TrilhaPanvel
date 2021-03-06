package br.com.panvel.gerenciador.servlet.actions;

import java.io.IOException;

import br.com.panvel.gerenciador.modelo.DataBase;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ChangeOrder implements IAction{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp){
		Integer id = Integer.valueOf(req.getParameter("id"));
		Boolean moveUp = Boolean.valueOf(req.getParameter("up"));
		DataBase.changeOrder(moveUp, id);		
		return "redirect:entry?action=ListCompanies";
		
	}

}
