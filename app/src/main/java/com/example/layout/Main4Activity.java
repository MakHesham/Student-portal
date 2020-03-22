package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {
Button y1,y2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        y1=findViewById(R.id.y1ID);
        y2=findViewById(R.id.y2ID);

        y1.setOnClickListener(this);
        y2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(getApplicationContext(),Main5Activity.class);
        startActivity(intent);

    }
}
