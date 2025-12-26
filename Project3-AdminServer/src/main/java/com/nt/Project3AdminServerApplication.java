package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Project3AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project3AdminServerApplication.class, args);
	}

}
