package com.nuhash.dailyislam;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FeatureList extends AppCompatActivity{

    private Button QuranicVerses,HadithQuotes,Dailyduas,DTasbih,ZakatCalculator,TelawatAndNasheed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feature_list);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

       QuranicVerses=findViewById(R.id.QuranicVerses);
       HadithQuotes=findViewById(R.id.HadithQuotes);
       Dailyduas=findViewById(R.id.DailyDuas);
       DTasbih=findViewById(R.id.DTasbih);
        ZakatCalculator=findViewById(R.id.ZakatCalculator);
       TelawatAndNasheed=findViewById(R.id.TelawatAndNasheed);


       QuranicVerses.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(FeatureList.this,QuotesOfQuran.class);
               startActivity(intent);
           }
       });

       HadithQuotes.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(FeatureList.this,QuotesFromHadith.class);
               startActivity(intent);
           }
       });

        Dailyduas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeatureList.this,DailyDua.class);
                startActivity(intent);
            }
        });

        DTasbih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeatureList.this,DTasbih.class);
                startActivity(intent);
            }
        });


        ZakatCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeatureList.this,JakatCalculator.class);
                startActivity(intent);
            }
        });

       TelawatAndNasheed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FeatureList.this,TelawatAndNasheed.class);
                startActivity(intent);
            }
        });



    }


}