package com.example.kartheek.recyclerandcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList personNames=new ArrayList<>(Arrays.asList("aliabut","anjali","anupama","anushka","kajal","keerthi","nandita","nazriya","nivedha","rasikanna","shalini","shrutihasan","soundarya","tamanna"));
        ArrayList personImages=new ArrayList<>(Arrays.asList(R.drawable.aliabut,R.drawable.anjali,R.drawable.anupama,R.drawable.anushka,R.drawable.kajal,R.drawable.keerthi,R.drawable.nandita,R.drawable.nazriya,R.drawable.nivedha,R.drawable.rasikanna,R.drawable.shalini,R.drawable.shrutihasan,R.drawable.soundarya,R.drawable.tamanna));
        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CustomAdapter customAdapter=new CustomAdapter(MainActivity.this,personNames,personImages);
        recyclerView.setAdapter(customAdapter);
    }
}
