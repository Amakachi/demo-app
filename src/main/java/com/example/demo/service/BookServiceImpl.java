package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    public Book addBook(Book book){
        return bookRepository.save(book);
    }

    public Book findBookByBookName(String bookName){
        return bookRepository.findByBookName(bookName);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
}
