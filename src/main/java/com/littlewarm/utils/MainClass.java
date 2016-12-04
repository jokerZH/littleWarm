package com.littlewarm.utils;

import com.littlewarm.dao.mapper.UserMapper;
import com.littlewarm.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainClass {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper mapper = (UserMapper) ctx.getBean("userDao");

        User user = new User("hello", "world");

        mapper.insertUser(user);

        System.out.println(mapper.getUser("hello"));

        mapper.deleteUser("hello");

    }
}
