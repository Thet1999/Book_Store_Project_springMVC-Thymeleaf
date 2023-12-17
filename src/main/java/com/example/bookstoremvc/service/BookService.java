package com.example.bookstoremvc.service;

import com.example.bookstoremvc.dao.BookDao;
import com.example.bookstoremvc.entity.Book;
import com.example.bookstoremvc.entity.BookStatus;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {




    private final BookDao bookDao;





    public Book findBookById(int id){
        return bookDao.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

    public List<Book> searchBookByBookStatus(BookStatus bookStatus){
        return bookDao.findBookByBookStatus(bookStatus);
    }

}
