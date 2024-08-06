package com.example.samuraitravel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
<<<<<<< HEAD
    public Role findByName(String name);        
}
=======
	public Role findByName(String name);
}
>>>>>>> branch 'main' of https://github.com/mick309/spring-minshuku-kadai.git
