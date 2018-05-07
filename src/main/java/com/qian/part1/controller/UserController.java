package com.qian.part1.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public String getUserAge(@PathVariable String name) {
		return "Name:"+name+" Age:"+usrService.getUser(name).getAge();
	}
	
	@RequestMapping("/{name}/birthday")
	public String getUserBirthday(@PathVariable String name) {
		return "Name:"+name+" Birthday:"+usrService.getUser(name).getBirthday();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/user")
	public void addUser(@RequestBody User user) {
		usrService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/user/{name}")
	public void updateUser(@RequestBody User user,@PathVariable String name) {
		usrService.updateUser(user,name);
	}
}
