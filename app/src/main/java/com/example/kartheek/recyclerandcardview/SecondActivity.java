package com.example.kartheek.recyclerandcardview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ImageView imageView=(ImageView)findViewById(R.id.myImage);
        Intent intent=getIntent();
        imageView.setImageResource(intent.getIntExtra("image",0));
    }
}
