package net.microservices.bookstore.authorservice.service.impl;

import net.microservices.bookstore.authorservice.model.Author;
import net.microservices.bookstore.authorservice.repository.AuthorRepository;
import net.microservices.bookstore.authorservice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public Author findAuthorbyId(Long id) {
        final Optional<Author> authorOptional = authorRepository.findById(id);

        return authorOptional.orElse(null);

    }
}
