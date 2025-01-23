package com.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.Dao.CandidateDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddCandidate extends AbstractController
{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String c1 = request.getParameter("c1");
		String c2 = request.getParameter("c2");
		String c3 = request.getParameter("c3");
		String c4 = request.getParameter("c4");
		
		
		ModelAndView mv1 = new ModelAndView("admin", "check", "xyz");
		
		
		String path="Z:\\adv-java 17th june 2024 5 to 8pm\\spring core\\VottingApp\\src\\main\\webapp\\WEB-INF\\spring-servlet.xml";
		ApplicationContext cxt = new FileSystemXmlApplicationContext(path);
		
		CandidateDao cDao = cxt.getBean("cDao", CandidateDao.class);
		
		if(cDao.getCCount() < 4)
		{
		cDao.insertc(c1);
		cDao.insertc(c2);
		cDao.insertc(c3);
		cDao.insertc(c4);
		}
		
		
		return mv1;
	}

}






