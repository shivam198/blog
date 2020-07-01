package com.example.blog.models;

import java.util.Objects;

public class BlogModel {

    String author;
    String blog;
    int pages;

    public BlogModel(String author, String blog, int pages) {
        this.author = author;
        this.blog = blog;
        this.pages = pages;
    }

    public static BlogModel[] createBlogs(){
        BlogModel blogs[] = new BlogModel[5];
        blogs[0] = new BlogModel("Aditya", "Competitive Programming", 5);
        blogs[1] = new BlogModel("Sourabh", "Overall Performance Improvement", 7);
        blogs[2] = new BlogModel("Abhishek", "Python Programming", 3);
        blogs[3] = new BlogModel("Akshay", "Front End Web Development", 4);
        blogs[4] = new BlogModel("Ravi", "Computer Science Everything", 9);
        return blogs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogModel blogModel = (BlogModel) o;
        return pages == blogModel.pages &&
                Objects.equals(author, blogModel.author) &&
                Objects.equals(blog, blogModel.blog);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, blog, pages);
    }

    @Override
    public String toString() {
        return "BlogModel{" +
                "author='" + author + '\'' +
                ", blog='" + blog + '\'' +
                ", pages=" + pages +
                '}';
    }
}
