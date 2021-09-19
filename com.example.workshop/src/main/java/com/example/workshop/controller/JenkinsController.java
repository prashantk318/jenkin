package com.example.workshop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshop.model.Jenkin;

@RestController
@RequestMapping("/")
public class JenkinsController {
	
	@RequestMapping("/hello")
	public Jenkin hello() {
		return new Jenkin("hello jenkins");
	}

}
