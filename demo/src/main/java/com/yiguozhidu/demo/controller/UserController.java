package com.yiguozhidu.demo.controller;


import com.yiguozhidu.demo.entity.User;
import com.yiguozhidu.demo.service.impl.UserServiceImpl;
import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.context.request.SessionScope;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.Map;

@Controller
@RequestMapping("/user")
//获得model里面为users的对象。
//首先使用model把对象放置到model中，类上加了@SessionAttributes注解，方法执行完之后会检查放置到model
//        中的数据是否也需要放置到session中。如果需要，就放置一份。然后就可以直接在session中获取数据了。
//@SessionAttributes("username")
public class UserController {
    @Resource
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/")
    public String home() {

        return "index";
    }

    @GetMapping("/tomain")
    public String mainpage() {
        return "main";
    }

    @GetMapping("/tologin")
    public String loginpage() {
        return "login";
    }

    @PostMapping(value = "/login")

    public String doLogin(HttpServletRequest request, HttpSession session, Model model, User user, Map<String, Object> map) {
//        方法一：
//        String username=request.getParameter("username");
//        String password=request.getParameter("password");
//        System.out.println(username+password);
//            User user1 = new User();
//           user1=userServiceImpl.selectUser(username,password);
//        方法二：
        User user1 = userServiceImpl.selectUser(user.getUsername(), user.getPassword());
        String name1 = "yiguozhidu001";
        String name2 = "yiguozhidu002";
        String name3 = "yiguozhidu003";
        String password1 = "123456";
        {
            if (user1 == null) {
//                map.put("msg", "密码或账号错误!");
                System.out.println("密码或者账号错误");
                return "login";
            } else if (user1.getUsername().equals(name1) && user1.getPassword().equals(password1)||user1.getUsername().equals(name2) && user1.getPassword().equals(password1)||user1.getUsername().equals(name3) && user1.getPassword().equals(password1)) {
                System.out.println("管理员登录：" + user1.getUsername());
                model.addAttribute("username",  user1.getUsername());
                session.setAttribute("username", "管理员：" + user1.getUsername());
                return "guanliyuan";
            } else {
                model.addAttribute("username",   user1.getUsername());
                session.setAttribute("username", user1.getUsername());
//               User user1=(User)session.getAttribute("users");
//                map.put("users", user);
//                System.out.println(user1.getUsername());
                System.out.println("账号密码正确");
//                User user2=(User)session.getAttribute("users");
                return "main";
            }

        }
    }

   @GetMapping(value = "/toregist")
   public  String zhuce(){
        return "regist";
   }

   @PostMapping(value ="/zhuceing")
public  String doregist(Model model, User user, HttpSession session, Map<String, Object> map){
//       User user1=(User)session.getAttribute("users");
//       System.out.println("之前的用户为："+user1.getUsername());
       if(userServiceImpl.insertUser(user.getUsername(),user.getPassword())==true)
       {
           System.out.println("注册成功，欢迎你！"+user.getUsername());
           //由于model在页面转跳的时候已经失效，所以需要重新 model.addAttribute，然后放在session域中。
        return "login";}
       else{
           System.out.println("注册失败");}
        return "regist";
   }

    @GetMapping("/tozuxiao")
    public String execute(Model model, SessionStatus sessionStatus, HttpServletRequest request, HttpSession session) {


       System.out.println("dfsf"+request.getSession().getAttribute("username"));
        if (userServiceImpl.removeUserByname((String ) request.getSession().getAttribute("username"))==true) {
//                System.out.println("注销成功，用户被删除");
                Enumeration em=request.getSession().getAttributeNames();

                while (em.hasMoreElements()){
                    request.getSession().removeAttribute(em.nextElement().toString());
                }
//                删除session域中的属性。
//            session.removeAttribute("username");//我这里是先取出httpsession中的user属性
//            session.invalidate();  //然后是让httpsession失效
//            sessionStatus.setComplete();//最后是调用sessionStatus方法
//            String username=  (String)request.getSession().getAttribute("username");
//            if(username==null){System.out.println("session已经被清除");}

        }
        return "main";
    }}
//当要求转跳的时候，直接使用getMapping，而在进行处理时，表单中存在post方法，则在controller层需要一个PostMapping。
