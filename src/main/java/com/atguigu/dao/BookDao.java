package com.atguigu.dao;

import com.atguigu.pojo.Book;

import java.util.List;

/**
 * dys
 * 2023/2/10 16:00
 *
 * @version 1.0
 */
public interface BookDao {
    public int addBook(Book book);

    public int deleteBookById(Integer id);

    public int updateBook(Book book);

    public Book QueryBookById(Integer id);

    public List<Book> queryBooks();


}
