package com.example.blog.service;

import com.example.blog.models.Blog;
import com.example.blog.service.BlogList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.example.blog.service.BlogList.createBlogs;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class BlogListTest {

    @Test
    public void shouldCreateBlogs(){
        BlogList blogs = createBlogs();
        List<Blog> expectedBlogs = blogs.getBlogs();
        List<Blog> actualBlogs = new ArrayList<>();
        actualBlogs.add(new Blog("Aditya", "Competitive Programming", 5));
        actualBlogs.add(new Blog("Sourabh", "Overall Performance Improvement", 7));
        actualBlogs.add(new Blog("Abhishek", "Python Programming", 3));
        actualBlogs.add(new Blog("Akshay", "Front End Web Development", 4));
        actualBlogs.add(new Blog("Ravi", "Computer Science Everything", 9));

        assertThat(actualBlogs,is(equalTo(expectedBlogs)));
    }
}