package com.springboot.helloworld.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {
	@RequestMapping("/get/snacks")
	public String welcome()
	{
		return "Go";
	}

}
