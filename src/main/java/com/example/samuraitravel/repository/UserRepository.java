package com.example.samuraitravel.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.User;

<<<<<<< HEAD
public interface UserRepository extends JpaRepository<User, Integer> {	
    public User findByEmail(String email);
    public Page<User> findByNameLikeOrFuriganaLike(String nameKeyword, String furiganaKeyword, Pageable pageable);
}
=======
public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByEmail(String email);

	public Page<User> findByNameLikeOrFuriganaLike(String nameKeyword, String furiganaKeyword, Pageable pageable);
}
>>>>>>> branch 'main' of https://github.com/mick309/spring-minshuku-kadai.git
