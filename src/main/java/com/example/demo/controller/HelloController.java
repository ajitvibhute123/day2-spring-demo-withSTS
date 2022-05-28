package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @GetMapping("/hello")
//    @RequestMapping(method = RequestMethod.GET)
    @RequestMapping("/ajit")
    public String sayHello(){
        return "hello";
    }
}
