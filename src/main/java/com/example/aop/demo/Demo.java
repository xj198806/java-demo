package com.example.aop.demo;

import com.example.aop.support.AopProxy;
import com.example.aop.support.ProxyBeanPostProcessor;
import com.example.service.DemoService;
import com.example.service.DemoServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dwb on 2017/6/7.
 */
public class Demo {

    public static void main(String[] args){
//        DemoService demoService = (DemoService)new AopProxy().createProxyInstance(new DemoServiceImpl());
//        demoService.service();

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoServiceImpl.class,ProxyBeanPostProcessor.class);
        DemoService demoService = applicationContext.getBean(DemoService.class);
        demoService.service();
    }
}
