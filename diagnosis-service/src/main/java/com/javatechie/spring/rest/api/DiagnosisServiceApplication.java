package com.javatechie.spring.rest.api;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@SpringBootApplication
@RestController
public class DiagnosisServiceApplication {
	
	@GetMapping("/getDiagnosis")
	public String getDoctorService(HttpServletRequest request) {
		System.out.println(request.getHeader("tests"));
		if(request.getHeader("tests") != null) {
			return "authorization token exists in Diagnosis service and validating jwt";
		}
		return "authorization token not received in diagnosis service";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(DiagnosisServiceApplication.class, args);
	}
}
