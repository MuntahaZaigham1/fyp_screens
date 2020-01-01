package com.example.fyp_screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class result1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_result1);
        String tweet;
        Bundle extras = getIntent().getExtras();
        tweet = extras.getString("tweet");
        TextView tw=findViewById(R.id.editText);
        tw.setText(tweet);
        TextView result;
        result=findViewById(R.id.result);
        if(global.bid==1){
            result.setText("Offensive");
        }
        else if(global.bid==2){
            result.setText("Aggressive");
        }
        else if(global.bid==3){
            result.setText("Public");
        }

    }
}
