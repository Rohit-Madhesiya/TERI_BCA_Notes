package com.projects.teribcanotes;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sub_cbnst extends MenuActivity implements View.OnClickListener {
    Button firstbtn,secondbtn,thirdbtn,fourthbtn,fifthbtn,sixthbtn;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_cbnst);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("CBNST-301");

    firstbtn=findViewById(R.id.first_sem);
    secondbtn=findViewById(R.id.second_sem);
    thirdbtn=findViewById(R.id.third_sem);
    fourthbtn=findViewById(R.id.fourth_sem);
    fifthbtn=findViewById(R.id.book_head);
    sixthbtn=findViewById(R.id.assingment);

        firstbtn.setOnClickListener(this);
        secondbtn.setOnClickListener(this);
        thirdbtn.setOnClickListener(this);
        fourthbtn.setOnClickListener(this);
        fifthbtn.setOnClickListener(this);
        sixthbtn.setOnClickListener(this);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(@NonNull View view) {
        Intent in;
        switch(view.getId()){
            case R.id.first_sem:
                in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1qTS-980UiSQojIGEQzqIRg2XfDHb_0YU"));
                startActivity(in);
                break;
            case R.id.second_sem:
                in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1hsHt2s_MPFPXA67weLD2UlwC_h2TZv2x"));
                startActivity(in);
                break;
            case R.id.third_sem:
                in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1VbBfa83Oi3s08WgiYpZOpaMThZ1p0q-_"));
                startActivity(in);
                break;
            case R.id.fourth_sem:
                in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1SCwfZXwXYMq0gZemR7TpW0sTgChXWRbl"));
                startActivity(in);
                break;
            case R.id.book_head:
                in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1sxylzvdT312y5N9WoErG98wNbNimJwfD"));
                startActivity(in);
                break;
            case R.id.assingment:
                in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1T-pw-RGHYFOAs5hSy-Ho-b2Icsj09ItS"));
                startActivity(in);

            default:

        }
    }
}