package com.example.annonation;

import java.lang.reflect.Method;

/**
 * Created by dwb on 2017/5/16.
 */
public class AnnotationDemo {

    public static void main(String[] args){

        try {
            Class clz = Class.forName("com.example.annonation.Component");//Component.class;
            if (clz.isAnnotationPresent(Description.class)) {
                Description description = (Description) clz.getAnnotation(Description.class);
                System.out.println(description.value());
                Method method = clz.getDeclaredMethod("work");
                if (method.isAnnotationPresent(Author.class)){
                    Author author = method.getAnnotation(Author.class);
                    System.out.println(author.name() + "---" + author.group());
                }
            }
            Component component = (Component) clz.newInstance();
            component.work();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
