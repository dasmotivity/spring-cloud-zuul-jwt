package com.javatechie.spring.rest.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class DoctorServiceApplication {

	@GetMapping("/getDS")
	public String gdetDoctorService(HttpServletRequest request, HttpServletResponse response) {
		System.out.println(request.getHeader("tests"));

		if(request.getHeader("tests") != null) {
			return "authorization token received in doctor service and validating token via jwt";
		}
			
			return "authorization header not found";
		
	}

	@GetMapping("/welcome/{name}")
	public String wish(@PathVariable String name) {
		return "Hi "+name+" Welcome to Doctor Service";
	}
	public static void main(String[] args) {
		SpringApplication.run(DoctorServiceApplication.class, args);
	}
}
