package com.kecannouncements.app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
// @CrossOrigin("*")/
public class DummyController {

    @GetMapping("/")
    public String checkBackend() {
        return "Backend is alive";
    }
    
}
