package com.mahendra.demoweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// WebController, it returns TEMPLATE page instead JSON values
@Controller 
public class HomeController {

	@GetMapping("/")
	public String home(Model map) {
		//Using CoC, spring would try to load index.html from /src/main/resources/templates/
		map.addAttribute("msg","Hello world!");
		return "index";
	}
	
	@PostMapping("/")
	public String formSubmit(Model map,@RequestParam("uname") String name) {
		map.addAttribute("msg","Hello "+name);
		return "index";
	}
}
