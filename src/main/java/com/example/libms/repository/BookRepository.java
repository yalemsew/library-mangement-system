package com.example.libms.repository;

import com.example.libms.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
     Optional<Book> findByIsbn(String isbn);
     void deleteByIsbn(String isbn);
     Optional<Book> findByTitle(String title);
}
