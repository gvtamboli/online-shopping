package com.gkv.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {
	
	@RequestMapping(value="/")
	public ModelAndView initMethod() {
		System.out.println("entered");
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("message", "greeting message test");
		return modelAndView;
	}

}
