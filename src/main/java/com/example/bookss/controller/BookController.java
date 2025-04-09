package com.example.bookss.controller;

import com.example.bookss.exception.BookNotFoundException;
import com.example.bookss.model.Book;
import com.example.bookss.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;

    }

    @GetMapping
    @Operation(summary = "Bu emeliyyat Butun kitablari getirir")
    public ResponseEntity<String> getAllBooks() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Xeta olaraq agirish elemisiniz");

    }




    @GetMapping("/allbook")
    public ResponseEntity<List<Book>> findAllBooks() {
        return ResponseEntity.status(HttpStatusCode.valueOf(505)).body(bookService.findAllBooks());


    }


    @GetMapping("/id")
    public ResponseEntity<Book> findById(Long id) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(bookService.findBookById(id));

    }


    @PostMapping("/book")
    public ResponseEntity<String> saveBook(@Valid @RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.CREATED).body("Kitablar muveffeqiyyetle yarandi");
    }




}
