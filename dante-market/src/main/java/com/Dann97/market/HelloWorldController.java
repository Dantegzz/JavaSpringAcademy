package com.Dann97.market;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayhi")
public class HelloWorldController {

    @GetMapping("/hi")
    public String saludar(){
        return "Never stop learning";
    }
}
