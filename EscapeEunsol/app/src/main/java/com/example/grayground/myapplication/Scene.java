package com.example.grayground.myapplication;

import android.graphics.Canvas;
import android.view.MotionEvent;

/**
 * Created by grayground on 12/29/16.
 */

public interface Scene {
    public void update();
    public void draw(Canvas canvas);
    public void terminate();
    public void recieveTouch(MotionEvent event);
}
