package com.nuhash.dailyislam;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JakatCalculator extends AppCompatActivity {

    private EditText goldAmount,silverAmount,goldPrice,silverPrice,cash,debt;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jakat_calculator);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        goldAmount=findViewById(R.id.GoldAmount);
        silverAmount=findViewById(R.id.SilverAmount);
        goldPrice=findViewById(R.id.GoldPrice);
        silverPrice=findViewById(R.id.SilverPrice);
        cash=findViewById(R.id.Cash);
        debt=findViewById(R.id.Cost);
        button=findViewById(R.id.TotalZakat);
        result=findViewById(R.id.ResultShow);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String goldA=goldAmount.getText().toString();
                String silverA=silverAmount.getText().toString();
                String goldP=goldPrice.getText().toString();
                String silverP=silverPrice.getText().toString();
                String cTaka=cash.getText().toString();
                String dTaka=debt.getText().toString();

                double gAmount=Double.parseDouble(goldA);
                double sAmount=Double.parseDouble(silverA);
                double gPrice=Double.parseDouble(goldP);
                double sPrice=Double.parseDouble(silverP);
                double tCash=Double.parseDouble(cTaka);
                double tDebt=Double.parseDouble(dTaka);

                double zakat=((gAmount*gPrice)+(sAmount*sPrice)+tCash-tDebt)*0.025;
                result.setText("Total Amount of Zakat : \n\n"+"        "+zakat+" Taka");
            }
        });

    }


}