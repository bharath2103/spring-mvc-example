package com.gontuseries.hellocontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gontuseries.interceptor.FirstInterceptor;
import com.sun.rowset.FilteredRowSetImpl;

@Controller
@RequestMapping("/employee")
public class HelloController{


	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public ModelAndView modelAndView() {
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage","greetings");
		int c = 2/0;
		return modelAndView;
	}
	
	@RequestMapping(value = "/picasso", method = RequestMethod.GET)
	public ModelAndView modelAndView2() {
		
		ModelAndView modelAndView = new ModelAndView("Register");
		return modelAndView;
	}
	
	
	@ExceptionHandler(value = {Exception.class})
	public ModelAndView handleAllException() {
		ModelAndView modelAndView= new ModelAndView("error");
		return modelAndView;
	}
	
}