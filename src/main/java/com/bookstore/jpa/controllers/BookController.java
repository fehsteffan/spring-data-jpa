package com.bookstore.jpa.controllers;

import com.bookstore.jpa.dtos.BookRecordDto;
import com.bookstore.jpa.model.BookModel;
import com.bookstore.jpa.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/bookstore/books")
public class BookController {


    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public ResponseEntity<List<BookModel>> getAllBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
    }


    @PostMapping
    public ResponseEntity<BookModel> saveBook(@RequestBody BookRecordDto bookRecordDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.saveBook(bookRecordDto));

    }

}
