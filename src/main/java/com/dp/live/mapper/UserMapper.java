package com.dp.live.mapper;

import com.dp.live.domain.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 * 用户表接口
 */
public interface UserMapper {


    /**
     * 登陆
     * @param user
     * @return
     */
    User login(@Param("user")User user);


    /**
     * 注册
     * @param user
     * @return
     */
    int register(@Param("user")User user);

    /**
     * 修改密码
     * @param userName
     * @param userPassword
     * @return
     */
    int updatePassword(@Param("userName") String userName ,@Param("userPassword") String userPassword);
}
