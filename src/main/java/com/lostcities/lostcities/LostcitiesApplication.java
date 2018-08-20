package com.lostcities.lostcities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class LostcitiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LostcitiesApplication.class, args);
	}
}
