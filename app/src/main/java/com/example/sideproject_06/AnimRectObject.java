package com.example.sideproject_06;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

import androidx.core.view.animation.PathInterpolatorCompat;

public class AnimRectObject {
    Context mContext;
    public static View view_item0;
    public static Interpolator interpolator_easeInOut = PathInterpolatorCompat.create(0.65f, 0f, 0.35f, 1f);
    public static Interpolator interpolator_easeOut = PathInterpolatorCompat.create(0.33f, 1f, 0.68f, 1f);
    public static Interpolator interpolator_easeIn = PathInterpolatorCompat.create(0.32f, 0f, 0.67f, 0f);
    public static Interpolator interpolator_bounce = PathInterpolatorCompat.create(0.34f, 1.56f, 0.64f, 1f);
    public static Interpolator selEase_group1;
    public static Interpolator selEase_group2;

    public AnimRectObject(View view0, View view1, View view2){
        view_item0 = view0;
        selEase_group1 = interpolator_easeIn;
        selEase_group2 = interpolator_easeIn;
        function_containAnim(view_item0, Float.parseFloat(0+"f"), Float.parseFloat(MainActivity.group1_li2_state+"f"), Float.parseFloat(MainActivity.group1_li3_state+"f"), 0, selEase_group1);
    }

    public static void function_CasePopup_containStateAnim(){
        if (MainActivity.playMotionState == "Out"){
            function_group1_vibrate();
            function_containAnim(view_item0, Float.parseFloat(MainActivity.group1_li1_state+"f"), Float.parseFloat(MainActivity.group1_li2_state+"f"), Float.parseFloat(MainActivity.group1_li3_state+"f"), 0, selEase_group1);
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    function_containAnim(view_item0, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(1+"f"), MainActivity.group1_li0_state, selEase_group1);
                }
            }, 1);
        }
        if (MainActivity.playMotionState == "In"){
            function_group2_vibrate();
            function_containAnim(view_item0, Float.parseFloat(MainActivity.group2_li1_state+"f"), Float.parseFloat(MainActivity.group2_li2_state+"f"), Float.parseFloat(MainActivity.group2_li3_state+"f"), MainActivity.group2_li0_state, selEase_group2);
        }
    }

    public static void function_CasePopup_containStateAnim_reset(){
        function_containAnim(view_item0, Float.parseFloat(0+"f"), Float.parseFloat(1+"f"), Float.parseFloat(0+"f"), 0, selEase_group2);
    }

    public static void function_containAnim(View view, float posN, float scaleN, float alphaN, int duration, Interpolator interpolator){
        AnimatorSet containAnim = new AnimatorSet();
        containAnim.playTogether(
                ObjectAnimator.ofFloat(view,"translationY",posN),
                ObjectAnimator.ofFloat(view,"scaleX",scaleN),
                ObjectAnimator.ofFloat(view,"scaleY",scaleN),
                ObjectAnimator.ofFloat(view,"alpha",alphaN)
        );

        containAnim.setInterpolator(interpolator);
        containAnim.setDuration(duration);
        containAnim.start();
    }

    public static void function_group1_selEase(String string){
        if (string == MainActivity.array_string_easeType[0]){
            selEase_group1 = interpolator_easeInOut;
        }
        if (string == MainActivity.array_string_easeType[1]){
            selEase_group1 = interpolator_easeOut;
        }
        if (string == MainActivity.array_string_easeType[2]){
            selEase_group1 = interpolator_easeIn;
        }
        if (string == MainActivity.array_string_easeType[3]){
            selEase_group1 = interpolator_bounce;
        }
    }
    public static void function_group2_selEase(String string){
        if (string == MainActivity.array_string_easeType[0]){
            selEase_group2 = interpolator_easeInOut;
        }
        if (string == MainActivity.array_string_easeType[1]){
            selEase_group2 = interpolator_easeOut;
        }
        if (string == MainActivity.array_string_easeType[2]){
            selEase_group2 = interpolator_easeIn;
        }
        if (string == MainActivity.array_string_easeType[3]){
            selEase_group2 = interpolator_bounce;
        }
    }
    public static void function_group1_vibrate(){
        ClickAdapter_Top.vibrator.cancel();
        if (MainActivity.group1_li5_state  == "None"){
            ClickAdapter_Top.vibrator.vibrate(0);
            ClickAdapter_Top.vibrator.cancel();
        }
        if (MainActivity.group1_li5_state  == "Light"){
            ClickAdapter_Top.vibrator.vibrate(500);
        }
        if (MainActivity.group1_li5_state  == "Normal"){
            ClickAdapter_Top.vibrator.vibrate(300);
        }
        if (MainActivity.group1_li5_state  == "Strong"){
            ClickAdapter_Top.vibrator.vibrate(100);
        }
    }

    public static void function_group2_vibrate(){
        ClickAdapter_Top.vibrator.cancel();
        if (MainActivity.group2_li5_state  == "None"){
            ClickAdapter_Top.vibrator.vibrate(0);
            ClickAdapter_Top.vibrator.cancel();
        }
        if (MainActivity.group2_li5_state  == "Light"){
            ClickAdapter_Top.vibrator.vibrate(500);
        }
        if (MainActivity.group2_li5_state  == "Normal"){
            ClickAdapter_Top.vibrator.vibrate(300);
        }
        if (MainActivity.group2_li5_state  == "Strong"){
            ClickAdapter_Top.vibrator.vibrate(100);
        }
    }
}