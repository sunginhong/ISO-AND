package com.example.sideproject_06;

import android.content.Context;
import android.util.Log;
import android.view.View;

public class ClickAdapter_Group2_Li5 implements View.OnClickListener{

    Context mContext;

    public ClickAdapter_Group2_Li5(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.group2_li5_btncase0:
                MainActivity.group2_li5_state = "None";
                MainActivity.group2_li5_btncase0_radio_trans.startTransition(100);
                MainActivity.group2_li5_btncase1_radio_trans.resetTransition();
                MainActivity.group2_li5_btncase2_radio_trans.resetTransition();
                MainActivity.group2_li5_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group2_li5_btncase1:
                MainActivity.group2_li5_state = "Light";
                MainActivity.group2_li5_btncase0_radio_trans.resetTransition();
                MainActivity.group2_li5_btncase1_radio_trans.startTransition(100);
                MainActivity.group2_li5_btncase2_radio_trans.resetTransition();
                MainActivity.group2_li5_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group2_li5_btncase2:
                MainActivity.group2_li5_state = "Normal";
                MainActivity.group2_li5_btncase0_radio_trans.resetTransition();
                MainActivity.group2_li5_btncase1_radio_trans.resetTransition();
                MainActivity.group2_li5_btncase2_radio_trans.startTransition(100);
                MainActivity.group2_li5_btncase3_radio_trans.resetTransition();
                break;

            case R.id.group2_li5_btncase3:
                MainActivity.group2_li5_state = "Strong";
                MainActivity.group2_li5_btncase0_radio_trans.resetTransition();
                MainActivity.group2_li5_btncase1_radio_trans.resetTransition();
                MainActivity.group2_li5_btncase2_radio_trans.resetTransition();
                MainActivity.group2_li5_btncase3_radio_trans.startTransition(100);
                break;
        }
        MainActivity.stateCheck_group2();
        MainActivity.result_out_haptic.setText(MainActivity.group2_li5_state);
    }
}