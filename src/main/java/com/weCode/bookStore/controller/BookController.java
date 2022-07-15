package com.weCode.bookStore.controller;

import com.weCode.bookStore.dto.BookDto;
import com.weCode.bookStore.service.BookService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){
//        BookDto book = BookDto.builder()
//                .title("My First book title")
//                .build();
//
//        BookDto bookSecond = BookDto.builder()
//                .title("Secon book title")
//                .build();
//
//        List<BookDto> books = new ArrayList<>();
//        books.add(book);
//        books.add(bookSecond);
        List<BookDto> books = bookService.getBooks();

        return ResponseEntity.ok(books);

    }
}
