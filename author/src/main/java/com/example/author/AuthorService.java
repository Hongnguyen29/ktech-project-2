package com.example.author;

import com.example.author.model.Author;
import com.example.author.repo.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AuthorService  {
    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository){
        this.repository = repository;
    }
    //read
    public List<Author> readAll(){
        return repository.findAll();
    }
}
