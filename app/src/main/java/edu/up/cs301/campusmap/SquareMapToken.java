package edu.up.cs301.campusmap;

import android.graphics.Canvas;

/**
 * Created by symmes19 on 9/4/2016.
 */
public class SquareMapToken extends SimpleMapToken {
    public SquareMapToken(float xCoord, float yCoord){
        super(xCoord,yCoord);
    }
    public void drawOn(Canvas canvas) {
        canvas.drawRect(x, y, x+radius, y+radius, paint);
    }
}
