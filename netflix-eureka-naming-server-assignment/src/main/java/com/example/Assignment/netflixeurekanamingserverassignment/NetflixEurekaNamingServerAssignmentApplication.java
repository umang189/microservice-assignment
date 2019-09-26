package com.example.Assignment.netflixeurekanamingserverassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNamingServerAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNamingServerAssignmentApplication.class, args);
	}

}
