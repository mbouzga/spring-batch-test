package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

import lombok.Data;

@Service
public class UserService implements IUserService{

	@Autowired
	UserRepository userRepo;
	
	@Override
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findByUserId(Long id) {
		return userRepo.findById(id);
	}

	@Override
	public User save(User user) {
		return userRepo.save(user);
	}

	
}
