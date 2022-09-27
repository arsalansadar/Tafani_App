package com.arsenic.timeout.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.arsenic.timeout.R;

public class SplashScreen extends AppCompatActivity {
    ImageView logo;
    TextView textView, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);

        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
       // getSupportActionBar().hide();

        logo = findViewById(R.id.logo);
        textView = findViewById(R.id.about);
        next = findViewById(R.id.next);

        String str = "Voted \"Best Sports Bar\" of Manitowoc County. " +
                "Watch your favorite team on one of our many new high-definition TVs. " +
                "Our large island bar can easily seat 40 people and is perfect for that after work get together. " +
                "Thirsty? Our friendly bartenders are pouring 24 different tap beers!"+
                " Fun for all ages. Our updated game room features a brand-new dart board," +
                " two pool tables, foosball, shuffleboard, basketball, golden tee," +
                " big buck hunter pro and much more!";


        textView.setText(str);


        next.setText("Get's Starting");

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intent);

            }
        });

    }
}