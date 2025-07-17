package com.example.demo.home;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://192.168.20.162")
public class HomeController {
	private final HomeService homeService;

	@GetMapping
	public String home() {
		return "Hello World";
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam String lang) {
		return homeService.greeting(lang);
	}
}
