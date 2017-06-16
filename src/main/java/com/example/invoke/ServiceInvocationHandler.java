package com.example.invoke;

import com.example.service.DemoService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by dwb on 2017/5/9.
 */
public class ServiceInvocationHandler implements InvocationHandler {

    private DemoService demoService;

    public ServiceInvocationHandler(DemoService demoService){
        this.demoService = demoService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====before====");//定义预处理的工作，当然你也可以根据 method 的不同进行不同的预处理工作
        Object result = method.invoke(demoService, args);
        System.out.println("====after====");
        return result;
    }
}
