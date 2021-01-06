package com.mahendra.demo.controllers;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	// ACCESS URL: http://localhost:8080/
	@GetMapping(value="/",produces="application/xml")
	public Message welcome() {
		return new Message("Welcome to Spring boot","BootApplication");
	}
}

//Plain Old Java Object (POJO)
@XmlRootElement
class Message{
	private Date date;
	private String text;
	private String sender;
	

	public void setDate(Date date) {
		this.date = date;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public Message() { } 
	
	public Message(String text, String sender) {
		this.date = new Date();
		this.text = text;
		this.sender = sender;
	}
	
	public String getSender() {
		return this.sender;
	}
	
	public String getText() {
		return text;
	}
	
	public Date getDate() {
		return date;
	}
	
}