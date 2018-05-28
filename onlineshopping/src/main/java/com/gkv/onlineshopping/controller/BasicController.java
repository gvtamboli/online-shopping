package com.gkv.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gkv.shoppingbackend.dao.CategoryDAO;

@Controller
public class BasicController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value= {"/","/home","index"})
	public ModelAndView index() {
		ModelAndView view = new ModelAndView("page");
		view.addObject("title","Home");
		view.addObject("userClickHome", true);
		view.addObject("listProducts", categoryDAO.getList());
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
