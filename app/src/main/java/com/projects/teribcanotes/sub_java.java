package com.projects.teribcanotes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

public class sub_java extends MenuActivity implements View.OnClickListener{
    Button firstbtn,secondbtn,thirdbtn,fourthbtn,fifthbtn;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_java);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("JAVA-304");

        firstbtn=findViewById(R.id.first_sem);
        secondbtn=findViewById(R.id.second_sem);
        thirdbtn=findViewById(R.id.third_sem);
        fourthbtn=findViewById(R.id.fourth_sem);
        fifthbtn=findViewById(R.id.book_head);

        firstbtn.setOnClickListener(this);
        secondbtn.setOnClickListener(this);
        thirdbtn.setOnClickListener(this);
        fourthbtn.setOnClickListener(this);
        fifthbtn.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent in;
        switch(view.getId()) {
            case R.id.first_sem:
                in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1Y-opjszht7c9-B4xelsgWh30910PQHEE"));
                startActivity(in);
                break;
            case R.id.second_sem:
                in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1Akrg5zDX3xN_V4H5Yv2GyqzAexc_TJ88"));
                startActivity(in);
                break;
            case R.id.third_sem:
                in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1Zg5TX4QFpPhoYpn8AL3qCiqnP8_03aR0"));
                startActivity(in);
                break;
            case R.id.fourth_sem:
                in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1t-vOvfp2BECe3ezX9pMn9pe5wMWFvt0K"));
                startActivity(in);
                break;
            case R.id.book_head:
                in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1a-lOGxwf6vl0raW3knpqrjCb3DNAu7pC"));
                startActivity(in);
                break;
            default:
        }
    }
}