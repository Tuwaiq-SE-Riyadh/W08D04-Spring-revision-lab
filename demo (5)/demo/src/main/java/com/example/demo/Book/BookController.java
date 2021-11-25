package com.example.demo.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){ this.bookService = bookService; }

    @GetMapping
    public List<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable String id){
        return bookService.getBook(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book){ return bookService.createBook(book); }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable String id, @RequestBody Book data){ bookService.updateBook(id, data); }
}
