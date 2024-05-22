package com.nuhash.dailyislam;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DTasbih extends AppCompatActivity implements View.OnClickListener {

    Button CountButton,RemoveButton,ResetButton;
    TextView DigitShow;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dtasbih);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        CountButton=(Button) findViewById(R.id.CountButton);
        RemoveButton=(Button) findViewById(R.id.RemoveButton);
        ResetButton=(Button) findViewById(R.id.ResetButton);
        DigitShow=(TextView) findViewById(R.id.DigitShow);

        CountButton.setOnClickListener(this);
        RemoveButton.setOnClickListener(this);
        ResetButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.CountButton){
            count++;
            DigitShow.setText(""+count);
        }
        else if(view.getId()==R.id.RemoveButton){
            count--;
            DigitShow.setText(""+count);
        }
        else if(view.getId()==R.id.ResetButton){
            count=0;
            DigitShow.setText(""+count);
        }

    }
}