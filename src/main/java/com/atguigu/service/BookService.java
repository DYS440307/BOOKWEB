package com.atguigu.service;

import com.atguigu.pojo.Book;

import java.util.List;

/**
 * dys
 * 2023/2/10 20:49
 *
 * @version 1.0
 */
public interface BookService {
    public void addBook(Book book);

    public void deleteBook(Integer id);

    public void updateBook(Book book);

    public Book queryBookById(Integer id);

    public List<Book> queryBooks();

}
