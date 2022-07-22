package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/api/v1/team")
	public String index() {
		return "Greetings from Team!";
	}
	@GetMapping("/api/v1/buy")
	public String index() {
		return "Greetings from Buy!";
	}
	@GetMapping("/api/v1/sell")
	public String index() {
		return "Greetings from sell!";
	}

	@GetMapping("/api/v1/sell/source")
	public String index() {
		return "Greetings from source sell!";
	}

	@GetMapping("/api/v1/sell/2")
	public String index() {
		return "Greetings from sell2!";
	}

	@GetMapping("/api/v0")
	public UserResponse restResponse() {
		UserResponse userResponse = new UserResponse();

		userResponse.setStatus(true);
		userResponse.setMessage("Data is found");

		return userResponse;
	}

}

