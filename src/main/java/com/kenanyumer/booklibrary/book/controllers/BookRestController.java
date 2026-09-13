package com.kenanyumer.booklibrary.book.controllers;

import com.kenanyumer.booklibrary.book.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    private final BookService bookService;

    public BookRestController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/book")
    public String get(@RequestParam String bookName, @RequestParam int numberPages){

        return this.bookService.createBook(bookName, numberPages);
    }
}
