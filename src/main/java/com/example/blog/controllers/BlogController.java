package com.example.blog.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.blog.models.BlogModel;
import static com.example.blog.models.BlogModel.createBlogs;

@RestController
@RequestMapping("/blogs")
public class BlogController {

    @GetMapping()
    public ResponseEntity<BlogModel[]> blogs(){
        BlogModel[] blogs = createBlogs();
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }

    @GetMapping(path = "/testing/{author}")
    public String getUser(@PathVariable String author){
        return "Hey!!! My name is " + author;
    }

    @GetMapping("/testing")
    public String getUsers(@RequestParam(value = "author")String author){
        return "Hey!!! My name is" + author;
    }

    @GetMapping("/id")
    public ResponseEntity<BlogModel> getBlog(@RequestParam(value = "id") int id){
        BlogModel[] blogs = createBlogs();
        BlogModel blog = blogs[id-1];
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

}
