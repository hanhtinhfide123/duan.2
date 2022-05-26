package com.watch.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.watch.entity.Order;
import com.watch.entity.Product;

public interface OrderService {



	Order create(JsonNode orderData);

	Order findById(Long id);

	List<Order> findByUsername(String username);

	List<Order> findAll();

	Order update(Order order);

	void delete(Long id);

}
