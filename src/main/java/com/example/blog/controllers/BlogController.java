package com.example.blog.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {



    @GetMapping("")
    public String blogs(){
        String blog = "This is my first blog!! Wish me luck";
        return blog;
    }
}
