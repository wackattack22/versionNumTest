package com.version.num.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.version.num.test.service.TestService;

@RestController
@RequestMapping("/api")
public class TestController {

	
	@Autowired
	TestService service;
	
	@RequestMapping("/hello")
	public String testHello() {
		return service.helloWorld();
	}
}
