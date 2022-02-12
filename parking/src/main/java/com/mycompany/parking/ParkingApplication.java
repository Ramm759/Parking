package com.mycompany.parking;

import com.mycompany.parking.controllers.ParkingController;import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingApplication {
	public static void main(String[] args) {
		SpringApplication.run(ParkingController.ParkingApplication.class, args);
	}

}
