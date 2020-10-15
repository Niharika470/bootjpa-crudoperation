package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan({"com.nt.controller","com.nt.service"})
@EnableJpaRepositories(basePackages="com.nt.dao")
@EntityScan(basePackages = "com.nt.model")
public class BootjpaCrudoperationsApplication {

	public static void main(String[] args) {
		System.out.println("Enter main");
		SpringApplication.run(BootjpaCrudoperationsApplication.class, args);
		System.out.println("Exit main");
	}

}
