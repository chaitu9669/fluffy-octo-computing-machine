package com.self.learning.springbootapp.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.self.learning.springbootapp.dto.Request;

@RestController
public class Controller {
	
	@RequestMapping(value = "/server", method = RequestMethod.POST)
	public String test(@RequestBody Request request){
		System.out.println("sample" + request.getFname());
		return "hi";
	}

}
