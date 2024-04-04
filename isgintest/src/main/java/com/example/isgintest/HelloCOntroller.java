package com.example.isgintest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCOntroller {
    @RequestMapping
    public String hello(){
        return "<h1>Hello iSign Tech Employees</h1>";
    }
}
