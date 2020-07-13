package com.example.blog.controllers;

import com.example.blog.models.Blog;
import com.example.blog.service.BlogList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BlogControllerTest {

    @Autowired
    BlogController blogController;

    @LocalServerPort
    private int port;

    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void shouldReturnAllBlogs(){
        List<Blog> bloglist = new ArrayList<>();
        bloglist.add(new Blog("Aditya", "Competitive Programming", 5));
        bloglist.add(new Blog("Sourabh", "Overall Performance Improvement", 7));
        bloglist.add(new Blog("Abhishek", "Python Programming", 3));
        bloglist.add(new Blog("Akshay", "Front End Web Development", 4));
        bloglist.add(new Blog("Ravi", "Computer Science Everything", 9));
        String url = "http://localhost:";
        String restUrl = "/blogs";

        ResponseEntity<BlogList> entity = restTemplate.getForEntity(url + port + restUrl, BlogList.class);

        assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(entity.getBody().getBlogs()).isEqualTo(bloglist);
//        assertTrue(entity.getBody().getBlogs().equals(bloglist));
    }

    @Test
    public void getAuthorParameter() throws Exception{
        String author = "Aditya";
        MockMvc mockMvc = null;
        BlogController controller = new BlogController();
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/blogs/testing").param("author", "Aditya"))
            .andExpect(status().isOk());
    }

}