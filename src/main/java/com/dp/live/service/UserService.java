package com.dp.live.service;

import com.dp.live.domain.entity.User;
import com.dp.live.utils.Result;

/**
 *
 * @author Administrator
 */
public interface UserService {


    /**
     * 登陆
     * @param user
     * @return
     */
    User login(User user);


    /**
     * 注册
     * @param user
     * @return
     */
    int register(User user);

    /**
     * 修改密码
     * @param userName
     * @param userPassword
     * @return
     */
    int updatePassword(String userName ,String userPassword);

}
