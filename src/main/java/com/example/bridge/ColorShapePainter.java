package com.example.bridge;

import java.security.PublicKey;

/**
 * Created by dwb on 2017/5/17.
 */
public class ColorShapePainter extends  AbstractPainter {

    public ColorShapePainter(ShapePainter shapePainter, ColorPainter colorPainter){
        super(shapePainter,colorPainter);
    }
    @Override
    public void drawColorShape() {
        this.getShapePainter().draw();
        this.getColorPainter().draw();
    }
}
