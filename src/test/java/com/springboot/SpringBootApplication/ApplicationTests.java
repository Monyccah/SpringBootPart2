package com.springboot.SpringBootApplication;

import com.springboot.SpringBootApplication.model.User;
import com.springboot.SpringBootApplication.repo.FakeRepo;
import com.springboot.SpringBootApplication.services.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
class ApplicationTests {

	@Autowired
	UserServiceImpl userServiceImpl;

	@Test
	void contextLoads() {
	}

	@Test
	public void addUserTest(){
		userServiceImpl.addUser("Monica", "Hello");
	}
	@Test
	public void removeUserTest(){
		userServiceImpl.removeUser(0);



	}
	@Test
	public void getUserTest(){

		for (int i = 0; i < 4; i++){
			userServiceImpl.getUser(1);
		}


	}

	@Test
	public void testSecurity(){
		TestRestTemplate testRestTemplate = new TestRestTemplate("user", "password");
	//	ResponseEntity<String> response = testRestTemplate.getForEntity("/user", String.class);
	}


}
