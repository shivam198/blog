package com.example.blog.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.blog.models.BlogModel;
import static com.example.blog.models.BlogModel.createBlogs;

@RestController
public class BlogController {

    @GetMapping("/")
    public ResponseEntity<BlogModel[]> blogs(){
        BlogModel[] blogs = createBlogs();
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

}
