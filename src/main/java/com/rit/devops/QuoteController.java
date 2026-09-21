package com.rit.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {

    @GetMapping("/quote")
    public String quote() {
        return "Automate everything that you do more than twice.";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
