package com.projects.teribcanotes;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;


public class books extends MenuActivity implements View.OnClickListener{
    protected AppCompatImageButton firstbtn, secondbtn, thirdbtn, fourthbtn, fifthbtn, sixthbtn, seventhbtn, eightbtn, ninthbtn, tenthbtn,
    elevenbtn,twelvebtn,thirteenbtn,fourteenbtn,fifteenbtn,sixteenbtn,seventeenbtn,eighteenbtn,ninteenbtn,tweentybtn,twentyonebtn,tweentytwobtn,tweentythreebtn,
    tweentyfourtbtn;
    @SuppressLint({"WrongViewCast", "UseCompatLoadingForDrawables"})
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_books);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("COURSE BOOKS");

        firstbtn=findViewById(R.id.letusc);
        secondbtn=findViewById(R.id.pwc);
        thirdbtn=findViewById(R.id.upic);
        fourthbtn=findViewById(R.id.csa);
        fifthbtn=findViewById(R.id.fcoa);
        sixthbtn=findViewById(R.id.cpp);
        seventhbtn=findViewById(R.id.dsa);
        eightbtn=findViewById(R.id.dfsuc);
        ninthbtn=findViewById(R.id.gta);
        tenthbtn=findViewById(R.id.sad);
        elevenbtn=findViewById(R.id.cbnst1);
        twelvebtn=findViewById(R.id.anafe);
        thirteenbtn=findViewById(R.id.aiase);
        fourteenbtn=findViewById(R.id.foseb);
        fifteenbtn=findViewById(R.id.seapab);
        sixteenbtn=findViewById(R.id.oscb);
        seventeenbtn=findViewById(R.id.mosb);
        eighteenbtn=findViewById(R.id.oomdb);
        ninteenbtn=findViewById(R.id.jtcr);
        tweentybtn=findViewById(R.id.aitdsb);
        twentyonebtn=findViewById(R.id.focmhsb);
        tweentytwobtn=findViewById(R.id.fodsb);
        tweentythreebtn=findViewById(R.id.oraib);
        tweentyfourtbtn=findViewById(R.id.itab);

        firstbtn.setOnClickListener(this);
        secondbtn.setOnClickListener(this);
        thirdbtn.setOnClickListener(this);
        fourthbtn.setOnClickListener(this);
        fifthbtn.setOnClickListener(this);
        sixthbtn.setOnClickListener(this);
        seventhbtn.setOnClickListener(this);
        eightbtn.setOnClickListener(this);
        ninthbtn.setOnClickListener(this);
        tenthbtn.setOnClickListener(this);
        elevenbtn.setOnClickListener(this);
        twelvebtn.setOnClickListener(this);
        thirteenbtn.setOnClickListener(this);
        fourteenbtn.setOnClickListener(this);
        fifteenbtn.setOnClickListener(this);
        sixteenbtn.setOnClickListener(this);
        seventeenbtn.setOnClickListener(this);
        eighteenbtn.setOnClickListener(this);
        ninteenbtn.setOnClickListener(this);
        tweentybtn.setOnClickListener(this);
        twentyonebtn.setOnClickListener(this);
        tweentytwobtn.setOnClickListener(this);
        tweentythreebtn.setOnClickListener(this);
        tweentyfourtbtn.setOnClickListener(this);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick( View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.letusc:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://mega.nz/file/aUkBkY5K#RaXhAO-RxTEuuKYNmJIw4vsOykvZkNMJ2eB-qDVBlxA"));
                startActivity(intent);
                break;
            case R.id.pwc:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://mega.nz/file/fck3wQ7Y#7Wq4c3Wf2KcuwgtDbAnBONnxKfYFqT6CdUABw3TOIws"));
                startActivity(intent);
                break;
            case R.id.upic:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1z26TzsMsqfVCUbu5_L9VPy1tVriAGHhj"));
                startActivity(intent);
                break;
            case R.id.csa:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1dH_vWha2egFQ0zuZbLt04WiVJ9ESZiUH"));
                startActivity(intent);
                break;
            case R.id.fcoa:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1MZCg8y4Q3un59OG5AnMxWfkqWNjBlYlE"));
                startActivity(intent);
                break;
            case R.id.cpp:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://mega.nz/file/uZt1CCID#sFeeIugkAnWpdbQIGm7tg-WHRBMs4PzUJqh0KKXD6YI"));
                startActivity(intent);
                break;
            case R.id.dsa:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1BUSAGj13AdIg1K6d6vyAOr6Um-gVo8Vc"));
                startActivity(intent);
                break;
            case R.id.dfsuc:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://mega.nz/file/PMdRCIYS#_LcjC_pM2BnsT1hEkAPMVEpw0itUuIyl7hVjyuh5Cco"));
                startActivity(intent);
                break;
            case R.id.gta:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://mega.nz/file/6QdxWQzJ#qoYJp_VqSIH4iLfWrwofEbJbmoL8guqX4pmWnayRTfo"));
                startActivity(intent);
                break;
            case R.id.sad:
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1uR2SnQCwJn9C97mPocRkXKDMP7M4z9Jb"));
                startActivity(intent);
                break;
            case R.id.cbnst1 :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1INvL7HnivlwATWC0Nm5LI9tRA5dCiRqt"));
                startActivity(intent);
                break;
            case R.id.anafe :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1Vd7vWeNWF4n7AR6V83VzDFRC36s3Ie0l"));
                startActivity(intent);
                break;
            case R.id.aiase :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1llRl88E4kY3nDCBgDY5wTwKtirHc_jee"));
                startActivity(intent);
                break;
            case R.id.foseb :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1UmkDiDBItWrEsW7QxGoB5OXO2p3Xl6OH"));
                startActivity(intent);
                break;
            case R.id.seapab :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1kJU-cp80Sql3Y7c_gvxGPkTVjGjWV_N9"));
                startActivity(intent);
                break;
            case R.id.oscb :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1R4f4u55MXVoaHFo-Uwy2dxGZfQTyEHMh"));
                startActivity(intent);
                break;
            case R.id.mosb :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1GPnXTAPKLegtwGmPcSG4lymqjYBJvTWX"));
                startActivity(intent);
                break;
            case R.id.oomdb :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=15Qjuagg3Lv6IDPUcbBVt7zsRB13E-FBv"));
                startActivity(intent);
                break;
            case R.id.jtcr :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1yeQP4oO-TLL83ZbnNB6KV0uEChvQ7aJE"));
                startActivity(intent);
                break;
            case R.id.aitdsb :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1C9g3d73r1kfDagRtm5oG3bu0LCyJcsfp"));
                startActivity(intent);
                break;
            case R.id.focmhsb :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1O913tkNLcscFXxPQWvKffdEgy0oNTuma"));
                startActivity(intent);
                break;
            case R.id.fodsb :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://mega.nz/file/rYtXUaLZ#dfAg8ixRqX1_g2G9CrMf4z4v6-QLgw5u6eGj77Y7kQI"));
                startActivity(intent);
                break;
            case R.id.oraib :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1VSKZp_f5VK-kj0SdO6gedncmvXSVTxHW"));
                startActivity(intent);
                break;
            case R.id.itab :
                intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/uc?export=download&id=1zRvNlxo-L2iiHeRMGpxz3ufa3R8zJgTn"));
                startActivity(intent);
                break;
            default:
        }
    }
}