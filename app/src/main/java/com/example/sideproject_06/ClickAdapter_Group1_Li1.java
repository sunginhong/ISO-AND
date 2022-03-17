package com.example.sideproject_06;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class ClickAdapter_Group1_Li1 implements View.OnClickListener{

    Context mContext;

    public ClickAdapter_Group1_Li1(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.group1_li1_btncase0:
                Vars.group1_li1_state = 0;
                MainActivity.group1_li1_btncase0_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li1_btncase1_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li1_btncase0_radio_trans.startTransition(100);
                MainActivity.group1_li1_btncase1_radio_trans.resetTransition();
//                if (!MainActivity.group1_li1_state){
//
//                }
                break;

            case R.id.group1_li1_btncase1:
                Vars.group1_li1_state = Utils_Calc.dpToPx(Vars.bottomPosY);
                MainActivity.group1_li1_btncase0_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group1_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group1_li1_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li1_btncase1_radio_trans.startTransition(100);
//                if (!MainActivity.group1_li1_state){
//                    MainActivity.group1_li1_state = true;
//                }
                break;
        }
        MainActivity.stateCheck_group1();
    }
}