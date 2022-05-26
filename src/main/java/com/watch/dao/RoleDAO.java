package com.watch.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entity.Role;

public interface RoleDAO extends JpaRepository<Role, String> {

}
