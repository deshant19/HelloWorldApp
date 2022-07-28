package com.helloworld.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldAppController {
	
	@RequestMapping("/helloworld")
	  public String helloWorld() {
	    String response = "Hello World";
	    return response;
	}
	  
	@RequestMapping (value = "/**", method = {RequestMethod.GET, RequestMethod.POST})
	public ResponseEntity<String> wrongPathResponseHandler() {
	    return new ResponseEntity<String>("Wrong request. Try URL /helloworld", HttpStatus.OK);
	}
}
