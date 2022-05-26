package com.watch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.watch.dao.OrderDetailDAO;
import com.watch.entity.Order;
import com.watch.entity.OrderDetail;
import com.watch.service.OrderDetailService;
@Service
public class OrderDetailServiceImql implements OrderDetailService{
	@Autowired
	OrderDetailDAO oddao;
	@Override
	public OrderDetail findById(Long id) {
		// TODO Auto-generated method stub
		return oddao.findById(id).get();
	}
	@Override
	public List<OrderDetail> findAll() {
		// TODO Auto-generated method stub
		return oddao.findAll();
	}
	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		oddao.deleteById(id);
	}


}
