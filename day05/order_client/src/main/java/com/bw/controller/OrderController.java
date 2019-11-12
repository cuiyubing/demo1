package com.bw.controller;

import com.bw.feign.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//调用者controller层
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/{id}")
    public String list(@PathVariable("id")Integer userId){
        return orderService.getUser(userId);
    }
}
