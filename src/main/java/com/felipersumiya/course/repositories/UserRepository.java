package com.felipersumiya.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipersumiya.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
