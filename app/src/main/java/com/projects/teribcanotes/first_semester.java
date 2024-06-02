package com.projects.teribcanotes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

public class first_semester extends MenuActivity implements View.OnClickListener{
    Button first, second, third, fourth, fifth, assign1, assign2, assign3;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_semester);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("BCA 1ST SEMESTER");

        first=findViewById(R.id.first_sem);
        second=findViewById(R.id.second_sem);
        third=findViewById(R.id.third_sem);
        fourth=findViewById(R.id.fourth_sem);
        fifth=findViewById(R.id.ques_paper);
        assign1=findViewById(R.id.assign1);
        assign2=findViewById(R.id.assign2);
        assign3=findViewById(R.id.assign3);

        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);
        fourth.setOnClickListener(this);
        fifth.setOnClickListener(this);
        assign1.setOnClickListener(this);
        assign2.setOnClickListener(this);
        assign3.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.first_sem:
                intent=new Intent( Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1ckl9nVISFR-3TdnltHRaIginXPxS5iY_"));
                  startActivity(intent);
                break;
            case R.id.second_sem:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/uc?export=download&id=1InTyex-bLZ4ssP0LR1IGA0U2JA3txDtK"));
                startActivity(intent);
                break;
            case R.id.third_sem:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/uc?export=download&id=1cc9Zu0qQ2AV58m9A9xMW95St7r9NFyyb"));
                startActivity(intent);
                break;
            case R.id.fourth_sem:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/uc?export=download&id=1cj3cCxah77z6Hrw6TPqDUmdwfZ2iJcEU"));
                startActivity(intent);
                break;
            case R.id.assign1:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/uc?export=download&id=1eJVwMbDDDyvWwxZrR8cJH-mVTbpKOixT"));
                startActivity(intent);
                break;
            case R.id.assign2:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/uc?export=download&id=1eGFQIF6APqpKDCaq6zHRviF9Br6SNbi6"));
                startActivity(intent);
                break;
            case R.id.assign3:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/uc?export=download&id=1wtIJivXSEWCIt9dCIwUCR5XSa8hLiBfH"));
                startActivity(intent);
                break;
            case R.id.ques_paper:
                intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/uc?export=download&id=1yRExRqC3RvQ_HuXeFN40JpKgr4f7RPs1"));
                startActivity(intent);
            default:

        }
    }
}