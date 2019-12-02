package com.yiguozhidu.demo;

import com.yiguozhidu.demo.entity.User;
import com.yiguozhidu.demo.service.UserService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
public class DemoApplicationTests {

    @Resource
    UserService userService;

    @Test
    public void test1() {
        User user1 = userService.selectUser("caizelin", "12345");

        if (user1.getPassword() == null) {
            System.out.println("账号或密码不正确");
        } else
            System.out.println(user1.getUsername() + user1.getPassword());

    }
        @Test
       public void contextLoads () {
        }

}