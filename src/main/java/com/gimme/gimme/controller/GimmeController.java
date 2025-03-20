package com.gimme.gimme.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class GimmeController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
