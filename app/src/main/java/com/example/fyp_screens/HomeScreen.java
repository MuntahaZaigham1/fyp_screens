package com.example.fyp_screens;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
//import com.example.fyp_screens.global;
public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Button off,cat,tar;
        off=findViewById(R.id.button);
        cat=findViewById(R.id.button1);
        tar=findViewById(R.id.button2);

        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tweet;

                tweet=findViewById(R.id.editText);
                final String text;
                text=tweet.getText().toString();
                Intent i = new Intent(getApplicationContext(), result1.class);
                global.bid=1;
                i.putExtra("tweet",text);
                startActivity(i);
            }
        });
        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tweet;

                tweet=findViewById(R.id.editText);
                final String text;
                text=tweet.getText().toString();
                Intent i = new Intent(getApplicationContext(), result1.class);
                global.bid=2;
                i.putExtra("tweet",text);
                startActivity(i);
            }
        });
        tar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tweet;

                tweet=findViewById(R.id.editText);
                final String text;
                text=tweet.getText().toString();
                Intent i = new Intent(getApplicationContext(), result1.class);
                global.bid=3;
                i.putExtra("tweet",text);
                startActivity(i);
            }
        });
    }
}
