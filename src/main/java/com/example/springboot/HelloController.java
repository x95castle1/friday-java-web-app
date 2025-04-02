package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		System.out.println("Hello Juan!");
		return "Yo from Spring Boot + Tanzu + happy friyay! + another failure - Supply Chain. IVS 8 - TASK RUN 2";
	}


}
