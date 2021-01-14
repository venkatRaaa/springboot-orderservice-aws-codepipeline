package com.example.demo.dao;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Order;

@Repository
public class OrderDao {

	public List<Order> getOrder(){
		return Stream.of(
				new Order(101,"mobile",1,30000),
				new Order(60,"Book",4,2000),
				new Order(201,"Laptop",1,150000),
				new Order(603,"HeadSet",1,2000)).collect(Collectors.toList());
	}
}
