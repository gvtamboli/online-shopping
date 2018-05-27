package com.gkv.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {
	
	@RequestMapping(value= {"/","/home","index"})
	public ModelAndView index() {
		System.out.println("entered");
		ModelAndView view = new ModelAndView("page");
		view.addObject("title","Home");
		view.addObject("userClickHome", true);
		return view;
	}

	@RequestMapping(value="/about")
	public ModelAndView about(){
		ModelAndView view = new ModelAndView("page");
		view.addObject("title","About Us");
		view.addObject("userClickAbout", true);
		return view;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		ModelAndView view = new ModelAndView("page");
		view.addObject("title","Contact us");
		view.addObject("userClickContact", true);
		return view;
	}

}
