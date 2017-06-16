package com.example.bridge;

/**
 * Created by dwb on 2017/5/17.
 */
public class BridgeDemo {

    public static void main(String[] args){
        ShapePainter shapePainter = new CirclePainter();
        ColorPainter colorPainter = new RedPainter();

        AbstractPainter abstractPainter = new ColorShapePainter(shapePainter,colorPainter);

        abstractPainter.drawColorShape();
    }

}
