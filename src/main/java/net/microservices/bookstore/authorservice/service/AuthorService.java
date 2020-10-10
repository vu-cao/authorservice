package net.microservices.bookstore.authorservice.service;

import net.microservices.bookstore.authorservice.model.Author;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService {
    Author findAuthorbyId(final Long id);
}
