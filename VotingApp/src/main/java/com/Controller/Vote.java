package com.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.Dao.VoteDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Vote extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String cname = request.getParameter("candidatename");
		String uname = request.getParameter("uname");
		
		String path = "E:\\Advance_Java_17_06_24\\Spring_Core\\VotingApp\\src\\main\\webapp\\WEB-INF\\spring-servlet.xml";
		ApplicationContext cxt = new FileSystemXmlApplicationContext(path);
		
		int res=cxt.getBean("vDao", VoteDao.class).addVote(cname, uname);
		
		
		ModelAndView mv1 = new ModelAndView("vote", "msg", "vote submited");
		ModelAndView mv2 = new ModelAndView("vote", "msg", "already exists");
		if(res == 1)
		{
			request.setAttribute("check", uname);
			return mv1;
		}
		else
		{
			request.setAttribute("check", uname);
			return mv2;
		}
		
	}

}
