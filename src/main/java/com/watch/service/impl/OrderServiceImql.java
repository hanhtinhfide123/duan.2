package com.watch.service.impl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.watch.dao.OrderDAO;
import com.watch.dao.OrderDetailDAO;
import com.watch.entity.Order;
import com.watch.entity.OrderDetail;
import com.watch.entity.Product;
import com.watch.service.OrderService;

@Service
public class OrderServiceImql implements OrderService {
	@Autowired
	OrderDAO odao;
	@Autowired
	OrderDetailDAO ddao;
	@Override
	public Order create(JsonNode orderData) {
		ObjectMapper mapper= new ObjectMapper();
		Order order = mapper.convertValue(orderData, Order.class);
		odao.save(order);
		TypeReference<List<OrderDetail>> type =new TypeReference<List<OrderDetail>>() {};
		List<OrderDetail> details=mapper.convertValue(orderData.get("orderDetails"),type )
				.stream().peek(d ->d.setOrder(order)).collect(Collectors.toList());
		ddao.saveAll(details);
		return order;
		
	}
	@Override
	public Order findById(Long id) {
		// TODO Auto-generated method stub
		return odao.findById(id).get();
	}
	@Override
	public List<Order> findByUsername(String username) {
		// TODO Auto-generated method stub
		return odao.findByUsername(username);
	}
	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return odao.findAll();
	}
	@Override
	public Order update(Order Order) {
		// TODO Auto-generated method stub
		return odao.save(Order);
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		odao.deleteById(id);
	}

}
