package br.com.panvel.gerenciador.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.panvel.gerenciador.modelo.DataBase;
import br.com.panvel.gerenciador.servlet.actions.IAction;

@WebServlet("/companies")
public class CompaniesService extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String accept = request.getHeader("Accept");
		
		String[] params = accept.split(",");
		
		for(String param : params) {
			if(param.endsWith("json")) {
				Gson gson = new Gson();
				String json = gson.toJson(DataBase.getCompanies());
				
				response.setContentType("application/json");
				response.getWriter().print(json);
				break;
			}
			else if(param.endsWith("xml")){
				XStream xstream = new XStream();
				String xml = xstream.toXML(DataBase.getCompanies());
				
				response.setContentType("application/xml");
				response.getWriter().print(xml);
				break;
			}
		}
		
	}

}
