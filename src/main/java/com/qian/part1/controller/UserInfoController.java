package com.qian.part1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class UserInfoController {
	@Autowired
	private UserService usrService;
	
	@RequestMapping(method=RequestMethod.GET,value="/user/{name}")
	public String getUserInfo(Model model,@PathVariable String name) {
		model.addAttribute("name", name);
		model.addAttribute("birthday",usrService.getUser(name).getBirthday());
		model.addAttribute("age",usrService.getUser(name).getAge());
		return "userInfo";
	}
}
