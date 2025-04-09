package com.example.bookss.service;

import com.example.bookss.exception.BookNotFoundException;
import com.example.bookss.model.Book;
import com.example.bookss.repository.BookRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @PersistenceContext
    private EntityManager entityManager;

    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public Book getAllBooks(){
        return entityManager.createNamedQuery("Book.tapgetir", Book.class).getSingleResult();
    }


    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException("Book with id " + id + " not found"));
    }



    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }



    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

}
