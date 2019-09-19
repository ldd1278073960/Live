package com.dp.live.service.impl;

import com.dp.live.domain.entity.User;
import com.dp.live.mapper.UserMapper;
import com.dp.live.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 实现登陆注册mapper层的接口
 * @author Administrator
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    /**
     * 注册，在数据库添加一条数据，返回受影响行数
     * @param user
     * @return
     */
    @Override
    public int register(User user){

        int register = userMapper.register(user);
        return register;
    }

    @Override
    public int updatePassword(String userName, String userPassword) {
        int i = userMapper.updatePassword(userName, userPassword);
        return i;
    }

    /**
     * 登陆
     * @param user
     * @return
     */
    @Override
    public User login(User user){


        User login = userMapper.login(user);
        return login;
    }

}
