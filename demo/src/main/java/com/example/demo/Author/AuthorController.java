package com.example.demo.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path= "author")
public class AuthorController {

    private final AuthorService authorService;


    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }



    @GetMapping
    public List<Author> getTodos(@RequestParam(required = false) String filter){
        return authorService.getAuthors();
    }

    @PostMapping
    public void addTodo(@RequestBody Author author){
         authorService.createAuthor(author);
    }



    @GetMapping("/{id}")
    public Author getTodo(@PathVariable String id){
        return authorService.getAuthor(id);
    }

    @DeleteMapping("/{id}")
    public void delTodo(@PathVariable String id){
         authorService.deleteAuthor(id);
    }

    @PutMapping("/{id}")
    public void updateTodo(@PathVariable String id, @RequestBody Author data){
        authorService.updateAuthor(id, data);
    }


}
