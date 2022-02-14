package com.example.sideproject_06;

import android.content.Context;
import android.util.Log;
import android.view.View;

public class ClickAdapter_Group2_Li3 implements View.OnClickListener{

    Context mContext;

    public ClickAdapter_Group2_Li3(Context context){
        mContext = context;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.group2_li3_btncase0:
                MainActivity.group2_li3_state = 0;
                MainActivity.group2_li3_btncase0_radio_trans.startTransition(100);
                MainActivity.group2_li3_btncase1_radio_trans.resetTransition();
                MainActivity.group2_li3_btncase2_radio_trans.resetTransition();
                break;

            case R.id.group2_li3_btncase1:
                Log.d("sss", "111");
                MainActivity.group2_li3_state = 0.5;
                MainActivity.group2_li3_btncase0_radio_trans.resetTransition();
                MainActivity.group2_li3_btncase1_radio_trans.startTransition(100);
                MainActivity.group2_li3_btncase2_radio_trans.resetTransition();
                break;
            case R.id.group2_li3_btncase2:
                Log.d("sss", "2222");
                MainActivity.group2_li3_state = 1.0;
                MainActivity.group2_li3_btncase0_radio_trans.resetTransition();
                MainActivity.group2_li3_btncase1_radio_trans.resetTransition();
                MainActivity.group2_li3_btncase2_radio_trans.startTransition(100);
                break;
        }
        MainActivity.stateCheck_group2();
        MainActivity.result_out_opacity.setText(String.valueOf(MainActivity.group2_li3_state));
    }
}