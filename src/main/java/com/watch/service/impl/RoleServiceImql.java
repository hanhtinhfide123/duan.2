package com.watch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.dao.RoleDAO;
import com.watch.entity.Role;
import com.watch.service.RoleService;
@Service
public class RoleServiceImql implements RoleService {
	@Autowired
	RoleDAO rdao;
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return rdao.findAll();
	}

}
