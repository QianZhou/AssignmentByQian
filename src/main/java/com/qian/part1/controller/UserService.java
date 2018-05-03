package com.qian.part1.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.qian.part1.model.User;

@Service
public class UserService {
	
	private List<User> users=new ArrayList<>(Arrays.asList(new User("Luke","01/01/1980",38),new User("Betty","06/21/1990",28)));
	
	public List<User> getAllUsers(){
		return users;
	}
	
	public User getUser(String name) {
		return users.stream().filter(t->t.getName().equals(name)).findFirst().get();
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		users.add(user);
	}
}
