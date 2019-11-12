package com.bw.feign;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//实现类
@Component
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String getUser(Integer userId) {
        return "出现异常,熔断执行";
    }
}
