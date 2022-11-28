package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Excluding Data Source Auto Configuration
// @SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
public class EazySchoolApplication {
	public static void main(String[] args) {
		SpringApplication.run(EazySchoolApplication.class, args);
	}
}
