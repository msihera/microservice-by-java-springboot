package com.era.departments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"${requestMapping}"})
public class DepartmentsController {
	
	  @GetMapping("/")
	    public String hello() {
	        return "Hello World!";
	    }
}
