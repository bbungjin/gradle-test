package org.example.lib.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/lib/hello")
    public String hello() {
        return "Hello from My Library 👋";
    }
}