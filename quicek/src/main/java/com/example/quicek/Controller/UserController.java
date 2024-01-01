package com.example.quicek.Controller;

import com.example.quicek.pojo.Adress;
import com.example.quicek.pojo.User;
import org.springframework.cglib.core.Local;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class UserController{
    @RequestMapping("/simplePojo")
    //spring会自动类型转换
    public String simpleParam(User user){

        System.out.println(user);
        return "OK";
    }
@RequestMapping("/getmore")
    public String getmore(@RequestParam List<String> hobby)
    {
        System.out.println(hobby);
        return "OK";
    }

@RequestMapping("/getdate")
public String getdate(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")LocalDate update)
{

    System.out.println(update);
    return "OK";
}

@RequestMapping("/getParam")
    public String getParam(@RequestBody User user)
{
    System.out.println(user);
    return "OK";
}

@RequestMapping("/path/{id}/{name}")
    public String pathParam(@PathVariable Integer id,@PathVariable String name)
{
    System.out.println(id+name);
    return "OK";
}

@RequestMapping("/hello")
    public String hello()
{
    return "hello";
}
@RequestMapping("/getAddr")
    public Adress getAddr()
{
    Adress addr=new Adress();
    addr.setCity("河南");
    addr.setProvince("郑州");
    return addr;
}

@RequestMapping("/getList")
public List<Adress> getList()
{
 List<Adress> list=new ArrayList<>();
 Adress addr=new Adress();
    addr.setCity("河南");
    addr.setProvince("郑州");
 Adress addr1=new Adress();
    addr1.setCity("北京");
    addr1.setProvince("北京");
 list.add(addr);
 list.add(addr1);
 return list;

}

}
