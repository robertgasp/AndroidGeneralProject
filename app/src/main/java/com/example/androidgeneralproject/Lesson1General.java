package com.example.androidgeneralproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Lesson1General extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.lesson1general);

        Button btnToEx1 = findViewById(R.id.btnEx1);
        Button btnToEx2 = findViewById(R.id.btnEx2);


        btnToEx1.setOnClickListener(this);
        btnToEx2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnEx1:
                intent = new Intent(this, Lesson1Ex1.class);
                startActivity(intent);
                break;
            case R.id.btnEx2:
                intent = new Intent(this, Lesson1Ex2.class);
                startActivity(intent);
                break;
        }


    }
}
