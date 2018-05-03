package com.qian.part1.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qian.part1.model.User;

@RestController
public class UserController {
	
	@Autowired
	private UserService usrService;
	
	@RequestMapping("/users")
	public List<User> getAllUsers() {
		return usrService.getAllUsers();
	}
	
	@RequestMapping("/{name}/age")
	public String getUser(@PathVariable String name) {
		return "Name:"+name+"   Age:"+usrService.getUser(name).getAge();
	}
}
