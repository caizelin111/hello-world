package com.yiguozhidu.demo.controller;

import com.yiguozhidu.demo.entity.Tbl;
import com.yiguozhidu.demo.entity.User;
import com.yiguozhidu.demo.service.TblService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
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

        @RequestMapping(value = "/user/getAll")
        @ResponseBody
        public String getAll()
        {System.out.println("w asf ");
        List<Tbl> list=tblService.getAll();
        String retStr=" ";
        if(list.size()<=0){
            retStr="$(\".tbody\").html(\"我爱你\")";
        }
        else {
            System.out.println("有数的哦");
            String rStr="";
      for(Tbl tbl1:list){
       rStr+="<tr><td><input type='checkbox' name='choose' id='choose'/></td>" +
               "<td>"+tbl1.getCid()+"</td>" + "<td class='trcountry'>"+tbl1.getCountry()+"</td>" + "<td>"+tbl1.getCapital()+"</td>" +
               "<td><a title='修改' onclick='revise()'><span class='glyphicon glyphicon-edit'></span></a></td></tr>";
System.out.println(tbl1.getCapital());
      }
      retStr="$(\".tbody\").html(\""+ rStr +"\")";
        }

        return retStr;
    }

    @RequestMapping(value = "/user/deleterecord")
    @ResponseBody
    public void deletecord(String country){
        System.out.println(country);
        if(tblService.removeCountryByCountry(country)){
            System.out.println("删除成功");
        }


    }

}
//    $("#tbody").html('');
//        //追加数据
//        $.each(data, function (i, data) {
//        //一个dom就是一个新闻对象
//        $("#tbody").append("<tr>"+
//        "<td>"+data.notitle+"</td>"+
//        "<td>"+data.notime+"</td>"+
//        "<td>"+data.noauthor+"</td>"+
//        "<td><input type='button' id='updBtn' value='修改' οnclick= 'jump("+data.noticeid+")'/>" +"&nbsp&nbsp&nbsp&nbsp"+
//        "<input type='button' id='delBtn' value='删除' οnclick='del("+data.noticeid+")'/></td>"+
//        "</tr>");