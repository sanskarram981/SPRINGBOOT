package com.spring.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springboot.service.BookService;
import com.spring.springboot.entities.Book;
import java.util.List;


@RestController
public class BookController 
{
    @Autowired
    private BookService bookService;
    
    @GetMapping("/books")
    public List<Book> getAllbooks()
    {
        return this.bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getbooks(@PathVariable("id") int id)
    {
        return this.bookService.getBooks(id);
    }

    @PostMapping("/books")
    public Book addbooks(@RequestBody Book book)
    {
        return this.bookService.addBooks(book);
    }

    @DeleteMapping("/books/{id}")
    public void deletebooks(@PathVariable("id") int id)
    {
        this.bookService.deleteBooks(id);
    }

    @PutMapping("/books")
    public Book updatebooks(@RequestBody Book book)
    {
        return this.bookService.updateBooks(book);
    }
}
