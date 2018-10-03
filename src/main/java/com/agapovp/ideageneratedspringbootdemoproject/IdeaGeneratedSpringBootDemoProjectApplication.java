package com.agapovp.ideageneratedspringbootdemoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class IdeaGeneratedSpringBootDemoProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdeaGeneratedSpringBootDemoProjectApplication.class, args);
    }

    @RestController
    class SimpleController {

        @GetMapping("/call")
        String callMe() {
            return "Hello!";
        }
    }
}
