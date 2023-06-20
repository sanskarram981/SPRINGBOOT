package com.spring.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springboot.dao.BookRepository;
import com.spring.springboot.entities.Book;

@Service
public class BookService 
{
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks()
    {
        return (List<Book>) this.bookRepository.findAll();
    }

    public Book getBooks(int id)
    {
        return this.bookRepository.findById(id).get();
    }

    public Book addBooks(Book book)
    {
        return this.bookRepository.save(book);
    }

    public void deleteBooks(int id)
    {
        this.bookRepository.deleteById(id);
    }

    public Book updateBooks(Book book)
    {
        return this.bookRepository.save(book);
    }

}
