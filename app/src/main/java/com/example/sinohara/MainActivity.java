package com.example.sinohara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton home_home;
    private ImageButton home_search;
    private ImageButton home_post;
    private ImageButton home_or;
    private ImageButton home_library;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home_home=(ImageButton)findViewById(R.id.home);
        home_library=(ImageButton)findViewById(R.id.library);
        home_or=(ImageButton)findViewById(R.id.or);
        home_post=(ImageButton)findViewById(R.id.post);
        home_search=(ImageButton)findViewById(R.id.search);

        home_home.setOnClickListener(this::onClick);
        home_search.setOnClickListener(this::onClick);
        home_post.setOnClickListener(this::onClick);
        home_or.setOnClickListener(this::onClick);
        home_library.setOnClickListener(this::onClick);

    }

    public void onClick(View v){

        switch(v.getId()){
            case R.id.home:
                Intent intent1 = new Intent(this, MainActivity.class);  //インテントの作成
                startActivity(intent1);                                 //画面遷移
                break;

            case R.id.search:
                Intent intent2 = new Intent(this, search.class);  //インテントの作成
                startActivity(intent2);                                 //画面遷移
                break;

            case R.id.post:
                Intent intent3 = new Intent(this, post.class);  //インテントの作成
                startActivity(intent3);                                 //画面遷移
                break;

            case R.id.or:
                Intent intent4 = new Intent(this, or.class);  //インテントの作成
                startActivity(intent4);                                 //画面遷移
                break;

            case R.id.library:
                Intent intent5 = new Intent(this, library.class);  //インテントの作成
                startActivity(intent5);                                 //画面遷移

                break;
        }
    }






}