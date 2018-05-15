package com.qian.part1.controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qian.part1.model.User;
import com.qian.part1.respository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> getAllUsers(){
		List<User> users=new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	public User getUser(String name) {
		return userRepository.findById(name).get();
	}

	public void addUser(User user) {
		if(user==null) {
			throw new IllegalArgumentException("Error: The user cannot be null.");
		}else if(userRepository.existsById(user.getName())) {
			throw new IllegalArgumentException("Error: The user has already existed in the system.");
		}else
			userRepository.save(user);
	}

	public void updateUser(User user, String name) {
		
		userRepository.save(user);
	}
}
