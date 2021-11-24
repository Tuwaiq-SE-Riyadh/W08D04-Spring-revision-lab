package com.example.demo.Author;

import com.example.demo.Author.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {

        this.authorRepository = authorRepository;
    }


    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }

    public Author getAuthor(String id){
        int todo_id = Integer.valueOf(id);
        return authorRepository.findById(todo_id).orElse(null);
    }

    public Author createAuthor(Author author){
        return authorRepository.save(author);
    }

    public void deleteAuthor(String id){
        int todo_id = Integer.valueOf(id);
        authorRepository.deleteById(todo_id);

    }

    public void updateAuthor(String id, Author data){
        int todo_id = Integer.valueOf(id);
        Author author = authorRepository.findById(todo_id).orElse(null);

        if (author != null){
            author.setName(data.getName());
            author.setAge(data.getAge());
            author.setGender(data.getGender());
            author.setNationality(data.getNationality());

            authorRepository.save(author);
            }
        }

    }


