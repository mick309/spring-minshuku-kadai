package com.example.samuraitravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import src.main.java.com.example.samuraitravel.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	public Role findByName(String name);
}