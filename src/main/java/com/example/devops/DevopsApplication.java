package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class DevopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome!";
	}
	@GetMapping("/greeting")
	public String greeting() {
		return "Greets!";
	}
}
