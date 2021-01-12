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
		
		this.userRepository.save(new User(1, "Akash", "Gopinath", "akash@goal.com"));
		this.userRepository.save(new User(2, "Nitheesh", "Gopinath", "nitheesh@goal.com"));
		
	}

}
