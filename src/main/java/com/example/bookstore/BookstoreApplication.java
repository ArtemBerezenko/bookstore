package com.example.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BookstoreApplication {

    @RequestMapping(value = "/recommended")
    public String readingList(){
        return "'Clean Code', 'Design Patterns: Gang Of Four', 'Refactoring: Improving the Design of Existing Code', 'Effective Java'";
    }

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

}
