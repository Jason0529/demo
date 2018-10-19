package com.unicom.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicom.springboot.model.User;
import com.unicom.springboot.service.UserService;

@EnableAutoConfiguration
@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/getall")
	public List<User> getUser(){
//		User user = new User();
//		user.setUsername("张三");
//		user.setUserpwd("123456");
//		return user;
		return userService.getall();
	}
	

}
