package com.example.sideproject_06;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

import androidx.core.view.animation.PathInterpolatorCompat;

public class DragAdapter implements View.OnTouchListener{

    Context mContext;
    GestureDetector detector;
    public String firstY = "0";
    float moveY = 0;
    float ddd = 0;
    boolean move = false;
    static int height_value = 300;
    static Interpolator interpolator_bounce = PathInterpolatorCompat.create(0.34f, 1.56f, 0.64f, 1f);
//    Interpolator interpolator_bounce = new MyBounceInterpolator(0.2, 5);
    public DragAdapter(Context context){
        mContext = context;
    }
    static float rectCalcHeight = 0;

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        final int Y = (int) event.getRawY();
        int action = event.getAction();
        float curX = event.getX();
        float startY = view.getY();
        String curY = String.format("%.2f", event.getY());

        switch (event.getAction() & MotionEvent.ACTION_MASK) {

            case MotionEvent.ACTION_DOWN:
                firstY = curY;
                move = false;
                MainActivity.rect_objectFL_Copy.setY( Vars.posMaxY );
                rectCalcHeight = Vars.posMaxY;
                break;
            case MotionEvent.ACTION_POINTER_DOWN:

                break;
            case MotionEvent.ACTION_POINTER_UP:

                break;
            case MotionEvent.ACTION_MOVE:
                ddd = Float.parseFloat(curY);
                move = true;
                moveY = view.getY() + (Float.parseFloat(curY) - Float.parseFloat(firstY));
                if (move){
                    if (Vars.container_top_margin < moveY) {
                        MainActivity.container.setY( moveY );
                        if ((Vars.heightMax-Vars.heightMin) > moveY){
                            rectCalcHeight = Utils_Calc.ModulateCalc(moveY, Vars.posMaxY, Vars.posMinY_drag, Vars.heightMin, Vars.heightMax);
                        }
                        if ((int) rectCalcHeight > Vars.heightMin && (int) rectCalcHeight < Vars.heightMax){
                            function_rectObjAnim(MainActivity.rect_objectFL_Copy, (int) rectCalcHeight, (int) rectCalcHeight, 0, interpolator_bounce);
                        }
                    }
                }
                break;
            case MotionEvent.ACTION_UP:
                if (move){
                    if (((Vars.heightMax-Vars.heightMin)/2) > moveY){
                        if (MainActivity.rect_objectFL_Copy.getHeight() >= (int) rectCalcHeight){
                            function_containAnim(MainActivity.container, Vars.posMaxY, 400, interpolator_bounce);
                            if (rectCalcHeight >= Vars.posMinY){
                                function_containAnim(MainActivity.rect_objectFL, 0, 400, interpolator_bounce);
                                function_rectObjAnim(MainActivity.rect_objectFL_Copy, (int) rectCalcHeight, Vars.heightMin, 400, interpolator_bounce);
                            }
                            Vars.container_bool = true;
                            MainActivity.container_btn_updown.setRotation(-180);
                        }
                    } else {
                        function_containAnim(MainActivity.container, Vars.posMinY, 400, interpolator_bounce);
                        if (MainActivity.container.getY() <= Vars.posMinY){
                            function_containAnim(MainActivity.rect_objectFL, 0, 400, interpolator_bounce);
                            function_rectObjAnim(MainActivity.rect_objectFL_Copy, (int) rectCalcHeight, Vars.heightMax, 400, interpolator_bounce);
                        }
                            Vars.container_bool = false;
                            MainActivity.container_btn_updown.setRotation(0);
                    }
                }
                move = false;
                break;
        }
        MainActivity.container.invalidate();
        return true;
    }
    public static void function_containAnim(View view, float n, int duration, Interpolator interpolator){
        ObjectAnimator containAnim = ObjectAnimator.ofFloat(view, "translationY", n);
        containAnim.setInterpolator(interpolator);
        containAnim.setDuration(duration);
        containAnim.start();
    }

    public static void function_rectObjAnim(View view, int currentHeight, int newHeight, int duration, Interpolator interpolator) {
        ValueAnimator slideAnimator = ValueAnimator.ofInt(currentHeight, newHeight).setDuration(duration);
        slideAnimator.addUpdateListener(animation1 -> {
            Integer value = (Integer) animation1.getAnimatedValue();
            view.getLayoutParams().height = value.intValue();
            view.requestLayout();
        });
        AnimatorSet animationSet = new AnimatorSet();
        animationSet.setInterpolator(interpolator);
        animationSet.play(slideAnimator);
        animationSet.start();
    }
}





