package com.sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/hi")
	public String greet() {
		return "Hello Java World";
	}
	
}
