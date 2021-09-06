package com.http.td.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostExemplesController {
	@PostMapping("/api")
	@ResponseBody
	public String addFoo(@RequestParam(name = "id") String fooId,
	@RequestParam String name) {
	return "ID: " + fooId + " Name: " + name;
	}
}
