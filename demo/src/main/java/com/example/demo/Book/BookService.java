package com.example.demo.Book;

import com.example.demo.Book.Book;
import com.example.demo.Book.BookRepository;
import com.sun.xml.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {

        this.bookRepository = bookRepository;
    }


    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Book getBook(String id){
        int todo_id = Integer.valueOf(id);
        return bookRepository.findById(todo_id).orElse(null);
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(String id){
        int todo_id = Integer.valueOf(id);
        bookRepository.deleteById(todo_id);

    }

    public void updateBook(String id, Book data){
        int todo_id = Integer.valueOf(id);
        Book book = bookRepository.findById(todo_id).orElse(null);

        if (book != null){
            book.setTitle(data.getTitle());
            book.setPages(data.getPages());
            book.setPrice(data.getPrice());
            bookRepository.save(book);
            }
        }

    }


