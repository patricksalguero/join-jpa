package com.psalguero.jpa.demojpajoins;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.psalguero.jpa.demojpajoins.models.User;
import com.psalguero.jpa.demojpajoins.models.UserLevel;
import com.psalguero.jpa.demojpajoins.repositories.UserLevelRepository;
import com.psalguero.jpa.demojpajoins.repositories.UserRepository;

@SpringBootApplication
public class DemoJpaJoinsApplication implements CommandLineRunner{

	@Autowired
	private UserLevelRepository userLevelRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoJpaJoinsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		UserLevel level24 = new UserLevel();
		level24.setCode("24");
		level24.setDescription("Gerente Asistente");

		userLevelRepository.save(level24);
		
		UserLevel levelRf05 = new UserLevel();
		levelRf05.setCode("05");
		levelRf05.setDescription("Representante Financiero Senior");
		
		userLevelRepository.save(levelRf05);
		
		User user1 = new User();
		user1.setCreated(LocalDateTime.now());
		user1.setName("Patrick Armando");
		user1.setLastname("Salguero Avalos");
		user1.setLevel(level24);
		
		User user2 = new User();
		user2.setCreated(LocalDateTime.now());
		user2.setName("Bill");
		user2.setLastname("Gates");
		user2.setLevel(levelRf05);

	
		userRepository.save(user1);
		userRepository.save(user2);
		
		System.out.println(userRepository.findById(2L));
		
	}
}
