package com.mahendra.dbdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.dbdemo.dao.OrderRepository;
import com.mahendra.dbdemo.models.Order;

@RestController

public class OrderController {

	@Autowired private OrderRepository orderRepo;
	
	@GetMapping("/")
	public List<Order> getAll(){
		return orderRepo.findAll();
	}
	
	@GetMapping("/order-{ID}")
	public Order findById(@PathVariable("ID") Integer id)
	{
		return orderRepo.findById(id).get();
	}
}
