package com.exalt.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	   @RequestMapping("/try")
	    public String index() {
	        return "my name is israa";
	    }
}
