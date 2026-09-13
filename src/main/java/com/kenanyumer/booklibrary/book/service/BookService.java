package com.kenanyumer.booklibrary.book.service;

import com.kenanyumer.booklibrary.book.model.BookEntity;
import com.kenanyumer.booklibrary.book.persistence.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public String createBook(String bookName, int numberPages){
        BookEntity existingBook = this.bookRepository.findByNameAndPagesNumber(bookName, numberPages);

        if(existingBook == null){
            BookEntity newBook = new BookEntity(bookName, numberPages);

            this.bookRepository.save(newBook);

            return "The book has been created !";
        }
        return "The book already exists !";
    }



}
