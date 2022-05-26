package com.watch.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.dao.CategoryDAO;
import com.watch.entity.Category;
import com.watch.service.CategoryService;

@Service
public class CategoryServiceImql implements CategoryService {
	@Autowired
	CategoryDAO cdao;
	
	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return cdao.findAll();
	}

	@Override
	public Category findById(String id) {
		// TODO Auto-generated method stub
		return cdao.findById(id).get();
	}

	@Override
	public Category create(Category category) {
		// TODO Auto-generated method stub
		return cdao.save(category);
	}

	@Override
	public Category update(Category category) {
		// TODO Auto-generated method stub
		return cdao.save(category);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		cdao.deleteById(id);
	}


}
