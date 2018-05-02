package com.qian.part1.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qian.part1.model.User;

@Service
public class UserService {
	
	private List<User> users=Arrays.asList(new User("Qian",new Date("02/01/1980"),19),new User("H",new Date("02/01/1990"),19));
	
	public List<User> getAllUsers(){
		return users;
	}
}
