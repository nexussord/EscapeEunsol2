package com.example.grayground.myapplication;

import android.graphics.Canvas;
import android.view.MotionEvent;

import java.util.ArrayList;

import static com.example.grayground.myapplication.MainThread.canvas;

/**
 * Created by grayground on 12/29/16.
 */

public class SceneManager {
    private ArrayList<Scene> scenes = new ArrayList<>();
    public static int ACTIVE_SCENE;

    public SceneManager(){
        ACTIVE_SCENE = 0;
        scenes.add(new GameplayScene());
    }

    public void update(){
        scenes.get(ACTIVE_SCENE).update();
    }

    public void draw(Canvas canvas){
        scenes.get(ACTIVE_SCENE).draw(canvas);
    }

    public void recieveTouch (MotionEvent event){
        scenes.get(ACTIVE_SCENE).recieveTouch(event);

    }
}
