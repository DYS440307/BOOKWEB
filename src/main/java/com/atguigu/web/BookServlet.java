package com.atguigu.web;

import com.atguigu.pojo.Book;
import com.atguigu.service.BookService;
import com.atguigu.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * dys
 * 2023/2/10 21:02
 *
 * @version 1.0
 */
public class BookServlet extends BaseServlet {
    private BookService bookService = new BookServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        doPost(req , resp);
    }

    protected void add(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req , resp);
    }

    protected void delete(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req , resp);
    }

    protected void update(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req , resp);
    }

    protected void list(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        //1 通过BookService查询全部图书
        List<Book> books = bookService.queryBooks();
        //2 把全部图书保存到Request域中
        req.setAttribute("books" , books);
        //3、请求转发到/pages/manager/book_manager.jsp页面
        req.getRequestDispatcher("/pages/manager/book_manager.jsp").forward(req , resp);
    }

}
