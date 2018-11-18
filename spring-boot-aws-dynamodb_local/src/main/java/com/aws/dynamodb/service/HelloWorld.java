package com.aws.dynamodb.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorld {
    
	@RequestMapping("/")
	public String index() {
        return "Greetings from Spring Boot!";
    }
}
