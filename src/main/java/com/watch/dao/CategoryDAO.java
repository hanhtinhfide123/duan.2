package com.watch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entity.Category;

public interface CategoryDAO  extends JpaRepository<Category, String>{

}
