package com.example.bridge;

/**
 * Created by dwb on 2017/5/17.
 */
public abstract class AbstractPainter {
    private ShapePainter shapePainter;

    private ColorPainter colorPainter;

    public abstract void drawColorShape();

    public AbstractPainter(ShapePainter shapePainter, ColorPainter colorPainter){
        this.shapePainter = shapePainter;
        this.colorPainter = colorPainter;
    }

    public ShapePainter getShapePainter() {
        return shapePainter;
    }

    public void setShapePainter(ShapePainter shapePainter) {
        this.shapePainter = shapePainter;
    }

    public ColorPainter getColorPainter() {
        return colorPainter;
    }

    public void setColorPainter(ColorPainter colorPainter) {
        this.colorPainter = colorPainter;
    }
}
