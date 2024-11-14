package com.service.registry.servicRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServicRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicRegistryApplication.class, args);
	}

}
