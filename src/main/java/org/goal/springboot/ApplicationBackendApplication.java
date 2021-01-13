package org.goal.springboot;

import org.goal.springboot.model.User;
import org.goal.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ApplicationBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.userRepository.save(new User(1, "Paul", "Antony", "paul@spring.com"));
		this.userRepository.save(new User(2, "Harry", "Tolety", "harry@spring.com"));
		this.userRepository.save(new User(3, "James", "Grey", "james@spring.com"));
		
	}

}
