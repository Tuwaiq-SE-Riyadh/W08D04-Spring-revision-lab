package com.example.demo.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "author")
public class AuthorController {
    private final AuthorServies authorServies;


    @Autowired
    public AuthorController(AuthorServies authorServies) {
        this.authorServies = authorServies;
    }

    @GetMapping
    private List<Author> getAuthors() {
        return authorServies.getAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthor(@PathVariable String id) {
        return authorServies.getAuthor(id);

    }


    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorServies. createAuthor(author);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable String id) {
        authorServies.deleteAuthor(id);

    }

    @PutMapping("/{id}")
    public void updateAuthor(@PathVariable String id, @RequestBody Author data) {
        authorServies.updateAuthor(id, data);
    }





}
