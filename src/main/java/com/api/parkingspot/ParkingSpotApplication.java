package com.api.parkingspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ParkingSpotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingSpotApplication.class, args);
	}

	@GetMapping
	public String Hello(){
		return "Olá mundo!";
	}
}
