package com.littlewarm.service;

import com.littlewarm.dao.mapper.UserMapper;
import com.littlewarm.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserService {

    @Resource(name="userDao")
    private UserMapper userMapper;

    User getUser(String id) {
        User user = userMapper.getUser(id);
        if(user == null) {
            user = new User(id, "");
            userMapper.insertUser(user);
        }

        return user;
    }

	void deleteUser(String id) {
	    userMapper.deleteUser(id);
    }
}
