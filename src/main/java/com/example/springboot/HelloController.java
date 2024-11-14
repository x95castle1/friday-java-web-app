package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Hey Batman!");
		return "Yo from Spring Boot + Tanzu + happy friyay! + Do I have More Packages?";
	}


}
