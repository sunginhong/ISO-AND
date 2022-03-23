package com.example.sideproject_06;

import android.graphics.Color;
import android.view.View;

public class ResetState {
    public ResetState(View view){

    }

    public static void defCaseState00(){
        MainActivity.anim_title.setText("Popup Animation");
        MainActivity.rect_code_anim_title.setText("Popup Interaction Guide");
        defCaseState();

        Vars.defCaseState00_group1_li4_state_def = Vars.array_string_easeType[1];
        Vars.group1_li0_state = Vars.defCaseState00_group1_li0_state_def;
        Vars.group1_li1_state = Vars.defCaseState00_group1_li1_state_def;
        Vars.group1_li2_state = Vars.defCaseState00_group1_li2_state_def;
        Vars.group1_li3_state = Vars.defCaseState00_group1_li3_state_def;
        Vars.group1_li4_state = Vars.defCaseState00_group1_li4_state_def;
        Vars.group1_li5_state = Vars.defCaseState00_group1_li5_state_def;

        MainActivity.group1_li0_btncase1_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li0_btncase1_radio_trans.startTransition(0);
        MainActivity.group1_li1_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li1_btncase0_radio_trans.startTransition(0);
        MainActivity.group1_li2_btncase1_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li2_btncase1_radio_trans.startTransition(0);
        MainActivity.group1_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li3_btncase0_radio_trans.startTransition(0);
        MainActivity.group1_li4_btncase1_textView.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li4_btncase1_radio_trans.startTransition(0);
        MainActivity.group1_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li5_btncase0_radio_trans.startTransition(0);

        Vars.defCaseState00_group2_li4_state_def = Vars.array_string_easeType[1];
        Vars.group2_li0_state = Vars.defCaseState00_group1_li0_state_def;
        Vars.group2_li1_state = Vars.defCaseState00_group1_li1_state_def;
        Vars.group2_li2_state = Vars.defCaseState00_group1_li2_state_def;
        Vars.group2_li3_state = Vars.defCaseState00_group1_li3_state_def;
        Vars.group2_li4_state = Vars.defCaseState00_group1_li4_state_def;
        Vars.group2_li5_state = Vars.defCaseState00_group1_li5_state_def;

        MainActivity.group2_li0_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li0_btncase0_radio_trans.startTransition(0);
        MainActivity.group2_li1_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li1_btncase0_radio_trans.startTransition(0);
        MainActivity.group2_li2_btncase1_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li2_btncase1_radio_trans.startTransition(0);
        MainActivity.group2_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li3_btncase0_radio_trans.startTransition(0);
        MainActivity.group2_li4_btncase1_textView.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li4_btncase1_radio_trans.startTransition(0);
        MainActivity.group2_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li5_btncase0_radio_trans.startTransition(0);

        MainActivity.group1_result_5.setText("ease" + Vars.array_string_easeType[1] + " - " + MainActivity.result_in_ease.getText());
        MainActivity.group2_result_5.setText("ease" + Vars.array_string_easeType[1] + " - " + MainActivity.result_out_ease.getText());

        MainActivity.rect_code_anim_object_case0.setAlpha(1);
        MainActivity.rect_code_anim_object_case1.setAlpha(0);
        MainActivity.rect_code_anim_object_case2.setAlpha(0);

        MainActivity.group1_result_2.setText("위치 이동 없음");
        MainActivity.group2_result_2.setText("위치 이동 없음");
        MainActivity.group1_result_3.setText("0.5");
        MainActivity.group2_result_3.setText("0.5");
    }

