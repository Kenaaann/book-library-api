package com.kenanyumer.booklibrary.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
public class BookRestController {

    private final BookRepository bookRepository;

    public BookRestController(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @GetMapping("/book")
    public String get(@RequestParam String bookName, @RequestParam int numberPages){

        BookEntity existingBook = this.bookRepository.findByNameAndPagesNumber(bookName, numberPages);

        if(existingBook == null){
            BookEntity newBook = new BookEntity(bookName, numberPages);

            System.out.println(newBook);

            this.bookRepository.save(newBook);

            return "The book has been Created";
        } else {
            return "The book is already existing";
        }
    }
}
