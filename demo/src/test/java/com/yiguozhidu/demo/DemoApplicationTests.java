package com.yiguozhidu.demo;

import com.yiguozhidu.demo.entity.Tbl;
import com.yiguozhidu.demo.entity.User;
import com.yiguozhidu.demo.service.TblService;
import com.yiguozhidu.demo.service.UserService;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=DemoApplication.class)
@WebAppConfiguration
public class DemoApplicationTests {

    @Resource
    UserService userService;
    TblService tblService;
    @Test
    public void test1() {
        User user1 = userService.selectUser("caizelin", "12345");

        if (user1.getPassword() == null) {
            System.out.println("账号或密码不正确");
        } else
            System.out.println(user1.getUsername() + user1.getPassword());
          String cap=tblService.loadCapitalByCountry("北京").getCapital();
            System.out.println(cap);
//        Tbl tbl1=new Tbl();
//        int n=1;
//        tbl1.setCid(n);
//        tbl1.setCountry("中国");
//        tbl1.setCapital("gz");
//        if(tblService.update(tbl1)){
//            System.out.println("成功了");
////                    tblService.loadCapitalByCountry("中国").getCapital());
//        }else
//            System.out.println("更新不成功");
    }
        @Test
       public void contextLoads () {
        }

}