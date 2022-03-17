package com.example.sideproject_06;

import android.content.Context;
import android.graphics.Color;
import android.view.View;

public class ClickAdapter_Group2_Li1 implements View.OnClickListener{

    Context mContext;

    public ClickAdapter_Group2_Li1(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.group2_li1_btncase0:
                Vars.group2_li1_state = 0;
                MainActivity.group2_li1_btncase0_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group2_li1_btncase1_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li1_btncase0_radio_trans.startTransition(100);
                MainActivity.group2_li1_btncase1_radio_trans.resetTransition();
                break;

            case R.id.group2_li1_btncase1:
                Vars.group2_li1_state = Utils_Calc.dpToPx(Vars.bottomPosY);
                MainActivity.group2_li1_btncase0_text.setTextColor(mContext.getResources().getColor(R.color.textColor_nor));
                MainActivity.group2_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
                MainActivity.group2_li1_btncase0_radio_trans.resetTransition();
                MainActivity.group2_li1_btncase1_radio_trans.startTransition(100);
                break;
        }
//        switch(v.getId()){
//            case R.id.group2_li1_btncase0:
//                if (!MainActivity.group2_li1_state){
//                    MainActivity.group2_li1_state = true;
//                    MainActivity.group2_li1_btncase0_radio_trans.startTransition(100);
//                    MainActivity.group2_li1_btncase0_text.setTextColor(Color.parseColor("#000000"));
//                }
//                break;
//        }
        MainActivity.stateCheck_group2();
    }
}