package br.com.panvel.gerenciador.servlet.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

public class TimeMonitoringFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,  FilterChain chain) throws IOException, ServletException {
		//System.out.println("TimeMonitoringFilter");

		long antes = System.currentTimeMillis();
		
		String action = request.getParameter("action");
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis();
		//System.out.println("Tempo de execução da ação " + action + " -> " + (depois-antes));
		
		
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

}
