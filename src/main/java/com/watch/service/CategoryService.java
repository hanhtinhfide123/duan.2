package com.watch.service;

import java.util.List;
import java.util.Optional;

import com.watch.entity.Category;

public interface CategoryService {

	List<Category> findAll();

	Category findById(String id);

	Category create(Category category);

	Category update(Category category);

	void delete(String id);




}
