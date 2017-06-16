package com.example.aop.anotation;

import com.example.aop.advice.Advice;
import com.example.aop.advice.BeforeAdvice;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by dwb on 2017/6/7.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface PointCut {
    Class advice();
}
