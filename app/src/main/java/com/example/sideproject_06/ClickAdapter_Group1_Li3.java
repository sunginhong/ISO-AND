package com.example.sideproject_06;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class ClickAdapter_Group1_Li3 implements View.OnClickListener{

    Context mContext;

    public ClickAdapter_Group1_Li3(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.group1_li3_btncase0:
                Vars.group1_li3_state = 0;
                MainActivity.group1_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li3_btncase1_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase2_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase3_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase0_radio_trans.startTransition(100);
                MainActivity.group1_li3_btncase1_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase2_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group1_li3_btncase1:
                Vars.group1_li3_state = 0.5;
                MainActivity.group1_li3_btncase0_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase1_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li3_btncase2_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase3_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase1_radio_trans.startTransition(100);
                MainActivity.group1_li3_btncase2_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group1_li3_btncase2:
                Vars.group1_li3_state = 0.7;
                MainActivity.group1_li3_btncase0_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase1_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase2_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li3_btncase3_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase1_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase2_radio_trans.startTransition(100);
                MainActivity.group1_li3_btncase3_radio_trans.resetTransition();
                break;
            case R.id.group1_li3_btncase3:
                Vars.group1_li3_state = 1;
                MainActivity.group1_li3_btncase0_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase1_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase2_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li3_btncase3_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li3_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase1_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase2_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase3_radio_trans.startTransition(100);
                break;
        }
        MainActivity.group1_result_4.setText(String.valueOf(Vars.group1_li3_state));
        if (Vars.group1_li3_state == 1){
            MainActivity.group1_result_4.setText("1");
        }
    }
}