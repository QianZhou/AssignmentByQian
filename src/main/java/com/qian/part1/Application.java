package com.qian.part1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qian.part1.model.User;
import com.qian.part1.respository.UserRepository;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	@RequestMapping("/")
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UserRepository repository) {
		return (args) -> {
			// save a couple of users
			repository.save(new User("Jack", "1/1/1985",33));
			repository.save(new User("Chloe", "2/1/1980",38));
			repository.save(new User("Kim", "3/1/1970",48));
			repository.save(new User("David", "6/1/1995",23));
			repository.save(new User("Michelle", "1/13/1990",28));

			// fetch all users
			log.info("User found with findAll():");
			log.info("-------------------------------");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
			log.info("");

		
			// fetch users by name
			log.info("User found with findByName('Kim'):");
			log.info("--------------------------------------------");
			repository.findByName("Kim").forEach(kim -> {
				log.info(kim.toString());
			});
			log.info("");
		};
	}

}


