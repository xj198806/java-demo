package com.example.aop.demo;

import com.example.aop.advice.BeforeAdvice;

/**
 * Created by dwb on 2017/6/7.
 */
public class BeforeAdviceDemo implements BeforeAdvice{
    @Override
    public Object before() {
        System.out.println("do before...");
        return null;
    }
}
