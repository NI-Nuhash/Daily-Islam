package com.nuhash.dailyislam;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class QuotesOfQuran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes_of_quran);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}