package com.example.demo.user;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entity.User;
import com.example.repository.UserRepository;
import com.example.service.IUserService;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserTest {

	@Autowired
    private TestEntityManager entityManager;
	
	@Autowired
	private IUserService userService;
	
	@Test
	public void saveUserTest() {
		User user1 = new User(123L,"bouzga","59",BigDecimal.valueOf(15000));
		User userSaved = userService.save(user1);
		assertThat(userSaved.getName()).isEqualTo("bouzga");
	}
}
