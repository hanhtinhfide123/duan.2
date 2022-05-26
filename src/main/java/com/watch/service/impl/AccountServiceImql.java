package com.watch.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.watch.dao.AccountDAO;
import com.watch.entity.Account;
import com.watch.service.AccountService;

@Service
public class AccountServiceImql implements AccountService {
	@Autowired
	private AccountDAO adao;

	
	@Override
	public Account findById(String username) {
		// TODO Auto-generated method stub
		return adao.findById(username).get();
	}

	@Override
	public List<Account> getAdministrators() {
		// TODO Auto-generated method stub
		return adao.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return adao.findAll();
	}

	@Override
	public Account create(Account account) {
		// TODO Auto-generated method stub
		return adao.save(account);
	}

	@Override
	public Account update(Account account) {
		// TODO Auto-generated method stub
		return adao.save(account);
	}

	@Override
	public void delete(String username) {
		// TODO Auto-generated method stub
		adao.deleteById(username);
	}
	
}
