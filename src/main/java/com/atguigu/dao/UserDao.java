package com.atguigu.dao;

import com.atguigu.pojo.User;

/**
 * dys
 * 2023/2/6 8:33
 *
 * @version 1.0
 */
public interface UserDao {


    /**
     * 根据用户名字查询信息
     * @param username
     * @return  null说明没这个人
     */
    public User queryUserByUsername(String username);
    /**
     * 根据用户名字 和 密码查询用户信息
     *
     * @param username
     * @return null说明用户名名字或密码错误
     */
    public User queryUserByUsernameAndPassword(String username,String password);

    /**
     * 保存用户信息
     * @param user
     * @return 返回sql受影响行数,操作失败返回-1
     */
    public  int saverUser(User user);



}
