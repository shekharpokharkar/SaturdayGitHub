package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {

	@GetMapping("/test")
	public String showTest() {
		System.out.println("Hello Good Morning");
		return "show Demo1";
	}

}
