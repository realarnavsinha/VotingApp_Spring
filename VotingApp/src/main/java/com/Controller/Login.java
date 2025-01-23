package com.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.Dao.CandidateDao;
import com.Dao.UserDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends AbstractController
{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		
		
		ModelAndView mv1 = new ModelAndView("vote", "check", uname);
		ModelAndView mv2 = new ModelAndView("login", "msg", "Invalid Credentials");
		
		String path="Z:\\adv-java 17th june 2024 5 to 8pm\\spring core\\VottingApp\\src\\main\\webapp\\WEB-INF\\spring-servlet.xml";
		ApplicationContext cxt = new FileSystemXmlApplicationContext(path);
		
		CandidateDao cDao = cxt.getBean("cDao", CandidateDao.class);
		
		String res=cxt.getBean("uDao", UserDao.class).checkUser(uname, upass);
		if(res.equals("exists"))
		{
			request.getSession().setAttribute("l",cDao.readAllC());
			return mv1;
		}
		else
		{
			return mv2;
		}
		
	}

}
