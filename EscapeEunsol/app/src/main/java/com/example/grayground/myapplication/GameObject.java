package com.example.grayground.myapplication;

import android.graphics.Canvas;
import android.graphics.Rect;

/**
 * Created by grayground on 12/28/16.
 */

public interface GameObject {
    public void draw (Canvas canvas);
    public void update();

    Rect getRectangle();
}
