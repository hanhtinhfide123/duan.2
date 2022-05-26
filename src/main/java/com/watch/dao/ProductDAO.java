package com.watch.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.watch.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Integer>{
	List<Product> findByNameContaining(String name);

	@Query("SELECT p FROM Product p WHERE p.category.id=?1")
	List<Product> findByCategoryId(String cid);

	@Query("SELECT p FROM Product p "
			+ " WHERE p.name LIKE %:kw% OR p.category.name LIKE %:kw%")
	List<Product> findByKeywords(@Param("kw") String keywords);
	
}
