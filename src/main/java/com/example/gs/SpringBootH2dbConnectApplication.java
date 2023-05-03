package com.example.gs;

import com.example.gs.entities.User;
import com.example.gs.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootH2dbConnectApplication {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2dbConnectApplication.class, args);
	}


	@PostConstruct
	public void insertData() {
		this.userService.save(new User("Gaurav"));
		this.userService.save(new User("Rachana"));
		this.userService.save(new User("Rashmi"));
	}

}
