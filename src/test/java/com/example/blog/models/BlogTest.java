package com.example.blog.models;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BlogTest {

    @Test
    public void shouldReturnAuthorName(){
        Blog blog = new Blog("Aditya", "Competitive Programming", 5);
        String expectedAuthor = "Aditya";
        String actualAuthor = blog.getAuthor();

        assertThat(expectedAuthor).isEqualTo(actualAuthor);
    }

    @Test
    public void shouldReturnContent(){
        Blog blog = new Blog("Aditya", "Competitive Programming", 5);
        String expectedContent = "Competitive Programming";
        String actualContent = blog.getContent();

        assertThat(expectedContent).isEqualTo(actualContent);
    }

    @Test
    public void shouldReturnNumberOfPages(){
        Blog blog = new Blog("Aditya", "Competitive Programming", 5);
        int expectedPages = 5;
        int actualPages = blog.getPages();

        assertThat(expectedPages).isEqualTo(actualPages);
    }


}