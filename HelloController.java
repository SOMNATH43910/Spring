package com.amazon.cart.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // batata hai ki ye class REST endpoints handle karegi
public class HelloController {

    @GetMapping("/hello")   // jab tu http://localhost:8080/hello hit karega
    public String sayHello() {
        return "Hello Somnath! 🚀 Spring Boot is working fine.";
    }
}
