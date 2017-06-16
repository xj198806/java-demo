package com.example.service;

import com.example.aop.anotation.PointCut;
import com.example.aop.demo.BeforeAdviceDemo;
import org.springframework.stereotype.Component;

/**
 * Created by dwb on 2017/5/8.
 */
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public void service() {
        System.out.println("demo println...");
    }
}
