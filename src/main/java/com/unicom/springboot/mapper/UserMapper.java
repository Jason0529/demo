package com.unicom.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.unicom.springboot.model.User;

@Mapper
public interface UserMapper {
	
	public List<User> listUser();
	
	public User findById(int id);
	
	public int deleteById(int id);
	
	public int insertUser(User user);
	
	public int updateUser(User user);
	
	public List<User> findByName(String username);
	
	public int delete(String name);
	
}
