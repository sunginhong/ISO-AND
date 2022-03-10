package com.example.sideproject_06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static int screenHeight;
    public static RelativeLayout container;
    public static int navigationBarHeight = 0;
    public static int posMinY = 0;
    public static int posMinY_drag = 0;
    public static int posMaxY = 0;
    public static int heightMin = 0;
    public static int heightMax = 0;

    public static LinearLayout container_top;
    public static int container_top_margin = 0;
    public static int container_top_marginTop = 0;
    public static int container_top_group_height = 0;
    public static int container_first_group_height = 0;
    public static int transgroup_first_title_realSize_height = 0;
    public static boolean container_bool = false;
    public static String animationType = "";
    public static List<String> array_animationType = new ArrayList<String>();

    public static Context ctx;
    public static RelativeLayout root;
    public static int rootHeight = 0;
    public static int shadowHeight = 0;
    public static ViewGroup.LayoutParams params_copy;

    public static List<String> array_string_btnTitle = new ArrayList<String>();
    public static String playMotionState = "";
    public static String[] array_string_easeType;
    public static Button button_preset_0;
    public static Button button_preset_1;
    public static Button button_preset_2;
    public static Button button_playmotion;
    public static TransitionDrawable button_preset_trans_0;
    public static TransitionDrawable button_preset_trans_1;
    public static TransitionDrawable button_preset_trans_2;
    public static TransitionDrawable button_playmotion_trans;

    public static RelativeLayout bottom_rect;
    public static int bottom_rectHeight = 0;
    public static int bottom_top_margin;

    public static FrameLayout rect_objectFL;
    public static FrameLayout rect_objectFL_Copy;
    public static RelativeLayout rect_objectRL;
    public static SquareView anim_object_case0;
    public static View anim_object_case1;
    public static View anim_object_case2;

    public static TextView anim_title;

    public static int bottomPosY = 30;

    public static int defCaseState00_group1_li0_state_def = 300;
    public static int defCaseState00_group1_li1_state_def = 0;
    public static double defCaseState00_group1_li2_state_def = 0.0;
    public static double defCaseState00_group1_li3_state_def = 0.0;
    public static String defCaseState00_group1_li4_state_def = "";
    public static String defCaseState00_group1_li5_state_def = "None";

    public static int defCaseState01_group1_li0_state_def = 300;
    public static int defCaseState01_group1_li1_state_def = Utils_Calc.dpToPx(MainActivity.bottomPosY);
    public static double defCaseState01_group1_li2_state_def = 1;
    public static double defCaseState01_group1_li3_state_def = 0.0;
    public static String defCaseState01_group1_li4_state_def = "";
    public static String defCaseState01_group1_li5_state_def = "None";

    public static int defCaseState02_group1_li0_state_def = 300;
    public static int defCaseState02_group1_li1_state_def = Utils_Calc.dpToPx(MainActivity.bottomPosY);
    public static double defCaseState02_group1_li2_state_def = 1;
    public static double defCaseState02_group1_li3_state_def = 0.0;
    public static String defCaseState02_group1_li4_state_def = "";
    public static String defCaseState02_group1_li5_state_def = "None";

    public static int group1_li0_state = defCaseState00_group1_li0_state_def;
    public static int group1_li1_state = defCaseState00_group1_li1_state_def;
    public static double group1_li2_state = defCaseState00_group1_li2_state_def;
    public static double group1_li3_state = defCaseState00_group1_li3_state_def;
    public static String group1_li4_state = defCaseState00_group1_li4_state_def;
    public static String group1_li5_state = defCaseState00_group1_li5_state_def;

    public static int defCaseState00_group2_li0_state_def = 300;
    public static int defCaseState00_group2_li1_state_def = 0;
    public static double defCaseState00_group2_li2_state_def = 0.0;
    public static double defCaseState00_group2_li3_state_def = 0.0;
    public static String defCaseState00_group2_li4_state_def = "";
    public static String defCaseState00_group2_li5_state_def = "None";

    public static int defCaseState01_group2_li0_state_def = 300;
    public static int defCaseState01_group2_li1_state_def = Utils_Calc.dpToPx(MainActivity.bottomPosY);
    public static double defCaseState01_group2_li2_state_def = 1;
    public static double defCaseState01_group2_li3_state_def = 0.0;
    public static String defCaseState01_group2_li4_state_def = "";
    public static String defCaseState01_group2_li5_state_def = "None";

    public static int defCaseState02_group2_li0_state_def = 300;
    public static int defCaseState02_group2_li1_state_def = Utils_Calc.dpToPx(MainActivity.bottomPosY);
    public static double defCaseState02_group2_li2_state_def = 1;
    public static double defCaseState02_group2_li3_state_def = 0.0;
    public static String defCaseState02_group2_li4_state_def = "";
    public static String defCaseState02_group2_li5_state_def = "None";

    public static int group2_li0_state = defCaseState00_group2_li0_state_def;
    public static int group2_li1_state = defCaseState00_group2_li1_state_def;
    public static double group2_li2_state = defCaseState00_group2_li2_state_def;
    public static double group2_li3_state = defCaseState00_group2_li3_state_def;
    public static String group2_li4_state = defCaseState00_group2_li4_state_def;
    public static String group2_li5_state = defCaseState00_group2_li5_state_def;

    public static LinearLayout group1_li0_btncase0;
    public static LinearLayout group1_li0_btncase1;
    public static LinearLayout group1_li0_btncase2;
    public static LinearLayout group1_li1_btncase0;
    public static LinearLayout group1_li1_btncase1;
    public static LinearLayout group1_li2_btncase0;
    public static LinearLayout group1_li2_btncase1;
    public static LinearLayout group1_li2_btncase2;
    public static LinearLayout group1_li2_btncase3;
    public static LinearLayout group1_li3_btncase0;
    public static LinearLayout group1_li3_btncase1;
    public static LinearLayout group1_li3_btncase2;
    public static LinearLayout group1_li3_btncase3;
    public static LinearLayout group1_li4_btncase0;
    public static LinearLayout group1_li4_btncase1;
    public static LinearLayout group1_li4_btncase2;
    public static LinearLayout group1_li4_btncase3;
    public static LinearLayout group1_li5_btncase0;
    public static LinearLayout group1_li5_btncase1;
    public static LinearLayout group1_li5_btncase2;
    public static LinearLayout group1_li5_btncase3;

    public static LinearLayout group2_li0_btncase0;
    public static LinearLayout group2_li0_btncase1;
    public static LinearLayout group2_li0_btncase2;
    public static LinearLayout group2_li1_btncase0;
    public static LinearLayout group2_li1_btncase1;
    public static LinearLayout group2_li2_btncase0;
    public static LinearLayout group2_li2_btncase1;
    public static LinearLayout group2_li2_btncase2;
    public static LinearLayout group2_li2_btncase3;
    public static LinearLayout group2_li3_btncase0;
    public static LinearLayout group2_li3_btncase1;
    public static LinearLayout group2_li3_btncase2;
    public static LinearLayout group2_li3_btncase3;
    public static LinearLayout group2_li4_btncase0;
    public static LinearLayout group2_li4_btncase1;
    public static LinearLayout group2_li4_btncase2;
    public static LinearLayout group2_li4_btncase3;
    public static LinearLayout group2_li5_btncase0;
    public static LinearLayout group2_li5_btncase1;
    public static LinearLayout group2_li5_btncase2;
    public static LinearLayout group2_li5_btncase3;

    public static SquareButton group1_li0_btncase0_radio;
    public static SquareButton group1_li0_btncase1_radio;
    public static SquareButton group1_li0_btncase2_radio;
    public static SquareButton group1_li1_btncase0_radio;
    public static SquareButton group1_li1_btncase1_radio;
    public static SquareButton group1_li2_btncase0_radio;
    public static SquareButton group1_li2_btncase1_radio;
    public static SquareButton group1_li2_btncase2_radio;
    public static SquareButton group1_li2_btncase3_radio;
    public static SquareButton group1_li3_btncase0_radio;
    public static SquareButton group1_li3_btncase1_radio;
    public static SquareButton group1_li3_btncase2_radio;
    public static SquareButton group1_li3_btncase3_radio;
    public static SquareButton group1_li4_btncase0_radio;
    public static SquareButton group1_li4_btncase1_radio;
    public static SquareButton group1_li4_btncase2_radio;
    public static SquareButton group1_li4_btncase3_radio;
    public static SquareButton group1_li5_btncase0_radio;
    public static SquareButton group1_li5_btncase1_radio;
    public static SquareButton group1_li5_btncase2_radio;
    public static SquareButton group1_li5_btncase3_radio;

    public static TransitionDrawable group1_li0_btncase0_radio_trans;
    public static TransitionDrawable group1_li0_btncase1_radio_trans;
    public static TransitionDrawable group1_li0_btncase2_radio_trans;
    public static TransitionDrawable group1_li1_btncase0_radio_trans;
    public static TransitionDrawable group1_li1_btncase1_radio_trans;
    public static TransitionDrawable group1_li2_btncase0_radio_trans;
    public static TransitionDrawable group1_li2_btncase1_radio_trans;
    public static TransitionDrawable group1_li2_btncase2_radio_trans;
    public static TransitionDrawable group1_li2_btncase3_radio_trans;
    public static TransitionDrawable group1_li3_btncase0_radio_trans;
    public static TransitionDrawable group1_li3_btncase1_radio_trans;
    public static TransitionDrawable group1_li3_btncase2_radio_trans;
    public static TransitionDrawable group1_li3_btncase3_radio_trans;
    public static TransitionDrawable group1_li4_btncase0_radio_trans;
    public static TransitionDrawable group1_li4_btncase1_radio_trans;
    public static TransitionDrawable group1_li4_btncase2_radio_trans;
    public static TransitionDrawable group1_li4_btncase3_radio_trans;
    public static TransitionDrawable group1_li5_btncase0_radio_trans;
    public static TransitionDrawable group1_li5_btncase1_radio_trans;
    public static TransitionDrawable group1_li5_btncase2_radio_trans;
    public static TransitionDrawable group1_li5_btncase3_radio_trans;

    public static TextView group1_li0_btncase0_text;
    public static TextView group1_li0_btncase1_text;
    public static TextView group1_li0_btncase2_text;
    public static TextView group1_li1_btncase0_text;
    public static TextView group1_li1_btncase1_text;
    public static TextView group1_li2_btncase0_text;
    public static TextView group1_li2_btncase1_text;
    public static TextView group1_li2_btncase2_text;
    public static TextView group1_li2_btncase3_text;
    public static TextView group1_li3_btncase0_text;
    public static TextView group1_li3_btncase1_text;
    public static TextView group1_li3_btncase2_text;
    public static TextView group1_li3_btncase3_text;
    public static TextView group1_li4_btncase0_textView;
    public static TextView group1_li4_btncase1_textView;
    public static TextView group1_li4_btncase2_textView;
    public static TextView group1_li4_btncase3_textView;
    public static TextView group1_li5_btncase0_text;
    public static TextView group1_li5_btncase1_text;
    public static TextView group1_li5_btncase2_text;
    public static TextView group1_li5_btncase3_text;

    public static TextView group2_li0_btncase0_text;
    public static TextView group2_li0_btncase1_text;
    public static TextView group2_li0_btncase2_text;
    public static TextView group2_li1_btncase0_text;
    public static TextView group2_li1_btncase1_text;
    public static TextView group2_li2_btncase0_text;
    public static TextView group2_li2_btncase1_text;
    public static TextView group2_li2_btncase2_text;
    public static TextView group2_li2_btncase3_text;
    public static TextView group2_li3_btncase0_text;
    public static TextView group2_li3_btncase1_text;
    public static TextView group2_li3_btncase2_text;
    public static TextView group2_li3_btncase3_text;
    public static TextView group2_li4_btncase0_textView;
    public static TextView group2_li4_btncase1_textView;
    public static TextView group2_li4_btncase2_textView;
    public static TextView group2_li4_btncase3_textView;
    public static TextView group2_li5_btncase0_text;
    public static TextView group2_li5_btncase1_text;
    public static TextView group2_li5_btncase2_text;
    public static TextView group2_li5_btncase3_text;

    public static SquareButton group2_li0_btncase0_radio;
    public static SquareButton group2_li0_btncase1_radio;
    public static SquareButton group2_li0_btncase2_radio;
    public static SquareButton group2_li1_btncase0_radio;
    public static SquareButton group2_li1_btncase1_radio;
    public static SquareButton group2_li2_btncase0_radio;
    public static SquareButton group2_li2_btncase1_radio;
    public static SquareButton group2_li2_btncase2_radio;
    public static SquareButton group2_li2_btncase3_radio;
    public static SquareButton group2_li3_btncase0_radio;
    public static SquareButton group2_li3_btncase1_radio;
    public static SquareButton group2_li3_btncase2_radio;
    public static SquareButton group2_li3_btncase3_radio;
    public static SquareButton group2_li4_btncase0_radio;
    public static SquareButton group2_li4_btncase1_radio;
    public static SquareButton group2_li4_btncase2_radio;
    public static SquareButton group2_li4_btncase3_radio;
    public static SquareButton group2_li5_btncase0_radio;
    public static SquareButton group2_li5_btncase1_radio;
    public static SquareButton group2_li5_btncase2_radio;
    public static SquareButton group2_li5_btncase3_radio;

    public static TransitionDrawable group2_li0_btncase0_radio_trans;
    public static TransitionDrawable group2_li0_btncase1_radio_trans;
    public static TransitionDrawable group2_li0_btncase2_radio_trans;
    public static TransitionDrawable group2_li1_btncase0_radio_trans;
    public static TransitionDrawable group2_li1_btncase1_radio_trans;
    public static TransitionDrawable group2_li2_btncase0_radio_trans;
    public static TransitionDrawable group2_li2_btncase1_radio_trans;
    public static TransitionDrawable group2_li2_btncase2_radio_trans;
    public static TransitionDrawable group2_li2_btncase3_radio_trans;
    public static TransitionDrawable group2_li3_btncase0_radio_trans;
    public static TransitionDrawable group2_li3_btncase1_radio_trans;
    public static TransitionDrawable group2_li3_btncase2_radio_trans;
    public static TransitionDrawable group2_li3_btncase3_radio_trans;
    public static TransitionDrawable group2_li4_btncase0_radio_trans;
    public static TransitionDrawable group2_li4_btncase1_radio_trans;
    public static TransitionDrawable group2_li4_btncase2_radio_trans;
    public static TransitionDrawable group2_li4_btncase3_radio_trans;
    public static TransitionDrawable group2_li5_btncase0_radio_trans;
    public static TransitionDrawable group2_li5_btncase1_radio_trans;
    public static TransitionDrawable group2_li5_btncase2_radio_trans;
    public static TransitionDrawable group2_li5_btncase3_radio_trans;


    public static TextView result_in_duration;
    public static TextView result_in_scale;
    public static TextView result_in_opacity;
    public static TextView result_in_ease;
    public static TextView result_in_haptic;

    public static TextView result_out_duration;
    public static TextView result_out_scale;
    public static TextView result_out_opacity;
    public static TextView result_out_ease;
    public static TextView result_out_haptic;

    public static View container_btn_updown;

    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        new GetNavigationBarHeight(this);
        int resId = getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        if (resId > 0) { navigationBarHeight = getResources().getDimensionPixelSize(resId); }

        setContentView(R.layout.activity_main);

        ctx = this.getApplicationContext();

        DragAdapter dragAdapter = new DragAdapter(this);
        root = (RelativeLayout)  findViewById(R.id.root);
        container = (RelativeLayout) findViewById(R.id.container);
        container.setOnTouchListener(dragAdapter);
        RelativeLayout.LayoutParams plcontainer = (RelativeLayout.LayoutParams) container.getLayoutParams();
        container_top_margin = plcontainer.topMargin;
        container_top_marginTop = Utils_Calc.dpToPx((int) 16.75);

        anim_title = (TextView) findViewById(R.id.anim_title);

        rect_objectFL = (FrameLayout)findViewById(R.id.rect_objectFL);
        rect_objectFL_Copy = (FrameLayout)findViewById(R.id.rect_objectFL_Copy);
        rect_objectRL = (RelativeLayout)findViewById(R.id.rect_objectRL);
        anim_object_case0 = (SquareView)findViewById(R.id.anim_object_case0);
        anim_object_case1 = (View)findViewById(R.id.anim_object_case1);
        anim_object_case2 = (View)findViewById(R.id.anim_object_case2);
        AnimRectObject animRectObject = new AnimRectObject(anim_object_case0, anim_object_case1, anim_object_case2);

        LinearLayout layout_container_top_group= findViewById(R.id.container_top_group);
        layout_container_top_group.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        container_top_group_height = layout_container_top_group.getMeasuredHeight();

        LinearLayout layout_transgroup_first_ll= findViewById(R.id.transgroup_first_ll);
        layout_transgroup_first_ll.measure(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        container_first_group_height = layout_transgroup_first_ll.getMeasuredHeight();

        TextView transgroup_first_title = findViewById(R.id.transgroup_first_title);
        Rect transgroup_first_title_realSize = new Rect();
        transgroup_first_title.getPaint().getTextBounds(transgroup_first_title.getText().toString(), 0, transgroup_first_title.getText().length(), transgroup_first_title_realSize);
        transgroup_first_title_realSize_height = transgroup_first_title_realSize.height();

        bottom_rect = findViewById(R.id.bottom_rect);
        bottom_rectHeight = Utils_Calc.dpToPx(94);
        bottom_top_margin = Utils_Calc.dpToPx((int) 16.75);
        shadowHeight = Utils_Calc.dpToPx(12);

        array_animationType.add("popup");
        array_animationType.add("nudge");
        array_animationType.add("notice");
        animationType = (array_animationType.get(0));

        ClickAdapter_Top clickAdapterTop = new ClickAdapter_Top(this);

        button_preset_0 = findViewById(R.id.button_preset_0);
        button_preset_1 = findViewById(R.id.button_preset_1);
        button_preset_2 = findViewById(R.id.button_preset_2);
        button_playmotion = findViewById(R.id.button_playmotion);

        button_preset_trans_0 = (TransitionDrawable) button_preset_0.getBackground();
        button_preset_trans_1 = (TransitionDrawable) button_preset_1.getBackground();
        button_preset_trans_2 = (TransitionDrawable) button_preset_2.getBackground();
        button_playmotion_trans = (TransitionDrawable) button_playmotion.getBackground();

        button_preset_0.setOnClickListener(clickAdapterTop);
        button_preset_1.setOnClickListener(clickAdapterTop);
        button_preset_2.setOnClickListener(clickAdapterTop);
        button_playmotion.setOnClickListener(clickAdapterTop);

        group1_li0_btncase0_text = findViewById(R.id.group1_li0_btncase0_text);
        group1_li0_btncase1_text = findViewById(R.id.group1_li0_btncase1_text);
        group1_li0_btncase2_text = findViewById(R.id.group1_li0_btncase2_text);
        group1_li1_btncase0_text = findViewById(R.id.group1_li1_btncase0_text);
        group1_li1_btncase1_text = findViewById(R.id.group1_li1_btncase1_text);
        group1_li2_btncase0_text = findViewById(R.id.group1_li2_btncase0_text);
        group1_li2_btncase1_text = findViewById(R.id.group1_li2_btncase1_text);
        group1_li2_btncase2_text = findViewById(R.id.group1_li2_btncase2_text);
        group1_li2_btncase3_text = findViewById(R.id.group1_li2_btncase3_text);
        group1_li3_btncase0_text = findViewById(R.id.group1_li3_btncase0_text);
        group1_li3_btncase1_text = findViewById(R.id.group1_li3_btncase1_text);
        group1_li3_btncase2_text = findViewById(R.id.group1_li3_btncase2_text);
        group1_li3_btncase3_text = findViewById(R.id.group1_li3_btncase3_text);
        group1_li4_btncase0_textView = findViewById(R.id.group1_li4_btncase0_textView);
        group1_li4_btncase1_textView = findViewById(R.id.group1_li4_btncase1_textView);
        group1_li4_btncase2_textView = findViewById(R.id.group1_li4_btncase2_textView);
        group1_li4_btncase3_textView = findViewById(R.id.group1_li4_btncase3_textView);
        group1_li5_btncase0_text = findViewById(R.id.group1_li5_btncase0_text);
        group1_li5_btncase1_text = findViewById(R.id.group1_li5_btncase1_text);
        group1_li5_btncase2_text = findViewById(R.id.group1_li5_btncase2_text);
        group1_li5_btncase3_text = findViewById(R.id.group1_li5_btncase3_text);

        group2_li0_btncase0_text = findViewById(R.id.group2_li0_btncase0_text);
        group2_li0_btncase1_text = findViewById(R.id.group2_li0_btncase1_text);
        group2_li0_btncase2_text = findViewById(R.id.group2_li0_btncase2_text);
        group2_li1_btncase0_text = findViewById(R.id.group2_li1_btncase0_text);
        group2_li1_btncase1_text = findViewById(R.id.group2_li1_btncase1_text);
        group2_li2_btncase0_text = findViewById(R.id.group2_li2_btncase0_text);
        group2_li2_btncase1_text = findViewById(R.id.group2_li2_btncase1_text);
        group2_li2_btncase2_text = findViewById(R.id.group2_li2_btncase2_text);
        group2_li2_btncase3_text = findViewById(R.id.group2_li2_btncase3_text);
        group2_li3_btncase0_text = findViewById(R.id.group2_li3_btncase0_text);
        group2_li3_btncase1_text = findViewById(R.id.group2_li3_btncase1_text);
        group2_li3_btncase2_text = findViewById(R.id.group2_li3_btncase2_text);
        group2_li3_btncase3_text = findViewById(R.id.group2_li3_btncase3_text);
        group2_li4_btncase0_textView = findViewById(R.id.group2_li4_btncase0_textView);
        group2_li4_btncase1_textView = findViewById(R.id.group2_li4_btncase1_textView);
        group2_li4_btncase2_textView = findViewById(R.id.group2_li4_btncase2_textView);
        group2_li4_btncase3_textView = findViewById(R.id.group2_li4_btncase3_textView);
        group2_li5_btncase0_text = findViewById(R.id.group2_li5_btncase0_text);
        group2_li5_btncase1_text = findViewById(R.id.group2_li5_btncase1_text);
        group2_li5_btncase2_text = findViewById(R.id.group2_li5_btncase2_text);
        group2_li5_btncase3_text = findViewById(R.id.group2_li5_btncase3_text);


        array_string_easeType = getResources().getStringArray(R.array.string_easeType);
        group1_li4_state = array_string_easeType[0];
        group2_li4_state = array_string_easeType[0];

        array_string_btnTitle.add(getString(R.string.paly_in_mot));
        array_string_btnTitle.add(getString(R.string.paly_out_mo));
        button_playmotion.setText(array_string_btnTitle.get(0));

        group1_li0_btncase0 = findViewById(R.id.group1_li0_btncase0);
        group1_li0_btncase1 = findViewById(R.id.group1_li0_btncase1);
        group1_li0_btncase2 = findViewById(R.id.group1_li0_btncase2);
        group1_li1_btncase0 = findViewById(R.id.group1_li1_btncase0);
        group1_li1_btncase1 = findViewById(R.id.group1_li1_btncase1);
        group1_li2_btncase0 = findViewById(R.id.group1_li2_btncase0);
        group1_li2_btncase1 = findViewById(R.id.group1_li2_btncase1);
        group1_li2_btncase2 = findViewById(R.id.group1_li2_btncase2);
        group1_li2_btncase3 = findViewById(R.id.group1_li2_btncase3);
        group1_li3_btncase0 = findViewById(R.id.group1_li3_btncase0);
        group1_li3_btncase1 = findViewById(R.id.group1_li3_btncase1);
        group1_li3_btncase2 = findViewById(R.id.group1_li3_btncase2);
        group1_li3_btncase3 = findViewById(R.id.group1_li3_btncase3);
        group1_li4_btncase0 = findViewById(R.id.group1_li4_btncase0);
        group1_li4_btncase1 = findViewById(R.id.group1_li4_btncase1);
        group1_li4_btncase2 = findViewById(R.id.group1_li4_btncase2);
        group1_li4_btncase3 = findViewById(R.id.group1_li4_btncase3);
        group1_li5_btncase0 = findViewById(R.id.group1_li5_btncase0);
        group1_li5_btncase1 = findViewById(R.id.group1_li5_btncase1);
        group1_li5_btncase2 = findViewById(R.id.group1_li5_btncase2);
        group1_li5_btncase3 = findViewById(R.id.group1_li5_btncase3);

        ClickAdapter_Group1_Li0 clickAdapter_Group1_Li0 = new ClickAdapter_Group1_Li0(this);
        group1_li0_btncase0.setOnClickListener(clickAdapter_Group1_Li0);
        group1_li0_btncase1.setOnClickListener(clickAdapter_Group1_Li0);
        group1_li0_btncase2.setOnClickListener(clickAdapter_Group1_Li0);
        ClickAdapter_Group1_Li1 clickAdapter_Group1_Li1 = new ClickAdapter_Group1_Li1(this);
        group1_li1_btncase0.setOnClickListener(clickAdapter_Group1_Li1);
        group1_li1_btncase1.setOnClickListener(clickAdapter_Group1_Li1);
        ClickAdapter_Group1_Li2 clickAdapter_Group1_Li2 = new ClickAdapter_Group1_Li2(this);
        group1_li2_btncase0.setOnClickListener(clickAdapter_Group1_Li2);
        group1_li2_btncase1.setOnClickListener(clickAdapter_Group1_Li2);
        group1_li2_btncase2.setOnClickListener(clickAdapter_Group1_Li2);
        group1_li2_btncase3.setOnClickListener(clickAdapter_Group1_Li2);
        ClickAdapter_Group1_Li3 clickAdapter_Group1_Li3 = new ClickAdapter_Group1_Li3(this);
        group1_li3_btncase0.setOnClickListener(clickAdapter_Group1_Li3);
        group1_li3_btncase1.setOnClickListener(clickAdapter_Group1_Li3);
        group1_li3_btncase2.setOnClickListener(clickAdapter_Group1_Li3);
        group1_li3_btncase3.setOnClickListener(clickAdapter_Group1_Li3);
        ClickAdapter_Group1_Li4 clickAdapter_Group1_Li4 = new ClickAdapter_Group1_Li4(this);
        group1_li4_btncase0.setOnClickListener(clickAdapter_Group1_Li4);
        group1_li4_btncase1.setOnClickListener(clickAdapter_Group1_Li4);
        group1_li4_btncase2.setOnClickListener(clickAdapter_Group1_Li4);
        group1_li4_btncase3.setOnClickListener(clickAdapter_Group1_Li4);
        ClickAdapter_Group1_Li5 clickAdapter_Group1_Li5 = new ClickAdapter_Group1_Li5(this);
        group1_li5_btncase0.setOnClickListener(clickAdapter_Group1_Li5);
        group1_li5_btncase1.setOnClickListener(clickAdapter_Group1_Li5);
        group1_li5_btncase2.setOnClickListener(clickAdapter_Group1_Li5);
        group1_li5_btncase3.setOnClickListener(clickAdapter_Group1_Li5);

        group2_li0_btncase0 = findViewById(R.id.group2_li0_btncase0);
        group2_li0_btncase1 = findViewById(R.id.group2_li0_btncase1);
        group2_li0_btncase2 = findViewById(R.id.group2_li0_btncase2);
        group2_li1_btncase0 = findViewById(R.id.group2_li1_btncase0);
        group2_li1_btncase1 = findViewById(R.id.group2_li1_btncase1);
        group2_li2_btncase0 = findViewById(R.id.group2_li2_btncase0);
        group2_li2_btncase1 = findViewById(R.id.group2_li2_btncase1);
        group2_li2_btncase2 = findViewById(R.id.group2_li2_btncase2);
        group2_li2_btncase3 = findViewById(R.id.group2_li2_btncase3);

        group2_li3_btncase0 = findViewById(R.id.group2_li3_btncase0);
        group2_li3_btncase1 = findViewById(R.id.group2_li3_btncase1);
        group2_li3_btncase2 = findViewById(R.id.group2_li3_btncase2);
        group2_li3_btncase3 = findViewById(R.id.group2_li3_btncase3);

        group2_li4_btncase0 = findViewById(R.id.group2_li4_btncase0);
        group2_li4_btncase1 = findViewById(R.id.group2_li4_btncase1);
        group2_li4_btncase2 = findViewById(R.id.group2_li4_btncase2);
        group2_li4_btncase3 = findViewById(R.id.group2_li4_btncase3);
        group2_li5_btncase0 = findViewById(R.id.group2_li5_btncase0);
        group2_li5_btncase1 = findViewById(R.id.group2_li5_btncase1);
        group2_li5_btncase2 = findViewById(R.id.group2_li5_btncase2);
        group2_li5_btncase3 = findViewById(R.id.group2_li5_btncase3);

        ClickAdapter_Group2_Li0 clickAdapter_Group2_Li0 = new ClickAdapter_Group2_Li0(this);
        group2_li0_btncase0.setOnClickListener(clickAdapter_Group2_Li0);
        group2_li0_btncase1.setOnClickListener(clickAdapter_Group2_Li0);
        group2_li0_btncase2.setOnClickListener(clickAdapter_Group2_Li0);
        ClickAdapter_Group2_Li1 clickAdapter_Group2_Li1 = new ClickAdapter_Group2_Li1(this);
        group2_li1_btncase0.setOnClickListener(clickAdapter_Group2_Li1);
        group2_li1_btncase1.setOnClickListener(clickAdapter_Group2_Li1);
        ClickAdapter_Group2_Li2 clickAdapter_Group2_Li2 = new ClickAdapter_Group2_Li2(this);
        group2_li2_btncase0.setOnClickListener(clickAdapter_Group2_Li2);
        group2_li2_btncase1.setOnClickListener(clickAdapter_Group2_Li2);
        group2_li2_btncase2.setOnClickListener(clickAdapter_Group2_Li2);
        group2_li2_btncase3.setOnClickListener(clickAdapter_Group2_Li2);
        ClickAdapter_Group2_Li3 clickAdapter_Group2_Li3 = new ClickAdapter_Group2_Li3(this);
        group2_li3_btncase0.setOnClickListener(clickAdapter_Group2_Li3);
        group2_li3_btncase1.setOnClickListener(clickAdapter_Group2_Li3);
        group2_li3_btncase2.setOnClickListener(clickAdapter_Group2_Li3);
        group2_li3_btncase3.setOnClickListener(clickAdapter_Group2_Li3);
        ClickAdapter_Group2_Li4 clickAdapter_Group2_Li4 = new ClickAdapter_Group2_Li4(this);
        group2_li4_btncase0.setOnClickListener(clickAdapter_Group2_Li4);
        group2_li4_btncase1.setOnClickListener(clickAdapter_Group2_Li4);
        group2_li4_btncase2.setOnClickListener(clickAdapter_Group2_Li4);
        group2_li4_btncase3.setOnClickListener(clickAdapter_Group2_Li4);
        ClickAdapter_Group2_Li5 clickAdapter_Group2_Li5 = new ClickAdapter_Group2_Li5(this);
        group2_li5_btncase0.setOnClickListener(clickAdapter_Group2_Li5);
        group2_li5_btncase1.setOnClickListener(clickAdapter_Group2_Li5);
        group2_li5_btncase2.setOnClickListener(clickAdapter_Group2_Li5);
        group2_li5_btncase3.setOnClickListener(clickAdapter_Group2_Li5);

        button_preset_trans_0.startTransition(0);
        button_preset_0.setTextColor(getResources().getColorStateList(R.color.white));

        result_in_duration = findViewById(R.id.result_in_duration);
        result_in_scale = findViewById(R.id.result_in_scale);
        result_in_opacity = findViewById(R.id.result_in_opacity);
        result_in_ease = findViewById(R.id.result_in_ease);
        result_in_haptic = findViewById(R.id.result_in_haptic);

        result_out_duration = findViewById(R.id.result_out_duration);
        result_out_scale = findViewById(R.id.result_out_scale);
        result_out_opacity = findViewById(R.id.result_out_opacity);
        result_out_ease = findViewById(R.id.result_out_ease);
        result_out_haptic = findViewById(R.id.result_out_haptic);

        group1_li0_btncase0_radio = findViewById(R.id.group1_li0_btncase0_radio);
        group1_li0_btncase1_radio = findViewById(R.id.group1_li0_btncase1_radio);
        group1_li0_btncase2_radio = findViewById(R.id.group1_li0_btncase2_radio);
        group1_li0_btncase0_radio_trans = (TransitionDrawable) group1_li0_btncase0_radio.getBackground();
        group1_li0_btncase1_radio_trans = (TransitionDrawable) group1_li0_btncase1_radio.getBackground();
        group1_li0_btncase2_radio_trans = (TransitionDrawable) group1_li0_btncase2_radio.getBackground();

        group1_li1_btncase0_radio = findViewById(R.id.group1_li1_btncase0_radio);
        group1_li1_btncase1_radio = findViewById(R.id.group1_li1_btncase1_radio);
        group1_li1_btncase0_radio_trans = (TransitionDrawable) group1_li1_btncase0_radio.getBackground();
        group1_li1_btncase1_radio_trans = (TransitionDrawable) group1_li1_btncase1_radio.getBackground();

        group1_li2_btncase0_radio = findViewById(R.id.group1_li2_btncase0_radio);
        group1_li2_btncase1_radio = findViewById(R.id.group1_li2_btncase1_radio);
        group1_li2_btncase2_radio = findViewById(R.id.group1_li2_btncase2_radio);
        group1_li2_btncase3_radio = findViewById(R.id.group1_li2_btncase3_radio);
        group1_li2_btncase0_radio_trans = (TransitionDrawable) group1_li2_btncase0_radio.getBackground();
        group1_li2_btncase1_radio_trans = (TransitionDrawable) group1_li2_btncase1_radio.getBackground();
        group1_li2_btncase2_radio_trans = (TransitionDrawable) group1_li2_btncase2_radio.getBackground();
        group1_li2_btncase3_radio_trans = (TransitionDrawable) group1_li2_btncase3_radio.getBackground();

        group1_li3_btncase0_radio = findViewById(R.id.group1_li3_btncase0_radio);
        group1_li3_btncase1_radio = findViewById(R.id.group1_li3_btncase1_radio);
        group1_li3_btncase2_radio = findViewById(R.id.group1_li3_btncase2_radio);
        group1_li3_btncase3_radio = findViewById(R.id.group1_li3_btncase3_radio);
        group1_li3_btncase0_radio_trans = (TransitionDrawable) group1_li3_btncase0_radio.getBackground();
        group1_li3_btncase1_radio_trans = (TransitionDrawable) group1_li3_btncase1_radio.getBackground();
        group1_li3_btncase2_radio_trans = (TransitionDrawable) group1_li3_btncase2_radio.getBackground();
        group1_li3_btncase3_radio_trans = (TransitionDrawable) group1_li3_btncase3_radio.getBackground();

        group1_li4_btncase0_radio = findViewById(R.id.group1_li4_btncase0_radio);
        group1_li4_btncase1_radio = findViewById(R.id.group1_li4_btncase1_radio);
        group1_li4_btncase2_radio = findViewById(R.id.group1_li4_btncase2_radio);
        group1_li4_btncase3_radio = findViewById(R.id.group1_li4_btncase3_radio);
        group1_li4_btncase0_radio_trans = (TransitionDrawable) group1_li4_btncase0_radio.getBackground();
        group1_li4_btncase1_radio_trans = (TransitionDrawable) group1_li4_btncase1_radio.getBackground();
        group1_li4_btncase2_radio_trans = (TransitionDrawable) group1_li4_btncase2_radio.getBackground();
        group1_li4_btncase3_radio_trans = (TransitionDrawable) group1_li4_btncase3_radio.getBackground();

        group1_li5_btncase0_radio = findViewById(R.id.group1_li5_btncase0_radio);
        group1_li5_btncase1_radio = findViewById(R.id.group1_li5_btncase1_radio);
        group1_li5_btncase2_radio = findViewById(R.id.group1_li5_btncase2_radio);
        group1_li5_btncase3_radio = findViewById(R.id.group1_li5_btncase3_radio);
        group1_li5_btncase0_radio_trans = (TransitionDrawable) group1_li5_btncase0_radio.getBackground();
        group1_li5_btncase1_radio_trans = (TransitionDrawable) group1_li5_btncase1_radio.getBackground();
        group1_li5_btncase2_radio_trans = (TransitionDrawable) group1_li5_btncase2_radio.getBackground();
        group1_li5_btncase3_radio_trans = (TransitionDrawable) group1_li5_btncase3_radio.getBackground();

        group2_li0_btncase0_radio = findViewById(R.id.group2_li0_btncase0_radio);
        group2_li0_btncase1_radio = findViewById(R.id.group2_li0_btncase1_radio);
        group2_li0_btncase2_radio = findViewById(R.id.group2_li0_btncase2_radio);
        group2_li0_btncase0_radio_trans = (TransitionDrawable) group2_li0_btncase0_radio.getBackground();
        group2_li0_btncase1_radio_trans = (TransitionDrawable) group2_li0_btncase1_radio.getBackground();
        group2_li0_btncase2_radio_trans = (TransitionDrawable) group2_li0_btncase2_radio.getBackground();

        group2_li1_btncase0_radio = findViewById(R.id.group2_li1_btncase0_radio);
        group2_li1_btncase1_radio = findViewById(R.id.group2_li1_btncase1_radio);
        group2_li1_btncase0_radio_trans = (TransitionDrawable) group2_li1_btncase0_radio.getBackground();
        group2_li1_btncase1_radio_trans = (TransitionDrawable) group2_li1_btncase1_radio.getBackground();

        group2_li2_btncase0_radio = findViewById(R.id.group2_li2_btncase0_radio);
        group2_li2_btncase1_radio = findViewById(R.id.group2_li2_btncase1_radio);
        group2_li2_btncase2_radio = findViewById(R.id.group2_li2_btncase2_radio);
        group2_li2_btncase3_radio = findViewById(R.id.group2_li2_btncase3_radio);

        group2_li2_btncase0_radio_trans = (TransitionDrawable) group2_li2_btncase0_radio.getBackground();
        group2_li2_btncase1_radio_trans = (TransitionDrawable) group2_li2_btncase1_radio.getBackground();
        group2_li2_btncase2_radio_trans = (TransitionDrawable) group2_li2_btncase2_radio.getBackground();
        group2_li2_btncase3_radio_trans = (TransitionDrawable) group2_li2_btncase3_radio.getBackground();

        group2_li3_btncase0_radio = findViewById(R.id.group2_li3_btncase0_radio);
        group2_li3_btncase1_radio = findViewById(R.id.group2_li3_btncase1_radio);
        group2_li3_btncase2_radio = findViewById(R.id.group2_li3_btncase2_radio);
        group2_li3_btncase3_radio = findViewById(R.id.group2_li3_btncase3_radio);
        group2_li3_btncase0_radio_trans = (TransitionDrawable) group2_li3_btncase0_radio.getBackground();
        group2_li3_btncase1_radio_trans = (TransitionDrawable) group2_li3_btncase1_radio.getBackground();
        group2_li3_btncase2_radio_trans = (TransitionDrawable) group2_li3_btncase2_radio.getBackground();
        group2_li3_btncase3_radio_trans = (TransitionDrawable) group2_li3_btncase3_radio.getBackground();

        group2_li4_btncase0_radio = findViewById(R.id.group2_li4_btncase0_radio);
        group2_li4_btncase1_radio = findViewById(R.id.group2_li4_btncase1_radio);
        group2_li4_btncase2_radio = findViewById(R.id.group2_li4_btncase2_radio);
        group2_li4_btncase3_radio = findViewById(R.id.group2_li4_btncase3_radio);
        group2_li4_btncase0_radio_trans = (TransitionDrawable) group2_li4_btncase0_radio.getBackground();
        group2_li4_btncase1_radio_trans = (TransitionDrawable) group2_li4_btncase1_radio.getBackground();
        group2_li4_btncase2_radio_trans = (TransitionDrawable) group2_li4_btncase2_radio.getBackground();
        group2_li4_btncase3_radio_trans = (TransitionDrawable) group2_li4_btncase3_radio.getBackground();

        group2_li5_btncase0_radio = findViewById(R.id.group2_li5_btncase0_radio);
        group2_li5_btncase1_radio = findViewById(R.id.group2_li5_btncase1_radio);
        group2_li5_btncase2_radio = findViewById(R.id.group2_li5_btncase2_radio);
        group2_li5_btncase3_radio = findViewById(R.id.group2_li5_btncase3_radio);
        group2_li5_btncase0_radio_trans = (TransitionDrawable) group2_li5_btncase0_radio.getBackground();
        group2_li5_btncase1_radio_trans = (TransitionDrawable) group2_li5_btncase1_radio.getBackground();
        group2_li5_btncase2_radio_trans = (TransitionDrawable) group2_li5_btncase2_radio.getBackground();
        group2_li5_btncase3_radio_trans = (TransitionDrawable) group2_li5_btncase3_radio.getBackground();

        group1_li4_btncase0_textView.setText(array_string_easeType[0]);
        group1_li4_btncase1_textView.setText(array_string_easeType[1]);
        group1_li4_btncase2_textView.setText(array_string_easeType[2]);
        group1_li4_btncase3_textView.setText(array_string_easeType[3]);

        group2_li4_btncase0_textView.setText(array_string_easeType[0]);
        group2_li4_btncase1_textView.setText(array_string_easeType[1]);
        group2_li4_btncase2_textView.setText(array_string_easeType[2]);
        group2_li4_btncase3_textView.setText(array_string_easeType[3]);

        posMinY = 0;
        posMaxY = 0;
        container.setY(posMinY);

        ViewGroup.LayoutParams params = rect_objectFL.getLayoutParams();
        params_copy = rect_objectFL_Copy.getLayoutParams();

        container_btn_updown = (View) findViewById(R.id.container_btn_updown);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                bottom_rectHeight = bottom_rect.getHeight();
                rootHeight = root.getHeight();
                posMinY = root.getHeight()-(container_top_group_height+container_top_marginTop+shadowHeight);
                container.setY(posMinY);
                MainActivity.rect_objectFL.setY(0);
                heightMin = rect_objectFL.getHeight()+shadowHeight;
                heightMax = screenHeight - bottom_rectHeight - (container_top_group_height+container_top_marginTop+shadowHeight)-shadowHeight;
//                heightMax = screenHeight - bottom_rectHeight - (container_top_group_height+container_top_marginTop+shadowHeight)-0;
                posMinY_drag = root.getHeight()-(container_top_group_height+container_top_marginTop+shadowHeight)-shadowHeight;
                params_copy.height = heightMax;
                rect_objectFL_Copy.setLayoutParams(params_copy);
                ResetState.defCaseState00();

            }
        }, 1);

        container_btn_updown.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!container_bool){
                        DragAdapter.function_containAnim(MainActivity.container, MainActivity.posMaxY, 400, AnimRectObject.interpolator_easeOut);
                        DragAdapter.function_rectObjAnim(MainActivity.rect_objectFL_Copy, MainActivity.heightMax, MainActivity.heightMin, 400, AnimRectObject.interpolator_easeOut);
                        container_bool = true;
                        MainActivity.container_btn_updown.setRotation(-180);
                } else {
                        DragAdapter.function_containAnim(MainActivity.container, MainActivity.posMinY, 400, AnimRectObject.interpolator_easeOut);
                        DragAdapter.function_rectObjAnim(MainActivity.rect_objectFL_Copy, MainActivity.heightMin, MainActivity.heightMax, 400, AnimRectObject.interpolator_easeOut);
                        container_bool = false;
                        MainActivity.container_btn_updown.setRotation(0);
                }
            }
        }) ;
    }

    public static void stateCheck_group1(){
//        Log.d("stateCheck_group1", ""+group1_li0_state+", "+group1_li1_state+", "+group1_li2_state+", "+group1_li3_state+" "+group1_li4_state+", "+group1_li5_state);
    }
    public static void stateCheck_group2(){
//        Log.d("stateCheck_group2", ""+group2_li0_state+", "+group2_li1_state+", "+group2_li2_state+", "+group2_li3_state+", "+group2_li4_state+", "+group2_li5_state);
    }
    public void getAbsCoord(int resId) {

        View v = findViewById(resId);
        if (v == null)
            throw new IllegalArgumentException("this is not a view");

        Rect r = new Rect();
        v.getGlobalVisibleRect(r); //RootView 레이아웃을 기준으로한 좌표.

        //custom Log
//        Log.(v.getResources().getResourceName(resId).split(":")[1] + " 의절대좌표::", r.left, r.top, r.right, r.bottom);
    }


}