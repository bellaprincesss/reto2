package com.ciclo4Retos.Reto2;

import com.ciclo4Retos.Reto2.repository.crud.FootwearsCrudRepository;
import com.ciclo4Retos.Reto2.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
//@EnableConfigurationProperties
public class Reto2Application implements CommandLineRunner{

	@Autowired
	private FootwearsCrudRepository footwearsCrudRepository;
	@Autowired
	private UserCrudRepository userCrudRepository;

	public static void main(String[] args) {
		SpringApplication.run(Reto2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		footwearsCrudRepository.deleteAll();
		userCrudRepository.deleteAll();
	}
}
