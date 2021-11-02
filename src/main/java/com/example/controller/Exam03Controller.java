package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/total")
	public String total(Integer num1, Integer num2, Integer num3) {
		Integer result = num1 + num2 + num3;
		Integer result2 = (int) (result * 1.1);
		application.setAttribute("result", result);
		application.setAttribute("result2", result2);
		return "exam03-result";
	}
}
