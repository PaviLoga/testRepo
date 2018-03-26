package com.pack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class employeecontroller {

	@RequestMapping("/empform")
	public ModelAndView showform() {

		return new ModelAndView("empform", "command", new employee());
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("emp") employee emp) {

		System.out.println(emp.getName() + " " + emp.getSalary() + " " + emp.getDesignation());

		return new ModelAndView("success");
	}

	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView welcome() {

		return new ModelAndView("index");

	}

}
