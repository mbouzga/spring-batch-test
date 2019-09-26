package com.example.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Component
public class Writer implements ItemWriter<User> {

	@Autowired
	private UserRepository repo;

	@Override
	@Transactional
	public void write(List<? extends User> users) throws Exception {
		repo.saveAll(users);
	}

}
