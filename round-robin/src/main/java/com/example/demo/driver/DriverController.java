package com.example.demo.driver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class DriverController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/drivers")
    public String getDriver() {
        return "Response from Driver Service: " + port;
    }
}