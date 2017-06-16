package com.example.aop.support;

import com.example.aop.advice.Advice;
import com.example.aop.advice.AfterAdvice;
import com.example.aop.advice.BeforeAdvice;
import com.example.aop.anotation.PointCut;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by dwb on 2017/6/7.
 */
public class AopProxy implements InvocationHandler{

    private Object targetObject;
    public Object createProxyInstance(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),
                this);
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object advice = null;
        if (method.isAnnotationPresent(PointCut.class)){
            PointCut pointCut = method.getAnnotation(PointCut.class);
            Class adviceClz = pointCut.advice();
            advice = adviceClz.newInstance();
        }
        if ( advice instanceof BeforeAdvice ){
            ((BeforeAdvice)advice).before();
        }
        Object ret = method.invoke(targetObject, args);
        if (advice instanceof AfterAdvice){
            ((AfterAdvice)advice).after(ret);
        }
        return ret;
    }
}
