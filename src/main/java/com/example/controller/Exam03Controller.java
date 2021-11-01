package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/total")
	public String total(Integer num1, Integer num2, Integer num3, Model model) {
		Integer result = num1 + num2 + num3;
		Integer result2 = (int) (result * 1.1);
		model.addAttribute("result", result);
		model.addAttribute("result2", result2);
		return "exam03-result";
	}
}
