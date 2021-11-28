package com.example.demo.Book;



import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "evaluations")

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long BookId;
    private String title;
    private int pages;
    private int price;

    public Book(Long  BookId, String title, int pages, int price) {
        this. BookId =  BookId;
        this.title = title;
        this.pages = pages;
        this.price = price;


    }

    public Long getEvaluationId() {
        return  BookId;
    }

    public void setEvaluationId(Long evaluationId) {
        this. BookId = evaluationId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

