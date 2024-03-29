package com.bw.conf;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.zip.ZipFile;
@Component
public class LoginFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";//拦截前
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;//是否执行拦截
    }

    @Override
    public Object run() throws ZuulException {
        //判断请求参数中是否有token
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        if(token==null||token.trim().equals("")){ //||  &&  相对于|  & 具有短路功能
            requestContext.setSendZuulResponse(false);//拦截
            try {
                requestContext.getResponse().sendRedirect("http://www.baidu.com");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
