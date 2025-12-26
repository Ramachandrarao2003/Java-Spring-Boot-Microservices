package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Project5IplTeamServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project5IplTeamServiceApplication.class, args);
	}

}
