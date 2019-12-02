package com.yiguozhidu.demo.service.impl;

import com.yiguozhidu.demo.entity.User;
import com.yiguozhidu.demo.mapper.UserMapper;
import com.yiguozhidu.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
   @Resource
   UserMapper userMapper;
   public boolean insertUser(String username,String password){
       userMapper.insertUser(username,password);
       return true;
   }
    public User selectUser(String username, String password){
        User user1=userMapper.selectUser(username,password);
//        System.out.println(user1.getUsername()+"  "+user1.getPassword());
       return user1;

    }
    public boolean removeUserByname(String username){
       userMapper.removeUserByname(username);
       return true;
    }
}
