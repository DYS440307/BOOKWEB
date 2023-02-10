package com.atguigu.test;

import com.atguigu.dao.BookDao;
import com.atguigu.dao.impl.BookDaoImpl;
import com.atguigu.pojo.Book;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

/**
 * dys
 * 2023/2/10 16:35
 *
 * @version 1.0
 */
class BookDaoTest {
    private BookDao bookDao = new BookDaoImpl();

    @Test
    void addBook() {
        bookDao.addBook(new Book(null , "国哥为什么这么帅啊a！" , "191125" , new BigDecimal(9999) , 1100000 , 0 , null));
    }

    @Test
    void deleteBookById() {
        bookDao.deleteBookById(21);
    }

    @Test
    void updateBook() {
        bookDao.updateBook(new Book(21 , "大家都可768以这么帅！" , "国哥" , new BigDecimal(9999) , 1100000 , 0 , null));
    }

    @Test
    void queryBookById() {
        System.out.println(bookDao.queryBookById(21));
    }

    @Test
    void queryBooks() {
        for (Book queryBook : bookDao.queryBooks()) {
            System.out.println(queryBook);
        }
    }
}