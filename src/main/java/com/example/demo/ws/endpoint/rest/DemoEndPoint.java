package com.example.demo.ws.endpoint.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoEndPoint {
	
	@RequestMapping ("/")
	public String hello() {
		return "*****Welcome to the world of WebServices REST demo!!!!!!!!";
	}
	
	@RequestMapping ("/other")
	public String other() {
		return "Other is invoked";
	}
	

}
