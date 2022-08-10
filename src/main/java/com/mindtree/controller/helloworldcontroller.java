package com.mindtree.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
@RestController
public class helloworldcontroller {
	@GetMapping("/")
	public String hello()   
	{  
	return "Hello world";  
	}  
	
	@PostMapping("/post")
	public String hellopost()
	{
		return "Hello world on Post Request";
	}
	


}
