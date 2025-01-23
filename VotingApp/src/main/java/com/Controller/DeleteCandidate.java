package com.Controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.Dao.CandidateDao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeleteCandidate extends AbstractController
{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		
		
		ModelAndView mv1 = new ModelAndView("admin", "check", "xyz");
		
		
		String path="Z:\\adv-java 17th june 2024 5 to 8pm\\spring core\\VottingApp\\src\\main\\webapp\\WEB-INF\\spring-servlet.xml";
		ApplicationContext cxt = new FileSystemXmlApplicationContext(path);
		
		cxt.getBean("cDao", CandidateDao.class).deleteAllC();
		
		
		return mv1;
	}

}






