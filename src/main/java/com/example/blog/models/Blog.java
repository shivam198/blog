package com.example.blog.models;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Objects;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class Blog {

    private String author;
    private String content;
    private int pages;

    public Blog(String author, String blog, int pages) {
        this.author = author;
        this.content = blog;
        this.pages = pages;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blogModel = (Blog) o;
        return pages == blogModel.pages &&
                Objects.equals(author, blogModel.author) &&
                Objects.equals(content, blogModel.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, content, pages);
    }

    @Override
    public String toString() {
        return "BlogModel{" +
                "author='" + author + '\'' +
                ", blog='" + content + '\'' +
                ", pages=" + pages +
                '}';
    }
}

