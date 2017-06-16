package com.example.service;

import com.example.aop.anotation.PointCut;
import com.example.aop.demo.BeforeAdviceDemo;

/**
 * Created by dwb on 2017/5/5.
 */
public interface DemoService {
    @PointCut(advice = BeforeAdviceDemo.class)
    void service();
}
