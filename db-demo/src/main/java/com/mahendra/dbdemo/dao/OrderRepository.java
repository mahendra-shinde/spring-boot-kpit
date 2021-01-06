package com.mahendra.dbdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahendra.dbdemo.models.Order;

@Repository
//Allow Spring DATA-JPA to Auto_Generate the required data-access code
//JpaRepository<ENTITYCLASS, PRIMARY-KEY-TYPE>
public interface OrderRepository extends JpaRepository<Order, Integer>{
	
}
