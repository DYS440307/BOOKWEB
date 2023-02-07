package com.atguigu.dao.impl;

import com.atguigu.dao.UserDao;
import com.atguigu.pojo.User;

/**
 * dys
 * 2023/2/6 8:40
 *
 * @version 1.0
 */
public class UserDapImpl extends BasicDAO<User> implements UserDao {
    @Override
    public User queryUserByUsername(String username) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where `username` =  ?";
        return querySingle(sql, User.class, username);


    }

    @Override
    public User queryUserByUsernameAndPassword(String username, String password) {
        String sql = "select `id`,`username`,`password`,`email` from t_user where `username` =  ? and password=?";
        return querySingle(sql, User.class, username,password);
    }

    @Override
    public int saverUser(User user) {
        String sql = "insert into t_user(username,password,email) values(?,?,?)";
        return update(sql,user.getUsername(),user.getPassword(),user.getEmail());

    }
}