    public static void defCaseState01(){
        MainActivity.anim_title.setText("Nudge Animation");
        MainActivity.rect_code_anim_title.setText("Nudge Interaction Guide");
        defCaseState();

        Vars.defCaseState01_group1_li4_state_def = Vars.array_string_easeType[1];
        Vars.group1_li0_state = Vars.defCaseState01_group1_li0_state_def;
        Vars.group1_li1_state = Vars.defCaseState01_group1_li1_state_def;
        Vars.group1_li2_state = Vars.defCaseState01_group1_li2_state_def;
        Vars.group1_li3_state = Vars.defCaseState01_group1_li3_state_def;
        Vars.group1_li4_state = Vars.defCaseState01_group1_li4_state_def;
        Vars.group1_li5_state = Vars.defCaseState01_group1_li5_state_def;

        MainActivity.group1_li0_btncase1_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li0_btncase1_radio_trans.startTransition(0);
        MainActivity.group1_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li1_btncase1_radio_trans.startTransition(0);
        MainActivity.group1_li2_btncase3_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li2_btncase3_radio_trans.startTransition(0);
        MainActivity.group1_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li3_btncase0_radio_trans.startTransition(0);
        MainActivity.group1_li4_btncase1_textView.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li4_btncase1_radio_trans.startTransition(0);
        MainActivity.group1_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li5_btncase0_radio_trans.startTransition(0);

        Vars.defCaseState01_group2_li4_state_def = Vars.array_string_easeType[1];
        Vars.group2_li0_state = Vars.defCaseState01_group1_li0_state_def;
        Vars.group2_li1_state = Vars.defCaseState01_group1_li1_state_def;
        Vars.group2_li2_state = Vars.defCaseState01_group1_li2_state_def;
        Vars.group2_li3_state = Vars.defCaseState01_group1_li3_state_def;
        Vars.group2_li4_state = Vars.defCaseState01_group1_li4_state_def;
        Vars.group2_li5_state = Vars.defCaseState01_group1_li5_state_def;

        MainActivity.group2_li0_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li0_btncase0_radio_trans.startTransition(0);
        MainActivity.group2_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li1_btncase1_radio_trans.startTransition(0);
        MainActivity.group2_li2_btncase3_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li2_btncase3_radio_trans.startTransition(0);
        MainActivity.group2_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li3_btncase0_radio_trans.startTransition(0);
        MainActivity.group2_li4_btncase1_textView.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li4_btncase1_radio_trans.startTransition(0);
        MainActivity.group2_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li5_btncase0_radio_trans.startTransition(0);

        MainActivity.group1_result_5.setText("ease" + Vars.array_string_easeType[1] + " - " + MainActivity.result_in_ease.getText());
        MainActivity.group2_result_5.setText("ease" + Vars.array_string_easeType[1] + " - " + MainActivity.result_out_ease.getText());

        MainActivity.rect_code_anim_object_case0.setAlpha(0);
        MainActivity.rect_code_anim_object_case1.setAlpha(1);
        MainActivity.rect_code_anim_object_case2.setAlpha(0);

        MainActivity.group1_result_2.setText("가이드 위치 + 30에서 → 가이드 위치까지 이동");
        MainActivity.group2_result_2.setText("가이드 위치 + 30에서 → 가이드 위치까지 이동");
        MainActivity.group1_result_3.setText("1");
        MainActivity.group2_result_3.setText("1");
    }

