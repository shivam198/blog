package com.example.blog.models;

import org.junit.jupiter.api.Test;
import static com.example.blog.models.BlogModel.createBlogs;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class BlogModelTest {

    @Test
    public void shouldCreateBlogs(){
        BlogModel expectedBlogs[] = new BlogModel[5];
        expectedBlogs[0] = new BlogModel("Aditya", "Competitive Programming", 5);
        expectedBlogs[1] = new BlogModel("Sourabh", "Overall Performance Improvement", 7);
        expectedBlogs[2] = new BlogModel("Abhishek", "Python Programming", 3);
        expectedBlogs[3] = new BlogModel("Akshay", "Front End Web Development", 4);
        expectedBlogs[4] = new BlogModel("Ravi", "Computer Science Everything", 9);

        BlogModel actualBlogs[] = createBlogs();

        assertThat(actualBlogs,is(equalTo(expectedBlogs)));
    }
}