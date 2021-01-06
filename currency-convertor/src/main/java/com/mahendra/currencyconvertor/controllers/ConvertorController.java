package com.mahendra.currencyconvertor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertorController {

	@GetMapping("/convert")
	public String convert(@RequestParam("from") String fromCurrency, @RequestParam("to") String toCurrency, @RequestParam("amount") double amount )
	{
		double amt = 0;
		if(fromCurrency.equalsIgnoreCase("usd") && toCurrency.equalsIgnoreCase("inr")) {
			amt = amount * 74.3D;
		}
		else if(fromCurrency.equalsIgnoreCase("inr") && toCurrency.equalsIgnoreCase("usd")) {
			amt = amount / 74.3D;
		}
		System.out.println("Processing request to convert "+amount+" into "+toCurrency+" Currency");
		return " "+amt;
	}
}
