package com.example.manuel.blankproject;


import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;


 // CUSTOM VIEW PAGER PARA QUE AL DESLIZAR HACIA LOS LADOS NO CAMBIE DE FRAGMENT (SINO UTILIZAR EL VIEWPAGER "NORMAL")
public class CustomViewPager extends ViewPager{

    private boolean swipeable;

    public CustomViewPager(Context context) {
        super(context);
    }

    public CustomViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (this.swipeable) {
            return super.onTouchEvent(event);
        }
        return false;
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {

        if (this.swipeable) {
            return super.onInterceptTouchEvent(event);
        }
        return false;
    }

    public void setSwipeable(boolean swipeable) {

        this.swipeable = swipeable;

    }

}

