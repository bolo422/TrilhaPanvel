package br.com.panvel.gerenciador.servlet.actions;

import java.io.IOException;
import java.util.List;

import br.com.panvel.gerenciador.modelo.Company;
import br.com.panvel.gerenciador.modelo.DataBase;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListCompanies implements IAction{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		List<Company> list = DataBase.getCompanies();
		req.setAttribute("comList", list);
		return "forward:listCompanies.jsp";
		
	}

}
