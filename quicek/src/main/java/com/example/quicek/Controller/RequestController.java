package com.example.quicek.Controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//1.
//@RestController
//public class RequestController {
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        String name=request.getParameter("name");
//        String sage=request.getParameter("age");
//        int age=Integer.parseInt(sage);
//        System.out.println(age+":"+name);
//        return "OK";
//    }
//}

//2.
//@RestController
//public class RequestController {
//    @RequestMapping("/simpleParam")
//    //spring会自动类型转换
//    public String simpleParam(String name,Integer age){
//
//        System.out.println(age+":"+name);
//        return "OK";
//    }
//}

//3.
//但是requestparam就是必须传递，也可以设置参数
@RestController
public class RequestController {
    @RequestMapping("/simpleParam")
    //spring会自动类型转换
    public String simpleParam(@RequestParam(name="name",required = false)String username, Integer age){

        System.out.println(age+":"+username);
        return "OK";
    }
}