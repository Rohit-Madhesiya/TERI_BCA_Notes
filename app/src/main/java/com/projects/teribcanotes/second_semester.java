package com.projects.teribcanotes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;


public class second_semester extends MenuActivity implements View.OnClickListener{
    Button firstbtn,secondbtn,thirdbtn,fourthbtn,fifthbtn;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_semester);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("BCA 2ND SEMESTER");


        firstbtn=findViewById(R.id.first_sem);
        secondbtn=findViewById(R.id.second_sem);
        thirdbtn=findViewById(R.id.third_sem);
        fourthbtn=findViewById(R.id.fourth_sem);
        fifthbtn=findViewById(R.id.ques_paper);


        firstbtn.setOnClickListener(this);
        secondbtn.setOnClickListener(this);
        thirdbtn.setOnClickListener(this);
        fourthbtn.setOnClickListener(this);
        fifthbtn.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.first_sem:
                Toast.makeText(this, "Notes Available Soon", Toast.LENGTH_SHORT).show();
                //intent=new Intent( sixth_semester.this, sub_cbnst.class);
                //  startActivity(intent);
                break;
            case R.id.second_sem:
                Toast.makeText(this, "Notes Available Soon", Toast.LENGTH_SHORT).show();
                //intent=new Intent(third_semester.this, sub_se.class);
                //startActivity(intent);
                break;
            case R.id.third_sem:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1eFaZ0yO81u5pvyIIYl_9XqmsrlNVEjFD"));
                startActivity(intent);
                break;
            case R.id.fourth_sem:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/uc?export=download&id=1-Oo2jdkbscl8_JnJZG9bpn20JI9g_NSM"));
                startActivity(intent);
                break;
            case R.id.ques_paper:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/uc?export=download&id=1gD5P9cSSVJw3GyRD4w_X4JEPMyTBenod"));
                startActivity(intent);
                break;
            default:

        }
    }
}