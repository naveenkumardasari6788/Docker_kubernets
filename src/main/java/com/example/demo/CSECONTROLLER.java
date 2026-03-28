package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSECONTROLLER {
	@GetMapping("/cse/home")
	public String rocks() {
		return "WELCOME TO OPENSHIFT";
	}
}
	