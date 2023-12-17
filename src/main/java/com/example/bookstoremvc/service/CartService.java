package com.example.bookstoremvc.service;

import com.example.bookstoremvc.dao.BookDao;
import com.example.bookstoremvc.ds.CartBean;
import com.example.bookstoremvc.ds.CartItem;
import com.example.bookstoremvc.entity.Book;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CartService {


    private final CartBean cartBean;
    private final BookDao bookDao;

    public CartService(CartBean cartBean, BookDao bookDao) {
        this.cartBean = cartBean;
        this.bookDao = bookDao;
    }



    public Integer cartSize(){
        return cartBean.cartSize();
    }
    public void removeCartItem(int id){
        cartBean.removeCartItem(id);
    }

    public Set<CartItem> listCartItems(){
        return cartBean.getCartItems();
    }

    public void addToCart(int id){
        cartBean.addToCart(toCartItem(findBookById(id)));
    }
    private Book findBookById(int id){
        return  bookDao.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }
    public CartItem toCartItem(Book book){
        return new CartItem(
                book.getId(),
                book.getTitle(),
                book.getPrice(),
                book.getAuthor().getFirstName() + " "
                + book.getAuthor().getLastName()
        );
    }
}
