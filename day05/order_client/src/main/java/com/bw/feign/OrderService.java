package com.bw.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-server",fallback = OrderServiceImpl.class)
public interface OrderService {
    @RequestMapping("/user/getUser")
    public String getUser(@RequestParam(value = "id") Integer userId);
}
