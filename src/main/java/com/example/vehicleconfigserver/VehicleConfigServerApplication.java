package com.example.vehicleconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class VehicleConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleConfigServerApplication.class, args);
	}

}
