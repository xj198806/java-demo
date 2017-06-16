package com.example.aop.advice;

/**
 * Created by dwb on 2017/6/7.
 */
@FunctionalInterface
public interface BeforeAdvice extends Advice{
    public Object before();
}
