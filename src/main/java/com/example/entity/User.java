package com.example.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User {

	@Id
	private Long userId;

	private String name;

	private String dept;

	private BigDecimal account;

	public User() {
		super();
	}
	
	public User(Long userId, String name, String dept, BigDecimal account) {
		super();
		this.userId = userId;
		this.name = name;
		this.dept = dept;
		this.account = account;
	}

}
