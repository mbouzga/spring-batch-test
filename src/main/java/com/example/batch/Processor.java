package com.example.batch;

import java.util.Optional;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.UserService;

@Component
public class Processor implements ItemProcessor<User, User> {

	@Autowired
	private UserService userService;

	@Override
	public User process(User user) throws Exception {
		Optional<User> userFromDb = userService.findByUserId(user.getUserId());
		if(userFromDb.isPresent()) {
			user.setAccount(user.getAccount().add(userFromDb.get().getAccount()));
		}
		return user;
	}

}
