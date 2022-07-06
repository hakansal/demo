package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class apitest {

    @GetMapping("v1/user/{id}")
    public String getUser(@PathVariable Long id){
          String message="hello world";
        return message;
    }
}
