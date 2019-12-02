package com.yiguozhidu.demo.controller;

import com.yiguozhidu.demo.entity.Tbl;
import com.yiguozhidu.demo.entity.User;
import com.yiguozhidu.demo.service.TblService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;
@RestController
public class TblController {
    @Resource
    TblService tblService;


//    @PostMapping(value = "user/tomain")
//    public String denglu(HttpSession session,HttpServletRequest request, Map<String,Object> map) {
//
////        System.out.println("我爱沈婷婷");
//        Tbl tbl = tblService.loadCapitalByCountry(request.getParameter("country"));
//        if (tbl != null) {
////            System.out.println("查询国家为：" + tbl.getCapital());
//            map.put("tbl", tbl);
//        }
//
//
//      String  username1=(String)session.getAttribute("username");
//        if (username1 != null) {
//
//            map.put("username", username1);
//            System.out.println("session里面不是空的   " + username1);
//
//        }
//        return "main";
//        }

//        String username=(String) session.getAttribute("username");
//        map.put("username",username);
//        return "main";
//        }
    @RequestMapping(value = "/user/getcapital", method = RequestMethod.POST)
    @ResponseBody
    public String getcapitaldata(HttpServletRequest request,HttpSession session,Map<String,Object> map,String country) {
//ajax获取的时候已经有了country，控制器可以直接使用。
        Tbl tbl = tblService.loadCapitalByCountry(country);

        String username1 = (String) session.getAttribute("username");
        if (username1 != null) {
//
            map.put("username", "欢迎用户："+username1);
            System.out.println("session里面不是空的   " + username1);
        }
        else{
            System.out.println("session为空");
        };

//            String retStr = "$('.t0.row').html();";class="font" style="margin-left: 1150px"
        String retStr = "";
            if (tbl != null) {
                System.out.println("有调用到" + tbl.getCapital());
                String rStr = "";
                System.out.println("查询国家为：" + tbl.getCapital());
                rStr = "<p>" + tbl.getCapital() + "</p>";
                retStr = "$(\".neirong\").html(\"" + rStr + "\")";
            }
            return retStr;
        }

    }
