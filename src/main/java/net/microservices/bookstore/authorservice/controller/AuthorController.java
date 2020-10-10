package net.microservices.bookstore.authorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.microservices.bookstore.authorservice.model.Author;
import net.microservices.bookstore.authorservice.service.AuthorService;

@RestController
@RequestMapping("/v1/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Author getAuthor(@PathVariable final Long id) {
        return authorService.findAuthorbyId(id);
    }
}
