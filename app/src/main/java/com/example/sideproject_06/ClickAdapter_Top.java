package com.example.sideproject_06;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;

public class ClickAdapter_Top implements View.OnClickListener{

    Context mContext;
    boolean isClick0 = false;
    boolean isClick1 = false;
    boolean isClick2 = false;
    public static boolean isClickPlaymotion = false;
    public static Vibrator vibrator;

    public ClickAdapter_Top(Context context){
        mContext = context;
        isClick0 = true;
        vibrator = (Vibrator) this.mContext.getSystemService(Context.VIBRATOR_SERVICE);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_preset_0:
                if (!isClick0){
                    isClick0 = true;
                    MainActivity.animationType = MainActivity.array_animationType.get(0);
                    ResetState.defCaseState00();
                    buttonani(0);
                }
                break;

            case R.id.button_preset_1:
                if (!isClick1){
                    isClick1 = true;
                    MainActivity.animationType = MainActivity.array_animationType.get(1);
                    ResetState.defCaseState01();
                    AnimRectObject.function_CasePopup_containStateAnim_reset();
                    buttonani(1);
                }
                break;

            case R.id.button_preset_2:
                if (!isClick2){
                    isClick2 = true;
                    MainActivity.animationType = MainActivity.array_animationType.get(2);
                    ResetState.defCaseState02();
                    AnimRectObject.function_CasePopup_containStateAnim_reset();
                    buttonani(2);
                }
                break;
            case R.id.button_playmotion:
                this.button_function_playmotion();
                break;
        }
    }

    private void button_function_playmotion() {
        if (!isClickPlaymotion) {
            isClickPlaymotion = true;
            MainActivity.playMotionState = "Out";
            MainActivity.button_playmotion.setText(MainActivity.array_string_btnTitle.get(1));
            MainActivity.button_playmotion_trans.startTransition(100);
            MainActivity.button_playmotion.setTextColor(mContext.getResources().getColorStateList(R.color.white));
        } else {
            isClickPlaymotion = false;
            MainActivity.playMotionState = "In";
            MainActivity.button_playmotion.setText(MainActivity.array_string_btnTitle.get(0));
            MainActivity.button_playmotion_trans.reverseTransition(100);
            MainActivity.button_playmotion.setTextColor(mContext.getResources().getColorStateList(R.color.white));
        }

        if (MainActivity.animationType == MainActivity.array_animationType.get(0)) {
            if (!isClickPlaymotion) {
                if (MainActivity.animationType == MainActivity.array_animationType.get(0)){
                    AnimRectObject.function_CasePopup_containStateAnim();
                }
            } else {
                if (MainActivity.animationType == MainActivity.array_animationType.get(0)){
                    AnimRectObject.function_CasePopup_containStateAnim();
                }
            }
        }

        if (MainActivity.animationType == MainActivity.array_animationType.get(1)) {
            if (!isClickPlaymotion) {

            } else {

            }
        }

        if (MainActivity.animationType == MainActivity.array_animationType.get(2)) {
            if (!isClickPlaymotion) {

            } else {


            }
        }
    }

    void buttonani(int id){
        switch (id){
            case 0:
                isClick0 = true;
                isClick1 = false;
                isClick2 = false;

                MainActivity.button_preset_trans_0.startTransition(100);
                MainActivity.button_preset_0.setTextColor(mContext.getResources().getColorStateList(R.color.white));
                MainActivity.button_preset_trans_1.resetTransition();
                MainActivity.button_preset_1.setTextColor(mContext.getResources().getColorStateList(R.color.black));
                MainActivity.button_preset_trans_2.resetTransition();
                MainActivity.button_preset_2.setTextColor(mContext.getResources().getColorStateList(R.color.black));
                break;
            case 1:
                isClick0 = false;
                isClick1 = true;
                isClick2 = false;

                MainActivity.button_preset_trans_0.resetTransition();
                MainActivity.button_preset_0.setTextColor(mContext.getResources().getColorStateList(R.color.black));
                MainActivity.button_preset_trans_1.startTransition(100);
                MainActivity.button_preset_1.setTextColor(mContext.getResources().getColorStateList(R.color.white));
                MainActivity.button_preset_trans_2.resetTransition();
                MainActivity.button_preset_2.setTextColor(mContext.getResources().getColorStateList(R.color.black));
                break;
            case 2:
                isClick0 = false;
                isClick1 = false;
                isClick2 = true;

                MainActivity.button_preset_trans_0.resetTransition();
                MainActivity.button_preset_0.setTextColor(mContext.getResources().getColorStateList(R.color.black));
                MainActivity.button_preset_trans_1.resetTransition();
                MainActivity.button_preset_1.setTextColor(mContext.getResources().getColorStateList(R.color.black));
                MainActivity.button_preset_trans_2.startTransition(100);
                MainActivity.button_preset_2.setTextColor(mContext.getResources().getColorStateList(R.color.white));
                break;
        }
    }
}
