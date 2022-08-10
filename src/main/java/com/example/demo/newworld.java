package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan(basePackages= {"com.mindtree.controller"})
@SpringBootApplication
public class newworld {

	public static void main(String[] args) {
		SpringApplication.run(newworld.class, args);

	}
}
