package com.adanh.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adanh.ws.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	

}
