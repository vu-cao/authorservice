package net.microservices.bookstore.authorservice.repository;

import net.microservices.bookstore.authorservice.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
