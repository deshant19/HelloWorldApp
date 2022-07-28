package com.helloworld.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloWorldAppController {
	
  @RequestMapping("/helloworld")
  public String helloDocker() {
    String response = "Hello World";
    System.out.println(response);
    return response;
  }
  
  @RequestMapping (value = "/**", method = {RequestMethod.GET, RequestMethod.POST})
  public ResponseEntity<String> defaultPath() {
      return new ResponseEntity<String>("Wrong request. Try URL /helloworld", HttpStatus.OK);
  }
}
