package com.mahendra.currencyconvertor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyConvertorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvertorApplication.class, args);
	}

}
