package com.myproject.example.pushnotification.myNotification.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotificationController {

	@GetMapping("/foo")
	public String getSomeName() {
		return "foo baar";
	}
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="You ") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
	
	
}
