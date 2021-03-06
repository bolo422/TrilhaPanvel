package br.com.panvel.gerenciador.servlet.actions;

import java.io.IOException;

import br.com.panvel.gerenciador.modelo.Company;
import br.com.panvel.gerenciador.modelo.DataBase;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class CompanyEditor implements IAction{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		Company com = DataBase.getCompanyWithID(Integer.valueOf(req.getParameter("id")));
		req.setAttribute("company", com);
		return "forward:companyEditor.jsp";
	}

}
