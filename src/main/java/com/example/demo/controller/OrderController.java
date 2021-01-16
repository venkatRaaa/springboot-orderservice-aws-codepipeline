package com.example.demo.controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.OrderDao;
import com.example.demo.model.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderDao orderDao;

	@GetMapping
	public List<Order> getOrders() {
		return orderDao.getOrder().stream().sorted(Comparator.comparing(Order::getPrice)).collect(Collectors.toList());
	}

}
