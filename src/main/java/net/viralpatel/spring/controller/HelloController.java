package net.viralpatel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//Modified Code by Rahul
//Modified code on 13May
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("name", "John Doe");

		return "welcome From Rahul using Jenkins";
	}
}
