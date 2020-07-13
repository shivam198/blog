package com.example.blog.service;

import com.example.blog.models.Blog;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class BlogList {

    private List<Blog> blogs;

    public BlogList() {
        this.blogs = new ArrayList<>();
    }

    public BlogList(List<Blog> blogList){
        this.blogs = blogList;
    }

    public static BlogList createBlogs(){
        List<Blog> bloglist = new ArrayList<>();
        bloglist.add(new Blog("Aditya", "Competitive Programming", 5));
        bloglist.add(new Blog("Sourabh", "Overall Performance Improvement", 7));
        bloglist.add(new Blog("Abhishek", "Python Programming", 3));
        bloglist.add(new Blog("Akshay", "Front End Web Development", 4));
        bloglist.add(new Blog("Ravi", "Computer Science Everything", 9));
        BlogList blogs = new BlogList(bloglist);
        return blogs;
    }

    public List<Blog> getBlogs(){
        return blogs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogList blogList = (BlogList) o;
        return Objects.equals(blogs, blogList.blogs);
    }

    @Override
    public String toString() {
        return "BlogList{" +
                "blogs=" + blogs +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(blogs);
    }
}
