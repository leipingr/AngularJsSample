package com.cup.rest;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class CORSFilter implements Filter {

	
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		((HttpServletResponse)response).addHeader("Access-Control-Allow-Origin", "*");
		chain.doFilter(request, response);
	}

	
	public void destroy() {
		
	}

}
