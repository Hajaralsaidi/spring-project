package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

@GetMapping("/welcome")
public String welcomeMessage() {
return "Welcome to my first Spring Boot API on GitHub!";
}
}
