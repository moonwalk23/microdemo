package com.example.demo.ws.endpoint.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestDemoEndPoint {
	private RestTemplate template;
	
	public RestDemoEndPoint(RestTemplate template) {
		this.template = template;
	}

	@RequestMapping("/template")
	public String template() {
		String msg = this.template.getForObject("http://localhost:8070", String.class);
		return msg;
	}
	
	
	
}
