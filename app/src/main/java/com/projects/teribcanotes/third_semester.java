package com.projects.teribcanotes;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class third_semester extends MenuActivity implements View.OnClickListener {
    Button first, second, third, fourth,fifth;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_semester);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("BCA 3RD SEMESTER");

        first=findViewById(R.id.first_sem);
        second=findViewById(R.id.second_sem);
        third=findViewById(R.id.third_sem);
        fourth=findViewById(R.id.fourth_sem);
        fifth=findViewById(R.id.ques_paper);


        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
        fourth.setOnClickListener(this);
        fifth.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(@NonNull View view) {
            Intent intent;
        switch (view.getId()){
            case R.id.first_sem:
                intent=new Intent( third_semester.this, sub_cbnst.class);
                startActivity(intent);
                break;
            case R.id.second_sem:
                intent=new Intent(third_semester.this, sub_se.class);
                startActivity(intent);
                break;
            case R.id.third_sem:
                intent=new Intent(third_semester.this, sub_pos.class);
                startActivity(intent);
                break;
            case R.id.fourth_sem:
                intent=new Intent(third_semester.this, sub_java.class);
                startActivity(intent);
                break;
            case R.id.ques_paper:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=19S-R2NOAowOSKQmE-cnWd7ZeakI6eMOV"));
                startActivity(intent);
                break;
            default:

        }
    }
}