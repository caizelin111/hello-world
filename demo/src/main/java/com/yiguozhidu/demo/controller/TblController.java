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
    @RequestMapping(value = "/user/getcapital", method = RequestMethod.POST)
    @ResponseBody
    public String getcapitaldata(HttpServletRequest request,HttpSession session,Map<String,Object> map,String country) {
//ajax获取的时候已经有了country，控制器可以直接使用。
// 查询
        Tbl tbl = tblService.loadCapitalByCountry(country);
        String username1 = (String) session.getAttribute("username");
        if (username1 != null) {
//
            map.put("username", username1);
            System.out.println("session里面不是空的   " + username1);
        }
        else{
            System.out.println("session为空");
        };
//            String retStr = "$('.t0.row').html();";class="font" style="margin-left: 1150px"
        String retStr = "";
            if (tbl != null) {
                String rStr = "";
                System.out.println("查询的国家为：" + tbl.getCapital());
                System.out.println("首都是：" + tbl.getCapital());
                rStr = "<p>" + tbl.getCapital() + "</p>";
                retStr = "$(\".neirong\").html(\"" + rStr + "\")";
            }
            return retStr;
        }
//获取所有数据
        @RequestMapping(value = "/user/getAll")
        @ResponseBody
        public String getAll()
        {System.out.println("w asf ");
        List<Tbl> list=tblService.getAll();
        String retStr=" ";
        if(list.size()<=0){
            retStr="$(\".tbody\").html(\"\")";
        }
        else {
//            System.out.println("有数的哦");
            String rStr="";
            int i=1;
      for(Tbl tbl1:list){
       rStr+="<tr><td><input type='checkbox' name='choose' id='choose'/></td>" +
               "<td>"+i+"</td>" + "<td class='trcountry'>"+tbl1.getCountry()+"</td>" + "<td>"+tbl1.getCapital()+"</td>" +
               "<td ><a class='tt' title='修改' data-toggle='modal' data-target='#myModal'>修改</a></td></tr>";
System.out.println(tbl1.getCapital());
                i++;
      }
      retStr="$(\".tbody\").html(\""+ rStr +"\")";
        }

        return retStr;
    }
//删除数据
    @RequestMapping(value = "/user/deleterecord")
    @ResponseBody
    public void deletecord(String country){
        System.out.println(country);
        if(tblService.removeCountryByCountry(country)){
            System.out.println("删除成功，删除的国家记录是："+country);
        }
    }
    @RequestMapping(value = "/user/update")
    @ResponseBody
    public void update(String country,String capital){
        System.out.println("开始更新");
            System.out.println("前端的国家为"+country);
        System.out.println("前端修改后的首都为"+capital);
        if(tblService.update0(country,capital))
            System.out.println("更新成功,更新后的首都为"+tblService.loadCapitalByCountry(country).getCapital());
else {System.out.println("更新失败，找不到对应国家");}

//    }

}

//增加数据
    @RequestMapping(value = "/user/insert")
    @ResponseBody
    public void insert(String country,String capital){
        System.out.println("添加的国家-首都为"+country+"-"+capital);
        if(tblService.insert(country,capital))
            System.out.println("添加成功");
        else
            System.out.println("添加失败");

    }
//学习
    @RequestMapping(value = "/user/study")
    @ResponseBody
    public String study(String cid){
        System.out.println("调用到了噢");
        String retStr = "";
        String rStr="";
        Tbl tbl1=tblService.getAllById(Integer.parseInt(cid));
        if(tbl1!=null){
            System.out.println("国家为"+tbl1.getCountry()+"首都为"+tbl1.getCapital());
            rStr = "<p style='font-size: 30px '>" +tbl1.getCountry()+"<br>"+ tbl1.getCapital() + "</p>";
        }
        retStr = "$(\".study\").html(\"" + rStr + "\")";
        return retStr;
    }


}

