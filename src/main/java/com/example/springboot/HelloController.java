package com.example.springboot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.*;
import java.util.Random;

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

    @GetMapping("/api/v0/buy")
    public String buy() {
        checkOutvalue2(300);
        return "Greetings from Buy!";
    }

    @GetMapping("/api/v1/sell")
    public String sell() {
        checkOutvalue(230);
        return "Greetings from sell!";
    }

    @GetMapping("/api/v1/error2")
    public ResponseEntity<String> error401() {
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }


    @GetMapping("/api/v1/sell/source")
    public String source() {
        checkOutvalue(200);
        return "Greetings from source sell!";
    }

    @GetMapping("/api/v1/sell/2")
    public String sell2() throws InterruptedException {
		Random random = new Random((10));

        Thread.sleep(random.nextInt(5)*1000);
		return "Greetings from sell2!";
    }

    @GetMapping("/api/v1/error")
    public String error() throws Exception {
        throw new Exception("error processing");
    }

    private void checkOutvalue(int total) {
        System.out.println("Check out value " + total);
    }

    void checkOutvalue2(int total) {
        System.out.println("Check out value " + total);
    }

	@GetMapping("/api/v1/mail")
	public String mailServer() throws Exception {
		sendingMessageToMailServer("mail1");
		return "Greetings from mail!";
	}

	@GetMapping("/api/v1/mail2")
	public String mailServer2() throws Exception {
		sendingMessageToMailServer("mail12");
		return "Greetings from mail2 !";
	}
	void sendingMessageToMailServer(String mailServerName) throws InterruptedException {
		Thread.sleep(2000);
	}

    @GetMapping("/api/v0")
    public main.java.com.example.springboot.UserResponse restResponse() {
        main.java.com.example.springboot.UserResponse userResponse = new main.java.com.example.springboot.UserResponse();

        userResponse.setStatus(true);
        userResponse.setMessage("Data is found");

        return userResponse;
    }

}

