package com.example.sideproject_06;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Interpolator;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;

public class ClickAdapter_Top implements View.OnClickListener{

    Context mContext;
    public static boolean isClick0 = false;
    public static boolean isClick1 = false;
    public static boolean isClick2 = false;
    public static boolean isClickPlaymotion = false;
    public static Vibrator vibrator;

    public ClickAdapter_Top(Context context){
        mContext = context;
        if (!Vars.appStart){
            isClick0 = true;
        }
        vibrator = (Vibrator) this.mContext.getSystemService(Context.VIBRATOR_SERVICE);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_preset_0:
                if (!isClick0){
                    isClick0 = true;
                    isClick1 = false;
                    isClick2 = false;
                    MainActivity.animationType = MainActivity.array_animationType.get(0);
                    ResetState.defCaseState00();
                    AnimRectObject.function_CaseNudge_containStateAnim_reset();
                    AnimRectObject.function_CaseAlarm_containStateAnim_reset();
                    buttonani(0);
                }
                break;

            case R.id.button_preset_1:
                if (!isClick1){
                    isClick0 = false;
                    isClick1 = true;
                    isClick2 = false;
                    MainActivity.animationType = MainActivity.array_animationType.get(1);
                    AnimRectObject.function_CasePopup_containStateAnim_reset();
                    ResetState.defCaseState01();
                    AnimRectObject.function_CaseAlarm_containStateAnim_reset();
                    buttonani(1);
                }
                break;

            case R.id.button_preset_2:
                if (!isClick2){
                    isClick0 = false;
                    isClick1 = false;
                    isClick2 = true;
                    MainActivity.animationType = MainActivity.array_animationType.get(2);
                    AnimRectObject.function_CasePopup_containStateAnim_reset();
                    AnimRectObject.function_CaseAlarm_containStateAnim_reset();
                    ResetState.defCaseState02();
                    buttonani(2);
                }
                break;
            case R.id.button_playmotion:
                this.button_function_playmotion();
                break;
        }
    }

    public static void button_function_stateSel(int index, Context ctx) {
        if (index == 0){
            isClick0 = true;
            isClick1 = false;
            isClick2 = false;

            if (Vars.playMotionState == "In"){
//                AnimRectObject.view_item0.
            }
            if (Vars.playMotionState == "Out"){

            }
            MainActivity.anim_title.setText("Popup Animation");
            AnimRectObject.function_CaseNudge_containStateAnim_reset();
            AnimRectObject.function_CaseAlarm_containStateAnim_reset();

            MainActivity.button_preset_trans_0.startTransition(0);
            MainActivity.button_preset_0.setTextColor(ctx.getResources().getColorStateList(R.color.white));
            MainActivity.button_preset_trans_1.resetTransition();
            MainActivity.button_preset_1.setTextColor(ctx.getResources().getColorStateList(R.color.black));
            MainActivity.button_preset_trans_2.resetTransition();
            MainActivity.button_preset_2.setTextColor(ctx.getResources().getColorStateList(R.color.black));
        }
        if (index == 1){
            isClick0 = false;
            isClick1 = true;
            isClick2 = false;

            MainActivity.anim_title.setText("Nudge Animation");
            AnimRectObject.function_CasePopup_containStateAnim_reset();
            AnimRectObject.function_CaseAlarm_containStateAnim_reset();

            MainActivity.button_preset_trans_0.resetTransition();
            MainActivity.button_preset_0.setTextColor(ctx.getResources().getColorStateList(R.color.black));
            MainActivity.button_preset_trans_1.startTransition(0);
            MainActivity.button_preset_1.setTextColor(ctx.getResources().getColorStateList(R.color.white));
            MainActivity.button_preset_trans_2.resetTransition();
            MainActivity.button_preset_2.setTextColor(ctx.getResources().getColorStateList(R.color.black));
        }
        if (index == 2){
            isClick0 = false;
            isClick1 = false;
            isClick2 = true;

            MainActivity.anim_title.setText("Alarm Animation");
            AnimRectObject.function_CasePopup_containStateAnim_reset();
            AnimRectObject.function_CaseNudge_containStateAnim_reset();

            MainActivity.button_preset_trans_0.resetTransition();
            MainActivity.button_preset_0.setTextColor(ctx.getResources().getColorStateList(R.color.black));
            MainActivity.button_preset_trans_1.resetTransition();
            MainActivity.button_preset_1.setTextColor(ctx.getResources().getColorStateList(R.color.black));
            MainActivity.button_preset_trans_2.startTransition(0);
            MainActivity.button_preset_2.setTextColor(ctx.getResources().getColorStateList(R.color.white));
        }
        MainActivity.animationType = MainActivity.array_animationType.get(index);
    }

    private void button_function_playmotion() {
        if (!isClickPlaymotion) {
            isClickPlaymotion = true;
            Vars.playMotionState = "Out";
            MainActivity.button_playmotion.setText(MainActivity.array_string_btnTitle.get(1));
            MainActivity.button_playmotion_trans.startTransition(100);
            MainActivity.button_playmotion.setTextColor(mContext.getResources().getColorStateList(R.color.white));
        } else {
            isClickPlaymotion = false;
            Vars.playMotionState = "In";
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
                if (MainActivity.animationType == MainActivity.array_animationType.get(1)){
                    AnimRectObject.function_CaseNudge_containStateAnim();
                }
            } else {
                if (MainActivity.animationType == MainActivity.array_animationType.get(1)){
                    AnimRectObject.function_CaseNudge_containStateAnim();
                }
            }
        }

        if (MainActivity.animationType == MainActivity.array_animationType.get(2)) {
            if (!isClickPlaymotion) {
                if (MainActivity.animationType == MainActivity.array_animationType.get(2)){
                    AnimRectObject.function_CaseAlarm_containStateAnim();
                }
            } else {
                if (MainActivity.animationType == MainActivity.array_animationType.get(2)){
                    AnimRectObject.function_CaseAlarm_containStateAnim();
                }
            }
        }
    }

    void buttonani(int id){
        AnimRectObject.function_CasePopup_containStateAnim_reset();
        AnimRectObject.function_CaseNudge_containStateAnim_reset();
        AnimRectObject.function_CaseAlarm_containStateAnim_reset();
        switch (id){
            case 0:
                isClick0 = true;
                isClick1 = false;
                isClick2 = false;

                Vars.group1_li0_state = Vars.defCaseState00_group1_li0_state_def;
                Vars.group1_li1_state = Vars.defCaseState00_group1_li1_state_def;
                Vars.group1_li2_state = Vars.defCaseState00_group1_li2_state_def;
                Vars.group1_li3_state = Vars.defCaseState00_group1_li3_state_def;
                Vars.group1_li4_state = Vars.defCaseState00_group1_li4_state_def;
                Vars.group1_li5_state = Vars.defCaseState00_group1_li5_state_def;
                Vars.group2_li0_state = Vars.defCaseState00_group2_li0_state_def;
                Vars.group2_li1_state = Vars.defCaseState00_group2_li1_state_def;
                Vars.group2_li2_state = Vars.defCaseState00_group2_li2_state_def;
                Vars.group2_li3_state = Vars.defCaseState00_group2_li3_state_def;
                Vars.group2_li4_state = Vars.defCaseState00_group2_li4_state_def;
                Vars.group2_li5_state = Vars.defCaseState00_group2_li5_state_def;

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

                Vars.group1_li0_state = Vars.defCaseState01_group1_li0_state_def;
                Vars.group1_li1_state = Vars.defCaseState01_group1_li1_state_def;
                Vars.group1_li2_state = Vars.defCaseState01_group1_li2_state_def;
                Vars.group1_li3_state = Vars.defCaseState01_group1_li3_state_def;
                Vars.group1_li4_state = Vars.defCaseState01_group1_li4_state_def;
                Vars.group1_li5_state = Vars.defCaseState01_group1_li5_state_def;
                Vars.group2_li0_state = Vars.defCaseState01_group2_li0_state_def;
                Vars.group2_li1_state = Vars.defCaseState01_group2_li1_state_def;
                Vars.group2_li2_state = Vars.defCaseState01_group2_li2_state_def;
                Vars.group2_li3_state = Vars.defCaseState01_group2_li3_state_def;
                Vars.group2_li4_state = Vars.defCaseState01_group2_li4_state_def;
                Vars.group2_li5_state = Vars.defCaseState01_group2_li5_state_def;

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

                Vars.group1_li0_state = Vars.defCaseState02_group1_li0_state_def;
                Vars.group1_li1_state = Vars.defCaseState02_group1_li1_state_def;
                Vars.group1_li2_state = Vars.defCaseState02_group1_li2_state_def;
                Vars.group1_li3_state = Vars.defCaseState02_group1_li3_state_def;
                Vars.group1_li4_state = Vars.defCaseState02_group1_li4_state_def;
                Vars.group1_li5_state = Vars.defCaseState02_group1_li5_state_def;
                Vars.group2_li0_state = Vars.defCaseState02_group2_li0_state_def;
                Vars.group2_li1_state = Vars.defCaseState02_group2_li1_state_def;
                Vars.group2_li2_state = Vars.defCaseState02_group2_li2_state_def;
                Vars.group2_li3_state = Vars.defCaseState02_group2_li3_state_def;
                Vars.group2_li4_state = Vars.defCaseState02_group2_li4_state_def;
                Vars.group2_li5_state = Vars.defCaseState02_group2_li5_state_def;

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
