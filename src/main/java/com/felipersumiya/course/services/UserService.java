package com.felipersumiya.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipersumiya.course.entities.User;
import com.felipersumiya.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> findAll(){
		
		return userRepository.findAll();
		
	}
	
	
}
