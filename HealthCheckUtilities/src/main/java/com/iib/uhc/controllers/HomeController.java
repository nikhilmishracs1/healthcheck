package com.iib.uhc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping
public class HomeController {
	
	
		
	@RequestMapping("/")
	public String Home() {
		
		return "/main/home";
	}

}