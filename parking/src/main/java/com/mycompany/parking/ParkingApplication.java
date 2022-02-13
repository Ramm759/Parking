package com.mycompany.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ParkingApplication {
	public static void main(String[] args) {
		SpringApplication.run(ParkingApplication.class, args);
	}

	// Création d'un Bean de configuration qui sera injecté dans ParkinkDaoImpl, RestTemplate permet d'accéder à l'Api
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
}
