package com.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.Dao.UserDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Register extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String uname = request.getParameter("uname");
		String upass= request.getParameter("upass");
		String uage= request.getParameter("uage");
		
		ModelAndView mv1 = new ModelAndView("login");//("ff")::similar to mv.setViewName
		ModelAndView mv2 = new ModelAndView("signup", "msg", "Under age");//("","@@","@@")::@@ is similar to mv.addObject

		String path = "E:\\Advance_Java_17_06_24\\Spring_Core\\VotingApp\\src\\main\\webapp\\WEB-INF\\spring-servlet.xml";
		ApplicationContext cxt = new FileSystemXmlApplicationContext(path);		
		
		if(Integer.valueOf(uage)>=18) {
			cxt.getBean("uDao", UserDao.class).addUser(uname, upass, uage);
			return mv1;
		}
		
		else {
			return mv2;
		}		
	}	
}