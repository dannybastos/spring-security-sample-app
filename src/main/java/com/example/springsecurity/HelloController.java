package com.example.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HelloController {

	private ObjectMapper mapper;

	public HelloController(ObjectMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("/")
	public String index() throws JsonProcessingException {
		HelloDTO helloDTO = new HelloDTO("Hello World!");
		return mapper.writeValueAsString(helloDTO);
	}
	
}
