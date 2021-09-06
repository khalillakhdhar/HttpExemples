package com.http.td.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetExemplesController {
	@GetMapping("/api")
	@ResponseBody
	public String getFoos(@RequestParam(name = "myid",required = false,defaultValue = "abcd") String id) {
	return "ID: " + id;
	}
}
