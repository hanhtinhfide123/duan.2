package com.watch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{

}
