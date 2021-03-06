package br.com.panvel.gerenciador.servlet.actions;

import java.io.IOException;

import br.com.panvel.gerenciador.modelo.DataBase;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RemoveCompany implements IAction{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		DataBase.delCompany(Integer.valueOf(req.getParameter("id")));
		return "redirect:entry?action=ListCompanies";
	}

}
