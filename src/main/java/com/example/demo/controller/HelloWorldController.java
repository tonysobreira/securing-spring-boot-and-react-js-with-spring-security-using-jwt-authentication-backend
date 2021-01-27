package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple rest API to test request, after token authentication successful, the
 * request will come here
 * 
 * @author 126518307
 *
 */
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HelloWorldController {

	@RequestMapping("/dashboard")
	public String firstPage() {
		return "success";
	}

}