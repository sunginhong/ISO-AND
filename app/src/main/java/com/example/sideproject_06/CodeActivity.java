package com.example.sideproject_06;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CodeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(CodeActivity.this, MainActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in_left, R.anim.anim_out_right);
    }
}