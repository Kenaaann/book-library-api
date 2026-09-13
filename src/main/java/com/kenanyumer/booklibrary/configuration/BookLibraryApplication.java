package com.kenanyumer.booklibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(scanBasePackages = {
        "com.kenanyumer.booklibrary.book", "com.kenanyumer.booklibrary"
})
@EnableJpaRepositories(basePackages = {
        "com.kenanyumer.booklibrary.book.persistence"
})
@EntityScan(basePackages = {
        "com.kenanyumer.booklibrary.book.model"
})
public class BookLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookLibraryApplication.class, args);
    }

}
