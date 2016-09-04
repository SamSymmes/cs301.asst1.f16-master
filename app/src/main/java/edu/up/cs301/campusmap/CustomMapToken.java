package edu.up.cs301.campusmap;

import android.graphics.Canvas;

/**
 * Created by symmes19 on 9/4/2016.
 */
public class CustomMapToken extends SimpleMapToken {
    public CustomMapToken(float xCoord, float yCoord){
        super(xCoord,yCoord);
    }
    public void drawOn(Canvas canvas) {
        canvas.drawCircle(x, y, radius, paint);
        canvas.drawCircle(x-(radius/3), y-(radius/3), radius*2/3, paint);
        canvas.drawCircle(x+(radius*2/3), y-(radius/3), radius*2/3, paint);
    }
}