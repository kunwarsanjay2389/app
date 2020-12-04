package com.cdac.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello There! Welcome to Cdac! FPGDST course!";
    }
}
