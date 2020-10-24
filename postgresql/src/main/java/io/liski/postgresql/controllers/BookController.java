package io.liski.postgresql.controllers;

import io.liski.postgresql.domain.Book;
import io.liski.postgresql.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/book")
    public Book addBook(Book book) {
        bookRepository.save(book);
        return book;
    }
}
