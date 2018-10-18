package com.keiko.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //allows this file or class to respond as a controller
public class FirstprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}

	@RequestMapping("/") //annotation allow to respond to the root request)
		public String hello() {
			return "Hello World";
		
	}
}
