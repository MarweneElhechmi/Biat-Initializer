package tn.biat.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String sayHello() {
		return "La Biat, encore bienvene - servi par Boot Initializer";
	}

}
