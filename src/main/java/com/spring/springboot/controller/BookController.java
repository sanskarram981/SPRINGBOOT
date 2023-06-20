package com.spring.springboot.controller;

import org.hibernate.action.internal.OrphanRemovalAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springboot.service.BookService;
import com.spring.springboot.entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/*
 * NO_CONTENT - 204
 * 
 */

@RestController
public class BookController 
{
    @Autowired
    private BookService bookService;
    
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllbooks()
    {
        List<Book> books = this.bookService.getAllBooks();
        if(books == null)
        {
            //return ResponseEntity.noContent().build();
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

        //return ResponseEntity.ok().body(books);
        //return ResponseEntity.ok(books);
        //return ResponseEntity.status(HttpStatus.OK).body(books);
        return ResponseEntity.of(Optional.of(books));
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getbooks(@PathVariable("id") int id)
    {
        Book book = this.bookService.getBooks(id);
        if(book == null)
        {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }

    @PostMapping("/books")
    public ResponseEntity<Book> addbooks(@RequestBody Book book)
    {
        Book books = null;
        try{
        books = this.bookService.addBooks(book);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        return ResponseEntity.of(Optional.of(books));
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<Void> deletebooks(@PathVariable("id") int id)
    {
        try{
            this.bookService.deleteBooks(id);
            return ResponseEntity.ok().build();

        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        //return ResponseEntity.ok().build();
    }

    @PutMapping("/books")
    public ResponseEntity<Book> updatebooks(@RequestBody Book book)
    {   
        Book books = null;
        try{
            books = this.bookService.updateBooks(book);
            return ResponseEntity.ok(books);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
        //return ResponseEntity.ok(books);
    }
}
