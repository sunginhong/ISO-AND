package com.example.sideproject_06;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;

public class ClickAdapter_Group1_Li0 implements View.OnClickListener{

    Context mContext;

    public ClickAdapter_Group1_Li0(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.group1_li0_btncase0:
                Vars.group1_li0_state = 200;
                MainActivity.result_in_duration.setText("0.2s");
                MainActivity.group1_li0_btncase0_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li0_btncase1_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li0_btncase2_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li0_btncase0_radio_trans.startTransition(100);
                MainActivity.group1_li0_btncase1_radio_trans.resetTransition();
                MainActivity.group1_li0_btncase2_radio_trans.resetTransition();
                break;

            case R.id.group1_li0_btncase1:
                Vars.group1_li0_state = 300;
                MainActivity.result_in_duration.setText("0.3s");
                MainActivity.group1_li0_btncase0_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li0_btncase1_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li0_btncase2_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li0_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li0_btncase1_radio_trans.startTransition(100);
                MainActivity.group1_li0_btncase2_radio_trans.resetTransition();
                break;

            case R.id.group1_li0_btncase2:
                Vars.group1_li0_state = 400;
                MainActivity.result_in_duration.setText("0.4s");
                MainActivity.group1_li0_btncase0_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li0_btncase1_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li0_btncase2_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li0_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li0_btncase1_radio_trans.resetTransition();
                MainActivity.group1_li0_btncase2_radio_trans.startTransition(100);
                break;
        }
        MainActivity.stateCheck_group1();
    }
}