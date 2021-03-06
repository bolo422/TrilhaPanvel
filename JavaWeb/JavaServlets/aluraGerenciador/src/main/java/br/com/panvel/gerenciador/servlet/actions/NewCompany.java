package br.com.panvel.gerenciador.servlet.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.panvel.gerenciador.modelo.Company;
import br.com.panvel.gerenciador.modelo.DataBase;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NewCompany implements IAction{

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Cadastrando nova empresa");
		try {
			PrintWriter out = resp.getWriter();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String comName = req.getParameter("name");
		String comOpeningDate = req.getParameter("openDate");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date openDate;
		try {
			openDate = sdf.parse(comOpeningDate);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
		
		Company com = new Company(comName, openDate);
		
		DataBase db = new DataBase();
		db.add(com);
		
		return "redirect:entry?action=ListCompanies";
		
//		RequestDispatcher rd = request.getRequestDispatcher("/list-companies");
//		request.setAttribute("companyName", com.getName());
//		rd.forward(request, response);
		
	}

}
