package com.dp.live.domain.entity;

import lombok.Data;

/**
 * @author Administrator
 * 用户表
 */
@Data
public class User {


    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户电话号码
     */
    private String userPhone;

}
