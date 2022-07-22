package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/api/v0")
	public UserResponse restResponse() {
		UserResponse userResponse = new UserResponse();

		userResponse.setStatus(true);
		userResponse.setMessage("Data is found");

		return userResponse;
	}

}

