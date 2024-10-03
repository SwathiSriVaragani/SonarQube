package com.example.Sonar_Jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController { 
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello, SonarQube!!Now we are going to check the code quality and its dependencies";	
		}

}
