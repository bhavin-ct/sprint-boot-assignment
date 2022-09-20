package com.example.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AssignmentApplication {

	@GetMapping("/reverseString")
	public String reverseString(@RequestParam String str){
		StringBuilder sb=new StringBuilder(str);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
	}

}
