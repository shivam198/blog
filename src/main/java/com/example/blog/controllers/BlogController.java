package com.example.blog.controllers;

import com.example.blog.service.BlogList;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.blog.models.Blog;

import java.util.List;

import static com.example.blog.service.BlogList.createBlogs;

@RestController
@RequestMapping("/blogs")
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class BlogController {

    @GetMapping("")
    public ResponseEntity<BlogList> blogs(){
        BlogList blogs = createBlogs();
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
    public ResponseEntity<Blog> getBlog(@RequestParam(value = "id") int id){
        BlogList allBlogs = createBlogs();
        List<Blog> blogList = (List<Blog>) allBlogs;
        Blog blog = blogList.get(id - 1);
//        Blog blog = (List<Blog>) blogs.getBlogs().get(id-1);
        return new ResponseEntity<>(blog, HttpStatus.OK);
    }

}