    public static void defCaseState02(){
        MainActivity.anim_title.setText("Alarm Animation");
        MainActivity.rect_code_anim_title.setText("Alarm Interaction Guide");
        defCaseState();

        Vars.defCaseState02_group1_li4_state_def = Vars.array_string_easeType[1];
        Vars.group1_li0_state = Vars.defCaseState02_group1_li0_state_def;
        Vars.group1_li1_state = Vars.defCaseState02_group1_li1_state_def;
        Vars.group1_li2_state = Vars.defCaseState02_group1_li2_state_def;
        Vars.group1_li3_state = Vars.defCaseState02_group1_li3_state_def;
        Vars.group1_li4_state = Vars.defCaseState02_group1_li4_state_def;
        Vars.group1_li5_state = Vars.defCaseState02_group1_li5_state_def;

        MainActivity.group1_li0_btncase1_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li0_btncase1_radio_trans.startTransition(0);
        MainActivity.group1_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li1_btncase1_radio_trans.startTransition(0);
        MainActivity.group1_li2_btncase3_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li2_btncase3_radio_trans.startTransition(0);
        MainActivity.group1_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li3_btncase0_radio_trans.startTransition(0);
        MainActivity.group1_li4_btncase1_textView.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li4_btncase1_radio_trans.startTransition(0);
        MainActivity.group1_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group1_li5_btncase0_radio_trans.startTransition(0);

        Vars.defCaseState02_group2_li4_state_def = Vars.array_string_easeType[1];
        Vars.group2_li0_state = Vars.defCaseState02_group1_li0_state_def;
        Vars.group2_li1_state = Vars.defCaseState02_group1_li1_state_def;
        Vars.group2_li2_state = Vars.defCaseState02_group1_li2_state_def;
        Vars.group2_li3_state = Vars.defCaseState02_group1_li3_state_def;
        Vars.group2_li4_state = Vars.defCaseState02_group1_li4_state_def;
        Vars.group2_li5_state = Vars.defCaseState02_group1_li5_state_def;

        MainActivity.group2_li0_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li0_btncase0_radio_trans.startTransition(0);
        MainActivity.group2_li1_btncase1_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li1_btncase1_radio_trans.startTransition(0);
        MainActivity.group2_li2_btncase3_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li2_btncase3_radio_trans.startTransition(0);
        MainActivity.group2_li3_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li3_btncase0_radio_trans.startTransition(0);
        MainActivity.group2_li4_btncase1_textView.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li4_btncase1_radio_trans.startTransition(0);
        MainActivity.group2_li5_btncase0_text.setTextColor(Color.parseColor("#000000"));
        MainActivity.group2_li5_btncase0_radio_trans.startTransition(0);

        MainActivity.group1_result_5.setText("ease" + Vars.array_string_easeType[1] + " - " + MainActivity.result_in_ease.getText());
        MainActivity.group2_result_5.setText("ease" + Vars.array_string_easeType[1] + " - " + MainActivity.result_out_ease.getText());

        MainActivity.rect_code_anim_object_case0.setAlpha(0);
        MainActivity.rect_code_anim_object_case1.setAlpha(0);
        MainActivity.rect_code_anim_object_case2.setAlpha(1);

        MainActivity.group1_result_2.setText("가이드 위치 + 30에서 → 가이드 위치까지 이동");
        MainActivity.group2_result_2.setText("가이드 위치 + 30에서 → 가이드 위치까지 이동");
        MainActivity.group1_result_3.setText("1");
        MainActivity.group2_result_3.setText("1");
    }

