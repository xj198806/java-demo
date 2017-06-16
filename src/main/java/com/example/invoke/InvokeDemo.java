package com.example.invoke;

import com.example.service.DemoServiceImpl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.Proxy;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * Created by dwb on 2017/5/9.
 */
public class InvokeDemo {

    public static void main(String[] args) throws Throwable {
        DemoServiceImpl demoServiceImpl = new DemoServiceImpl();
        ServiceInvocationHandler handler = new ServiceInvocationHandler(demoServiceImpl);
        Object service = Proxy.newProxyInstance(DemoServiceImpl.class.getClassLoader(),
                DemoServiceImpl.class.getInterfaces(),handler);

        getMH(service,"service").invokeExact();
    }

    private static MethodHandle getMH(Object receiver,String method) throws Throwable {
        // MethodType：代表“方法类型”，包含了方法的返回值（methodType()的第一个参数）和具体参数（methodType()第二个及以后的参数）。
        MethodType mt = MethodType.methodType(void.class);
        // lookup()方法来自于MethodHandles.lookup，这句的作用是在指定类中查找符合给定的方法名称、方法类型，并且符合调用权限的方法句柄。
        // 因为这里调用的是一个虚方法，按照Java语言的规则，方法第一个参数是隐式的，代表该方法的接收者，也即是this指向的对象，这个参数以前是放在参数列表中进行传递，现在提供了bindTo()方法来完成这件事情。
        return lookup().findVirtual(receiver.getClass(), method, mt).bindTo(receiver);
    }

}
