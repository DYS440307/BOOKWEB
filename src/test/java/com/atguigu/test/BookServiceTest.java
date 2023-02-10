package com.atguigu.test;

import com.atguigu.pojo.Book;
import com.atguigu.service.BookService;
import com.atguigu.service.impl.BookServiceImpl;
import org.junit.jupiter.api.Test;
import sun.print.PSPrinterJob;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * dys
 * 2023/2/10 20:55
 *
 * @version 1.0
 */
class BookServiceTest {
private BookService bookService = new BookServiceImpl();
    @Test
    void addBook() {
        bookService.addBook(new Book(null , "国哥在手，天下我有！" , "1125" , new BigDecimal(1000000) , 100000000 , 0 , null));
    }

    @Test
    void deleteBook() {
        bookService.deleteBook(22);
    }

    @Test
    void updateBook() {
        bookService.updateBook(new Book(22 , "社会我国哥，人狠话不多！" , "1125" , new BigDecimal(999999) , 10 , 111110 , null));
    }

    @Test
    void queryBookById() {
        System.out.println(bookService.queryBookById(22));
    }

    @Test
    void queryBooks() {
        for (Book queryBook : bookService.queryBooks()) {
            System.out.println(queryBook);
        }
    }
}