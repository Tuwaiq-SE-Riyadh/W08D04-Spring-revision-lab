package com.example.demo.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServies {
    private final BookRepository bookRepository;

    @Autowired
    public BookServies(BookRepository bookRepository) {
        this.bookRepository =bookRepository;
    }
    public List<Book> getBooks() {
        return bookRepository.findAll();

    }
    public Book getBook(String id) {
        Long book_id= Long.parseLong(id);
        return bookRepository.findById( book_id).orElse(null);
    }

    public Book createBook(Book book) {
        return bookRepository.save( book);
    }


    public void deletBook(String id) {
        Long book_id= Long.parseLong(id);
        bookRepository.deleteById(book_id);

    }

    public void updateBook(String id, Book data) {
        Long book_id= Long.parseLong(id);
        Book book= bookRepository.findById(book_id).orElse(null);


        if ( book != null) {
            book.setTitle(data.getTitle());
            book.setPages(data.getPages());
            book.setPrice(data.getPrice());

        }
    }




}
