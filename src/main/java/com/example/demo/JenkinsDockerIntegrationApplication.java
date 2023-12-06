package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsDockerIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsDockerIntegrationApplication.class, args);
		System.out.println("J-D-I");
		System.out.println("JAVA");
	}

}
