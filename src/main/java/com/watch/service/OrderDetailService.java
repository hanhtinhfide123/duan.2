package com.watch.service;

import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.watch.dao.OrderDetailDAO;
import com.watch.entity.Category;
import com.watch.entity.Order;
import com.watch.entity.OrderDetail;

public interface OrderDetailService {

	OrderDetail findById(Long id);

	List<OrderDetail> findAll();

	void delete(Long id);

	
}
