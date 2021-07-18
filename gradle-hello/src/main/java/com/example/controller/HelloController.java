package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {
    @GetMapping("user/hello")
    public String handle01(String company, HttpServletRequest request) {
        String token = request.getHeader("token");
        return "hello " + company+token;
    }
}
