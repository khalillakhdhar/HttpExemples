package com.http.td.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GetExemplesController {
	@GetMapping("/api")
	@ResponseBody
	public String getFoos(@RequestParam(name = "myid",required = false,defaultValue = "abcd") String id) {
	return "ID: " + id;
	}
	
	@GetMapping("")
	public ModelAndView homepage()
	{
		ModelAndView mv=new ModelAndView("index.html");
		return mv;
	}
}
