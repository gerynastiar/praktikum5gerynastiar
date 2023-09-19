/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.polstat.perpustakaan.service;

import com.polstat.perpustakaan.dto.BookDto;
import java.util.List;
/**
 *
 * @author asus
 */
public interface BookService {
    public BookDto createBook(BookDto bookDto);
    public BookDto updateBook(BookDto bookDto);
    public void deleteBook(BookDto bookDto);
    public List<BookDto> getBooks();
    public BookDto getBook(Long id);
    public List<BookDto> searchBooks(String keyword);
}
