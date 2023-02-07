package com.atguigu.service;

import com.atguigu.pojo.User;

/**
 * dys
 * 2023/2/6 9:21
 *
 * @version 1.0
 */
public interface UserService {
    /**
     * 注册用户
     *
     * @param user
     */
    public void registerUser(User user);

    /**
     * 登录
     * @param user
     * @return 返回null 登陆失败,返回有值登陆成功
     */
    public User login(User user);

    /**
     * 判断用户名子是否存在
     * @param username
     * @return true:用户名存在   false:用户名不存在
     */
    public boolean existsUsername(String username);
}
