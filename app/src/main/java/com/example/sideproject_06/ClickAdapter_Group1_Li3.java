package com.example.sideproject_06;

import android.content.Context;
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
                MainActivity.group1_li3_state = 0;
                MainActivity.group1_li3_btncase0_radio_trans.startTransition(100);
                MainActivity.group1_li3_btncase1_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase2_radio_trans.resetTransition();
                break;

            case R.id.group1_li3_btncase1:
                MainActivity.group1_li3_state = 0.5;
                MainActivity.group1_li3_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase1_radio_trans.startTransition(100);
                MainActivity.group1_li3_btncase2_radio_trans.resetTransition();
                break;

            case R.id.group1_li3_btncase2:
                MainActivity.group1_li3_state = 1.0;
                MainActivity.group1_li3_btncase0_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase1_radio_trans.resetTransition();
                MainActivity.group1_li3_btncase2_radio_trans.startTransition(100);
                break;
        }
        MainActivity.stateCheck_group1();
        MainActivity.result_in_opacity.setText(String.valueOf(MainActivity.group1_li3_state));
    }
}