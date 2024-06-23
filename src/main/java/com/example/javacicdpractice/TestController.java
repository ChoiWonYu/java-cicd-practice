package com.example.javacicdpractice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.environment.variable}")
    private String testVariable;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/test")
    public String test() {
        return "common var: " + appName + "\ntest var: " + testVariable + "\n test change!";
    }
}
