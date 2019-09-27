package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository(value="userRepo")
public interface UserRepository extends CrudRepository<User, Long> {

	public List<User> findByName(String name);
	 
    public Optional<User> findByUserId(Long id);
}
