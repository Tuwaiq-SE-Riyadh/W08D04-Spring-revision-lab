package com.example.demo.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(path="evaluation")
    public class BookController {
        private final BookServies bookServies;
        @Autowired
        public BookController(BookServies  bookServies) {
            this. bookServies =  bookServies;
        }
        @GetMapping
        private List<Book> getBooks ()
        {
            return  bookServies.getBooks ();
        }

        @GetMapping("/{id}")
        public Book getBook(@PathVariable String id){
            return  bookServies.getBook(id);

        }
        @PostMapping
        public Book createBook(@RequestBody Book book){
            return  bookServies. createBook(book);
        }
        @DeleteMapping("/{id}")
        public void deleteBook(@PathVariable String id){
            bookServies.deletBook(id);

        }
        @PutMapping("/{id}")
        public void updateBook(@PathVariable String id, @RequestBody Book data)
        {
            bookServies.updateBook(id,data);
        }
    }


