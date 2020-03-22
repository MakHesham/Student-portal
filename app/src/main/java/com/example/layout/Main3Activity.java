package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {
Button res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        res=findViewById(R.id.ResultbuttonID);

        res.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(getApplicationContext(),Main4Activity.class);
        startActivity(intent);

    }
}
