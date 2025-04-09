package com.example.libms.service;

import com.example.libms.dto.request.BookRequestDto;
import com.example.libms.dto.response.BookResponseDto;

import java.util.List;
import java.util.Optional;

public interface BookService {
    //create
    Optional<BookResponseDto> createBook(BookRequestDto bookRequestDto);
    //update
    Optional<BookResponseDto> updateBook(String isbn, BookRequestDto bookRequestDto);
    //find by isbn
    Optional<BookResponseDto> findBookByIsbn(String isbn);
    //delete by isbn
    void deleteBookByIsbn(String isbn);
    //find all
    List<BookResponseDto> findAllBooks();
}
