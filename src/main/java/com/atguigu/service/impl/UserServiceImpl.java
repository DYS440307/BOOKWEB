package com.atguigu.service.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDapImpl;
import com.atguigu.pojo.User;
import com.atguigu.service.UserService;

/**
 * dys
 * 2023/2/6 9:31
 *
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDapImpl();

    @Override
    public void registerUser(User user) {
        userDao.saverUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
    }

    @Override
    public boolean existsUsername(String username) {
        if (userDao.queryUserByUsername(username) == null) {
            //等于null,说明没查到,表示可用
            return false;
        }
        return true;
    }
}
