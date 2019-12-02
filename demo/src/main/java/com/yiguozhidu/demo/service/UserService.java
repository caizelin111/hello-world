package com.yiguozhidu.demo.service;

import com.yiguozhidu.demo.entity.User;

public interface UserService {
    public boolean insertUser(String username, String password);

    public User selectUser(String username, String password);

    public boolean removeUserByname(String username);
}