    public static void defCaseState(){
        AnimRectObject.function_CasePopup_containStateAnim_reset();
        AnimRectObject.function_CaseNudge_containStateAnim_reset();
        AnimRectObject.function_CaseAlarm_containStateAnim_reset();

        ClickAdapter_Top.isClickPlaymotion = false;
        Vars.playMotionState = "In";
        MainActivity.button_playmotion.setText(MainActivity.array_string_btnTitle.get(0));
        MainActivity.button_playmotion_trans.resetTransition();
        MainActivity.button_playmotion.setTextColor(Color.parseColor("#ffffff"));

        MainActivity.group1_li0_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li0_btncase0_radio_trans.resetTransition();
        MainActivity.group1_li0_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li0_btncase1_radio_trans.resetTransition();
        MainActivity.group1_li0_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li0_btncase2_radio_trans.resetTransition();

        MainActivity.group1_li1_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li1_btncase0_radio_trans.resetTransition();
        MainActivity.group1_li1_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li1_btncase1_radio_trans.resetTransition();

        MainActivity.group1_li2_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li2_btncase0_radio_trans.resetTransition();
        MainActivity.group1_li2_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li2_btncase1_radio_trans.resetTransition();
        MainActivity.group1_li2_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li2_btncase2_radio_trans.resetTransition();
        MainActivity.group1_li2_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li2_btncase3_radio_trans.resetTransition();

        MainActivity.group1_li3_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li3_btncase0_radio_trans.resetTransition();
        MainActivity.group1_li3_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li3_btncase1_radio_trans.resetTransition();
        MainActivity.group1_li3_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li3_btncase2_radio_trans.resetTransition();
        MainActivity.group1_li3_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li3_btncase3_radio_trans.resetTransition();

        MainActivity.group1_li4_btncase0_textView.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li4_btncase0_radio_trans.resetTransition();
        MainActivity.group1_li4_btncase1_textView.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li4_btncase1_radio_trans.resetTransition();
        MainActivity.group1_li4_btncase2_textView.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li4_btncase2_radio_trans.resetTransition();
        MainActivity.group1_li4_btncase3_textView.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li4_btncase3_radio_trans.resetTransition();

        MainActivity.group1_li5_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li5_btncase0_radio_trans.resetTransition();
        MainActivity.group1_li5_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li5_btncase1_radio_trans.resetTransition();
        MainActivity.group1_li5_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li5_btncase2_radio_trans.resetTransition();
        MainActivity.group1_li5_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group1_li5_btncase3_radio_trans.resetTransition();

//
        MainActivity.group2_li0_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li0_btncase0_radio_trans.resetTransition();
        MainActivity.group2_li0_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li0_btncase1_radio_trans.resetTransition();
        MainActivity.group2_li0_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li0_btncase2_radio_trans.resetTransition();

        MainActivity.group2_li1_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li1_btncase0_radio_trans.resetTransition();
        MainActivity.group2_li1_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li1_btncase1_radio_trans.resetTransition();

        MainActivity.group2_li2_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li2_btncase0_radio_trans.resetTransition();
        MainActivity.group2_li2_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li2_btncase1_radio_trans.resetTransition();
        MainActivity.group2_li2_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li2_btncase2_radio_trans.resetTransition();
        MainActivity.group2_li2_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li2_btncase3_radio_trans.resetTransition();

        MainActivity.group2_li3_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li3_btncase0_radio_trans.resetTransition();
        MainActivity.group2_li3_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li3_btncase1_radio_trans.resetTransition();
        MainActivity.group2_li3_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li3_btncase2_radio_trans.resetTransition();
        MainActivity.group2_li3_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li3_btncase3_radio_trans.resetTransition();

        MainActivity.group2_li4_btncase0_textView.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li4_btncase0_radio_trans.resetTransition();
        MainActivity.group2_li4_btncase1_textView.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li4_btncase1_radio_trans.resetTransition();
        MainActivity.group2_li4_btncase2_textView.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li4_btncase2_radio_trans.resetTransition();
        MainActivity.group2_li4_btncase3_textView.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li4_btncase3_radio_trans.resetTransition();

        MainActivity.group2_li5_btncase0_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li5_btncase0_radio_trans.resetTransition();
        MainActivity.group2_li5_btncase1_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li5_btncase1_radio_trans.resetTransition();
        MainActivity.group2_li5_btncase2_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li5_btncase2_radio_trans.resetTransition();
        MainActivity.group2_li5_btncase3_text.setTextColor(Color.parseColor("#BDC0BD"));
        MainActivity.group2_li5_btncase3_radio_trans.resetTransition();

        MainActivity.rect_code_anim_object_case0.setAlpha(1);
        MainActivity.rect_code_anim_object_case1.setAlpha(0);
        MainActivity.rect_code_anim_object_case2.setAlpha(0);

        MainActivity.group1_result_2.setText("위치 이동 없음");
        MainActivity.group2_result_2.setText("위치 이동 없음");
        MainActivity.group1_result_3.setText("0.5");
        MainActivity.group2_result_3.setText("0.5");

    }

}
