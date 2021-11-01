package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam02";
	}
	
	@RequestMapping("sum")
	public String putName(Model model, Integer num1, Integer num2) {
		int result = num1 + num2;
		model.addAttribute("num1", num1);
		model.addAttribute("num2", num2);
		model.addAttribute("result", result);
		
		return "exam02-result";
	}
}
