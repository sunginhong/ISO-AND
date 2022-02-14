package com.example.sideproject_06;

import android.content.Context;
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
                if (!MainActivity.group1_li1_state){
                    MainActivity.group1_li1_state = true;
                    MainActivity.group1_li1_btncase0_radio_trans.startTransition(100);
                }
                break;
        }
        MainActivity.stateCheck_group1();
    }
}