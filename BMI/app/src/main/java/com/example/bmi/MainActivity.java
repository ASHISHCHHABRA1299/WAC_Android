package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText heightv,weightv;
    TextView result;
    Button calculate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        heightv=(EditText)findViewById(R.id.height);
        weightv=(EditText)findViewById(R.id.weight);
        result=(TextView)findViewById(R.id.res);
        calculate=(Button)findViewById(R.id.calc);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String inputs
                String heightstr=heightv.getText().toString();
                String weightstr=weightv.getText().toString();
                if(heightstr!=null&&weightstr!=null&&!heightstr.equals("")&&!weightstr.equals("")){
                    //Type casting from string to float
                    Float ht=Float.parseFloat(heightstr);
                    Float wt=Float.parseFloat(weightstr);
                    Float bmi=wt/(ht*ht); // calculate the bmi
                    String category="";
                    if(bmi<18.5){
                        category="UNDER-WEIGHT";
                    }else if(bmi>=18.5&&bmi<=24.9){
                        category="NORMAL";
                    }else if(bmi>=25.0&&bmi<=29.9){
                        category="OVER-WEIGHT";
                    }else{
                        category="OBESE";
                    }
                    //adding the result to textview
                    result.setText("YOUR BMI IS:\n"+bmi +"\n "+category);
                }else{
                    Toast.makeText(MainActivity.this, "Please Enter the values", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}