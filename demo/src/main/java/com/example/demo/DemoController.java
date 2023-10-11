package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/semana5")

public class DemoController {
    @GetMapping
    public String Semana5(){
        return "La semana 5 fue muy productiva";
    }
}
