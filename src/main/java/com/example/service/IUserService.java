package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.User;

public interface IUserService {
	
	public List<User> findByName(String name);
    public Optional<User> findByUserId(Long id);
    public User save(User user);
}
