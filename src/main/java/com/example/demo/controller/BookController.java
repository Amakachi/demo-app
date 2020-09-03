package com.example.demo.controller;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import com.example.demo.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookServiceImpl bookService;

    @PostMapping("/add-books")
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/find-book/{bookName}")
    public Book findBookByName(@PathVariable String bookName){
        return bookService.findBookByBookName(bookName);
    }

}
