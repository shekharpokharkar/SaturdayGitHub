package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String showTest() {

		System.out.println("Good Morning shekhar you are great this is done ");
		return "hiiii shekhar";
	}

}
