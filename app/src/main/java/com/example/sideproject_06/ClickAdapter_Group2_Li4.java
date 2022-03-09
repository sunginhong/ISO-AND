package com.example.sideproject_06;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class ClickAdapter_Group2_Li4 implements View.OnClickListener{

    Context mContext;

    public ClickAdapter_Group2_Li4(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.group2_li4_btncase0:
                MainActivity.group2_li4_state = MainActivity.array_string_easeType[0];
                MainActivity.result_out_ease.setText("cubic-bezier(0.32, 0, 0.67, 0)");
                MainActivity.group2_li4_btncase0_textView.setTextColor(Color.parseColor("#000000"));
                MainActivity.group2_li4_btncase1_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase2_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase3_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase0_radio_trans.startTransition(100);
                MainActivity.group2_li4_btncase1_radio_trans.resetTransition();
                MainActivity.group2_li4_btncase2_radio_trans.resetTransition();
                MainActivity.group2_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group2_li4_btncase1:
                MainActivity.group2_li4_state = MainActivity.array_string_easeType[1];
                MainActivity.result_out_ease.setText("cubic-bezier(0.65, 0, 0.35, 1)");
                MainActivity.group2_li4_btncase0_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase1_textView.setTextColor(Color.parseColor("#000000"));
                MainActivity.group2_li4_btncase2_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase3_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase0_radio_trans.resetTransition();
                MainActivity.group2_li4_btncase1_radio_trans.startTransition(100);
                MainActivity.group2_li4_btncase2_radio_trans.resetTransition();
                MainActivity.group2_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group2_li4_btncase2:
                MainActivity.group2_li4_state = MainActivity.array_string_easeType[2];
                MainActivity.result_out_ease.setText("cubic-bezier(0.33, 1, 0.68, 1)");
                MainActivity.group2_li4_btncase0_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase1_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase2_textView.setTextColor(Color.parseColor("#000000"));
                MainActivity.group2_li4_btncase3_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase0_radio_trans.resetTransition();
                MainActivity.group2_li4_btncase1_radio_trans.resetTransition();
                MainActivity.group2_li4_btncase2_radio_trans.startTransition(100);
                MainActivity.group2_li4_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group2_li4_btncase3:
                MainActivity.group2_li4_state = MainActivity.array_string_easeType[3];
                MainActivity.result_out_ease.setText("cubic-bezier(0.34, 1.56, 0.64, 1)");
                MainActivity.group2_li4_btncase0_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase1_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase2_textView.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li4_btncase3_textView.setTextColor(Color.parseColor("#000000"));
                MainActivity.group2_li4_btncase0_radio_trans.resetTransition();
                MainActivity.group2_li4_btncase1_radio_trans.resetTransition();
                MainActivity.group2_li4_btncase2_radio_trans.resetTransition();
                MainActivity.group2_li4_btncase3_radio_trans.startTransition(100);
                break;
        }
        MainActivity.stateCheck_group2();
        AnimRectObject.function_group2_selEase(MainActivity.group2_li4_state);
    }
}