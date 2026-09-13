package com.kenanyumer.booklibrary.book.persistence;

import com.kenanyumer.booklibrary.book.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

    public BookEntity findByNameAndPagesNumber(String name, int pagesNumber);

}
