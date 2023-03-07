package org.example.security.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("hello")
    @Secured("ROLE_ADMIN")
    public String hello() {
        return "Hello Bridge Hole!";
    }
}
