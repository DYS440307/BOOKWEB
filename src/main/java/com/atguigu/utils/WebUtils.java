package com.atguigu.utils;

import com.atguigu.pojo.User;
import org.apache.commons.beanutils.BeanUtils;

import java.util.Map;

/**
 * dys
 * 2023/2/10 13:19
 *
 * @version 1.0
 */
public class WebUtils {
    public static <T> T copyParamToBean(Map value , T bean) {
        try {
//            User user = new User();
            System.out.println("注入之前" + bean);

            /**
             * 把所有的请求参数都注入javaBean对象中
             */
            BeanUtils.populate(bean , value);
            System.out.println("注入之后" + bean);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return bean;
    }
}
