package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {

	@GetMapping("/test")
	public String showTest() {
		return "show Demo1";
	}

}
