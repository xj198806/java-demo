package com.example.bridge;

/**
 * Created by dwb on 2017/5/17.
 */
public class RedPainter implements ColorPainter {
    @Override
    public void draw() {
        System.out.println("draw red color...");
    }
}
