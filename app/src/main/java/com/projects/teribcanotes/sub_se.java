package com.projects.teribcanotes;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sub_se extends MenuActivity implements View.OnClickListener {
    Button firstbtn,secondbtn,thirdbtn,fourthbtn,fifthbtn;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_se);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("SE-302");


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
    public void onClick(@NonNull View view) {
        Intent in;
        switch(view.getId()){
            case R.id.first_sem:
                Toast.makeText(this, "Notes Available Soon", Toast.LENGTH_SHORT).show();
             //   in=new Intent(sub_se.this, sub_se.class);
               // startActivity(in);
                break;
            case R.id.second_sem:
                Toast.makeText(this, "Notes Available Soon", Toast.LENGTH_SHORT).show();
               // in=new Intent(sub_se.this, sub_se.class);
               // startActivity(in);
                break;
            case R.id.third_sem:
                Toast.makeText(this, "Notes Available Soon", Toast.LENGTH_SHORT).show();
                //in=new Intent(sub_se.this, sub_se.class);
                //startActivity(in);
                break;
            case R.id.fourth_sem:
                Toast.makeText(this, "Notes Available Soon", Toast.LENGTH_SHORT).show();
                //in=new Intent(sub_se.this, sub_se.class);
                //startActivity(in);
                break;
            case R.id.book_head:
                Toast.makeText(this, "Notes Available Soon", Toast.LENGTH_SHORT).show();
                //in=new Intent(sub_se.this, sub_se.class);
                //startActivity(in);
                break;

            default:

        }
    }
}