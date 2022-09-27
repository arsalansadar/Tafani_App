package com.arsenic.timeout.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.arsenic.timeout.R;

public class About extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        tv = (TextView) findViewById(R.id.tvAbout);
        tv.setText("Locally owned and operated, Time Out Sports Bar & Grill, Inc. was established in Manitowoc, WI in December of 2004. Time Out replaced the former Desert Jack's which was known as \"the place \nwith the airplane in the roof\".  ");
    }
}