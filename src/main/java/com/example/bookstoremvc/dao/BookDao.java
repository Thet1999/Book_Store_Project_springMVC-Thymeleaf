package com.example.bookstoremvc.dao;

import com.example.bookstoremvc.entity.Book;
import com.example.bookstoremvc.entity.BookStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookDao extends JpaRepository<Book,Integer> {
    List<Book> findBookByBookStatus(BookStatus bookStatus);
}
