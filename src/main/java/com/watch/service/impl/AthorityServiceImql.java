package com.watch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.dao.AccountDAO;
import com.watch.dao.AuthorityDAO;
import com.watch.entity.Account;
import com.watch.entity.Authority;
import com.watch.service.AthorityService;

@Service
public class AthorityServiceImql  implements AthorityService{
	@Autowired
	AuthorityDAO adao;
	@Autowired
	AccountDAO acdao;

	@Override
	public List<Authority> findAuthoritiesOfAdministrators() {
		// TODO Auto-generated method stub
		List<Account> accounts =acdao.getAdministrators();
		return adao.authritiesOf(accounts);
	}

	@Override
	public List<Authority> findAll() {
		// TODO Auto-generated method stub
		return adao.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		adao.deleteById(id);
	}

	@Override
	public Authority create(Authority auth) {
		// TODO Auto-generated method stub
		return adao.save(auth);
	}
	
}
