package br.com.panvel.gerenciador.servlet.actions;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.panvel.gerenciador.modelo.Company;
import br.com.panvel.gerenciador.modelo.DataBase;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EditCompany implements IAction{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		//Company com = DataBase.getCompanyWithID(1);//(Company)request.getAttribute("company");
		String strID = req.getParameter("id");
		if(strID.isBlank()){throw new RuntimeException("ID can not be blank or empty");}
		
		Company com = DataBase.getCompanyWithID(Integer.valueOf(strID));
		String newName = req.getParameter("newName");
		
		String newOpenDate = req.getParameter("newOpenDate");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date openDate;
		try {
			openDate = sdf.parse(newOpenDate);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		
		com.setName((newName.isBlank()) ? com.getName() : newName);
		com.setDate((newOpenDate.isBlank()) ? com.getOpeningDate() : openDate);
		
		return "redirect:entry?action=ListCompanies";
		
	}

}
