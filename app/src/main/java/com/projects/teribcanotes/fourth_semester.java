package com.projects.teribcanotes;

import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class fourth_semester extends MenuActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_semester);
        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.bca_4th_semester);

        Toast.makeText(this, "Work in Progress", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {

    }
}