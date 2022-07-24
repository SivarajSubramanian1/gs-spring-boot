package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.*;
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/api/v1/team")
	public String team() {
		return "Greetings from Team!";
	}
	@GetMapping("/api/v1/buy")
	public String buy() {
		return "Greetings from Buy!";
	}
	@GetMapping("/api/v1/sell")
	public String sell() {
		checkOutvalue(230);
		return "Greetings from sell!";
	}

	@GetMapping("/api/v1/sell/source")
	public String source() {
		checkOutvalue(200);
		return "Greetings from source sell!";
	}

	@GetMapping("/api/v1/sell/2")
	public String sell2() {
		return "Greetings from sell2!";
	}

	@GetMapping("/api/v1/error")
	public String error() throws Exception {
		throw new Exception("error processing");
	}

	private void checkOutvalue(int total){
		System.out.println("Check out value " + total);
	}

	@GetMapping("/api/v0")
	public main.java.com.example.springboot.UserResponse restResponse() {
		main.java.com.example.springboot.UserResponse userResponse = new main.java.com.example.springboot.UserResponse();

		userResponse.setStatus(true);
		userResponse.setMessage("Data is found");

		return userResponse;
	}

}

