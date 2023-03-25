package com.javatechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication
public class GithubCicdActions1Application 
{
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome to Java";
	}
	public static void main(String[] args)
	{
		SpringApplication.run(GithubCicdActions1Application.class, args);
	}

}
