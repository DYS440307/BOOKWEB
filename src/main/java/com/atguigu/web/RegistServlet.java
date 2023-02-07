package com.atguigu.web;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * dys
 * 2023/2/6 10:08
 *
 * @version 1.0
 */
public class RegistServlet extends HttpServlet {
    private UserService userService = new UserServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        1、获取请求的参数,写的是表单项的name值
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String code = req.getParameter("code");
//        2、检查验证码是否正确正确--写死了
        if ("adcde".equalsIgnoreCase(code)) {

//        3、检查用户名是否可用可用
            if (userService.existsUsername(username)) {
                System.out.println("用户名字" + username + "已经存在不可用");
                req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
            } else {
                userService.registerUser(new User(null, username, password, email));
                req.getRequestDispatcher("/pages/user/regist_success.html").forward(req, resp);

            }
//        调用Service保存到数据库
//        跳到注册成功regist_success.html
//        不可用跳回注册页面
        } else {
//        不正确跳回注册页面
            System.out.println("验证码错误");
            req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
        }

    }
}
