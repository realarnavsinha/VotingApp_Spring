package com.Controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AdminLogin extends AbstractController
{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String id = request.getParameter("uname");
		String upass = request.getParameter("upass");
		
		ModelAndView mv1 = new ModelAndView("admin" ,"check", id);
		ModelAndView mv2 = new ModelAndView("adminlogin", "msg", "Invalid Credential");
		
		if(id.equals("xyz") && upass.equals("pass@123"))
		{
			return mv1;
		}
		else
		{
			return mv2;
		}
	}

}
