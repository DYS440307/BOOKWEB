package com.atguigu.dao.impl;

import com.atguigu.dao.BookDao;
import com.atguigu.pojo.Book;

import java.util.List;

/**
 * dys
 * 2023/2/10 16:17
 *
 * @version 1.0
 */
public class BookDaoImpl extends BaseDao implements BookDao {
    @Override
    public int addBook(Book book) {
        String sql = "insert into t_book(`id` , `name` , `author` , `price` , `sales` , `stock` , `img_path`) values(?,?,?,?,?,?,?)";
        return update(sql , book.getName() , book.getAuthor() , book.getPrice() , book.getSales() , book.getStock() , book.getImgPath());
    }

    @Override
    public int deleteBookById(Integer id) {
        String sql = "delete from t_book where id=?";
        return update(sql , id);
    }

    @Override
    public int updateBook(Book book) {
        String sql = "update t_book set `name`=?,`author`=?,`price`=?,`sales`=?,`stock`=?,`img_path`=? where id = ?";
        return update(sql , book.getName() , book.getAuthor() , book.getPrice() , book.getSales() , book.getStock() , book.getImgPath() , book.getId());
    }

    @Override
    public Book QueryBookById(Integer id) {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` imgPath from t_book where id = ?";
        return queryForOne(Book.class , sql , id);
    }

    @Override
    public List<Book> queryBooks() {
        String sql = "select `id` , `name` , `author` , `price` , `sales` , `stock` , `img_path` imgPath from t_book";
        return queryForList(Book.class , sql);
    }
}
