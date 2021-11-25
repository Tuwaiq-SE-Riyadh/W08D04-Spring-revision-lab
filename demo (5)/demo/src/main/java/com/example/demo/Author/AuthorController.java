package com.example.demo.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "authors")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService){ this.authorService = authorService; }

    @GetMapping
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable String id){
        return authorService.getAuthor(id);
    }

    @PostMapping
    public Author createAuthor(@RequestBody Author author){ return authorService.createAuthor(author); }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable String id){
        authorService.deleteAuthor(id);
    }

    @PutMapping("/{id}")
    public void updateAuthor(@PathVariable String id, @RequestBody Author data){ authorService.updateAuthor(id, data); }
}
