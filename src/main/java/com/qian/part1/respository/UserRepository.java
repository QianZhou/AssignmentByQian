package com.qian.part1.respository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.qian.part1.model.User;

public interface UserRepository extends CrudRepository<User,String>{
	 List<User> findByName(String name);
}
