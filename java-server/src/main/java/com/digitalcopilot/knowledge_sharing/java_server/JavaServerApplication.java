package com.digitalcopilot.knowledge_sharing.java_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaServerApplication.class, args);
	}

	@GetMapping
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s from Java\n", name);
	}

}
