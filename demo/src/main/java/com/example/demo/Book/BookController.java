package com.example.demo.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path= "book")
public class BookController {

    private final BookService bookService;


    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }



    @GetMapping
    public List<Book> getBooks(@RequestParam(required = false) String filter){
        System.out.println(filter);
        return bookService.getBooks();
    }

    @PostMapping
    public void addBook(@RequestBody Book todo){
         bookService.createBook(todo);
    }



    @GetMapping("/{id}")
    public Book getBook(@PathVariable String id){
        return bookService.getBook(id);
    }

    @DeleteMapping("/{id}")
    public void delBook(@PathVariable String id){
         bookService.deleteBook(id);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable String id, @RequestBody Book data){
        bookService.updateBook(id, data);
    }


}
