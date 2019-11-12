package com.bw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;



@RestController
@RequestMapping("/api/user")
public class UserController {
    @RequestMapping
    @ResponseBody
    public String list(HttpServletRequest request){
        String token = request.getHeader("token");
        System.out.println(token);
        return token;
    }
    @RequestMapping("getUser")
    public String list(@RequestParam(value = "id")Integer userId){
        //写出对象
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"张三");
//        int i=7/0;
        map.put(2,"李四");
        map.put(3,"王五");
        return map.get(userId);
    }
}
