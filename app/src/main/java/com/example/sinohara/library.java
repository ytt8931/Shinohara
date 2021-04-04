package com.example.sinohara;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class library extends AppCompatActivity {

    private ImageButton library_home;
    private ImageButton library_search;
    private ImageButton library_post;
    private ImageButton library_or;
    private ImageButton library_library;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.library);

        library_home=(ImageButton)findViewById(R.id.home);
        library_search=(ImageButton)findViewById(R.id.library);
        library_post=(ImageButton)findViewById(R.id.or);
        library_or=(ImageButton)findViewById(R.id.post);
        library_library=(ImageButton)findViewById(R.id.search);

        library_home.setOnClickListener(this::onClick);
        library_search.setOnClickListener(this::onClick);
        library_post.setOnClickListener(this::onClick);
        library_or.setOnClickListener(this::onClick);
        library_library.setOnClickListener(this::onClick);

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
