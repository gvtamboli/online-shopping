package com.gkv.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {
	
	@RequestMapping(value="/")
	public ModelAndView initMethod() {
		System.out.println("entered");
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("msg", "greeting message test");
		return modelAndView;
	}
	
	@RequestMapping(value="/welcome")
	public ModelAndView paramMethod(@RequestParam(name="user", defaultValue="Guest") String user) {
		System.out.println("entered");
		ModelAndView modelAndView = new ModelAndView("page");
		modelAndView.addObject("msg", "Hello:"+user+", Welcome to onlineshopping");
		return modelAndView;
	}

}
