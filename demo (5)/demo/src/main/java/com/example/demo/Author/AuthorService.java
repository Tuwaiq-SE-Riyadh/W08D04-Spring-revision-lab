package com.example.demo.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository){ this.authorRepository = authorRepository; }

    public List<Author> getAuthors(){ return authorRepository.findAll(); }

    public Author getAuthor(String id){
        Long author_id = Long.parseLong(id);
        return authorRepository.findById(author_id).orElse(null);
    }

    public Author createAuthor(Author author){
        return authorRepository.save(author);
    }

    public void deleteAuthor(String id){
        Long author_id = Long.parseLong(id);
        authorRepository.deleteById(author_id);
    }

    public void updateAuthor(String id, Author data){
        Long author_id = Long.parseLong(id);
        Author author = authorRepository.findById(author_id).orElse(null);

        if(author != null){
            author.setName(data.getName());
            author.setAge(data.getAge());
            author.setNationality(data.getNationality());
            author.setGender(data.getGender());
        }
    }
}
