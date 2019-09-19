package com.dp.live.controller;


import com.dp.live.domain.entity.User;
import com.dp.live.service.UserService;
import com.dp.live.utils.AesEncryptUtils;
import com.dp.live.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Slf4j
@Controller
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 注册
     * @param user
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/register")
    public Result register( @RequestBody User user){
        try {
            String encrypt = AesEncryptUtils.encrypt(user.getUserPassword());
            user.setUserPassword(encrypt);
            int register = userService.register(user);
            return Result.success(register);
        }catch (Exception e){
         log.error(e.getMessage());
         return Result.error();
        }
    }

    /**
     * 登陆功能
     * @param user
     * @return
     */
    @PostMapping(value = "/login")
    @ResponseBody
    public Result login(@RequestBody User user){
        try {
              String encrypt = AesEncryptUtils.encrypt(user.getUserPassword());
              user.setUserPassword(encrypt);
              User login = userService.login(user);
              if(login != null){
                  return Result.success(login) ;
              }else {
                  return Result.error();
             }
          }catch (Exception e){
              log.error(e.getMessage());
              return Result.error();
          }
    }

    /**
     * 修改密码
     * @param userName
     * @param userPassword
     * @return
     */
    @ResponseBody
    @RequestMapping("/updatePassword")
    public Result updatePassword(String userName , String userPassword){
        try{
            String encrypt = AesEncryptUtils.encrypt(userPassword);
            int i = userService.updatePassword(userName, encrypt);
            return Result.success(i);
        }catch (Exception e){
            return Result.error();
        }
    }

}