package com.example.demo.ControllerAPI;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	@GetMapping("/hello")
	public Map<String, String> hello() {
		return Map.of("message", "Hello from Spring Boot!");
	}

}
