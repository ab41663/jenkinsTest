package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testCon {

	@GetMapping("/test")
	public String sayHello() {
		return "hello world";
	}
	
	@GetMapping("/test1")
	public String sayHello() {
		return "hello world";
	}
}
