package com.raja.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HelloController {
	
	@GetMapping(value = "/getHello")
	public String getHello() {
		System.out.println("after getHello method....");
		String message = "my first spring boot applcation";
		System.out.println("after message..."+message);
		return message;
	}
	@GetMapping(value = "/getHello2")
	public String getHello2() {
		String message = "my second spring boot applcation";
		return message;
	}
	@GetMapping(value = "/getHello3")
	public String getHello3() {
		String message = "my third spring boot applcation";
		return message;
	}

}
