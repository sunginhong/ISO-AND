package com.example.sideproject_06;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

import androidx.core.view.animation.PathInterpolatorCompat;

public class ClickAdapter_Group1_Li4 implements View.OnClickListener{

    Context mContext;
    private int idx = 1;

    public ClickAdapter_Group1_Li4(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.group1_li4_btncase0:
                idx = 0;
                Vars.group1_li4_state = Vars.array_string_easeType[idx];
                MainActivity.result_in_ease.setText("cubic-bezier(0.32, 0, 0.67, 0)");
                MainActivity.group1_li4_btncase0_textView.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li4_btncase1_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase2_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase3_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase0_radio_trans.startTransition(100);
                MainActivity.group1_li4_btncase1_radio_trans.resetTransition();
                MainActivity.group1_li4_btncase2_radio_trans.resetTransition();
                MainActivity.group1_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group1_li4_btncase1:
                idx = 1;
                Vars.group1_li4_state = Vars.array_string_easeType[idx];
                MainActivity.result_in_ease.setText("cubic-bezier(0.65, 0, 0.35, 1)");
                MainActivity.group1_li4_btncase0_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase1_textView.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li4_btncase2_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase3_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li4_btncase1_radio_trans.startTransition(100);
                MainActivity.group1_li4_btncase2_radio_trans.resetTransition();
                MainActivity.group1_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group1_li4_btncase2:
                idx = 2;
                Vars.group1_li4_state = Vars.array_string_easeType[idx];
                MainActivity.result_in_ease.setText("cubic-bezier(0.33, 1, 0.68, 1)");
                MainActivity.group1_li4_btncase0_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase1_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase2_textView.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li4_btncase3_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li4_btncase1_radio_trans.resetTransition();
                MainActivity.group1_li4_btncase2_radio_trans.startTransition(100);
                MainActivity.group1_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group1_li4_btncase3:
                idx = 3;
                Vars.group1_li4_state = Vars.array_string_easeType[idx];
                MainActivity.result_in_ease.setText("cubic-bezier(0.34, 1.56, 0.64, 1)");
                MainActivity.group1_li4_btncase0_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase1_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase2_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li4_btncase3_textView.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li4_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li4_btncase1_radio_trans.resetTransition();
                MainActivity.group1_li4_btncase2_radio_trans.resetTransition();
                MainActivity.group1_li4_btncase3_radio_trans.startTransition(100);
                break;
        }
        AnimRectObject.function_group1_selEase(Vars.group1_li4_state);
        MainActivity.group1_result_5.setText("ease" + Vars.array_string_easeType[idx] + " - " + MainActivity.result_in_ease.getText());
    }
}