package com.mahendra.sample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HomeController {

	@Autowired private RestTemplate template;
	
	@GetMapping("/")
	public String requestConversion() {
		
		String from = "USD";
		String to="INR";
		Double amount=1000D;
		// @LoadBalancer would translate this "http://currency-service/convert..."
		// Into "http://localhost:9000/convert..."
		String result = template.getForObject("http://currency-service/convert?from="+from+"&to="+to+"&amount="+amount,String.class);
		
		return result;	
	}
	
	
}

