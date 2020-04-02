package com.superregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SuperHumanRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperHumanRegistryApplication.class, args);
	}

}
