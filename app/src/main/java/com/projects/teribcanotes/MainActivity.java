package com.projects.teribcanotes;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends MenuActivity implements View.OnClickListener {
    Button firstbtn, secondbtn, thirdbtn, fourthbtn, fifthbtn, sixthbtn, bookbtn;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        firstbtn=findViewById(R.id.first_sem);
    secondbtn=findViewById(R.id.second_sem);
    thirdbtn=findViewById(R.id.third_sem);
    fourthbtn=findViewById(R.id.fourth_sem);
    bookbtn=findViewById(R.id.book);
    fifthbtn=findViewById(R.id.fifth_sem);
    sixthbtn=findViewById(R.id.sixth_sem);

        firstbtn.setOnClickListener(this);
        secondbtn.setOnClickListener(this);
        thirdbtn.setOnClickListener(this);
        fourthbtn.setOnClickListener(this);
        bookbtn.setOnClickListener(this);
        fifthbtn.setOnClickListener(this);
        sixthbtn.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(@NonNull View view) {
            Intent in;
        switch(view.getId()){
            case R.id.first_sem:
                in=new Intent(MainActivity.this, first_semester.class);
                startActivity(in);
                    break;
            case R.id.second_sem:
                in=new Intent(MainActivity.this, second_semester.class);
                startActivity(in);
                    break;
            case R.id.third_sem:
                in=new Intent(MainActivity.this, third_semester.class);
                startActivity(in);
                break;
            case R.id.fourth_sem:
                in=new Intent(MainActivity.this, fourth_semester.class);
                startActivity(in);
                break;
            case R.id.fifth_sem:
                in=new Intent(MainActivity.this, fourth_semester.class);
                startActivity(in);
                break;
            case R.id.sixth_sem:
                in=new Intent(MainActivity.this, fourth_semester.class);
                startActivity(in);
                break;
            case R.id.book:
                in=new Intent(MainActivity.this, books.class);
                startActivity(in);
                break;
            default:
        }
    }
}