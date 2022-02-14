package com.example.sideproject_06;

import android.content.Context;
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
                if (!MainActivity.group2_li1_state){
                    MainActivity.group2_li1_state = true;
                } 
                break;
        }
        MainActivity.stateCheck_group2();
    }
}