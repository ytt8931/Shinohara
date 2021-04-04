package com.example.sinohara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class or extends AppCompatActivity {

    private ImageButton or_home;
    private ImageButton or_search;
    private ImageButton or_post;
    private ImageButton or_or;
    private ImageButton or_library;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.or);


        or_home=(ImageButton)findViewById(R.id.home);
        or_search=(ImageButton)findViewById(R.id.library);
        or_post=(ImageButton)findViewById(R.id.or);
        or_or=(ImageButton)findViewById(R.id.post);
        or_library=(ImageButton)findViewById(R.id.search);

        or_home.setOnClickListener(this::onClick);
        or_search.setOnClickListener(this::onClick);
        or_post.setOnClickListener(this::onClick);
        or_or.setOnClickListener(this::onClick);
        or_library.setOnClickListener(this::onClick);

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
