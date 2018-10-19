package com.unicom.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unicom.springboot.mapper.UserMapper;
import com.unicom.springboot.model.User;

@Service
public class UserService {
	
	// 自动注入
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getall(){
		return userMapper.listUser();
	}
	
	
}
