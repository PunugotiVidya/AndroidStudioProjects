package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private EditText num1,num2;
  private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText)findViewById(R.id.edittext1);
        num2 = (EditText)findViewById(R.id.edittext2);
        result = (TextView)findViewById(R.id.textview);

    }

    public void addition(View view) {
        int number1=Integer.parseInt(num1.getText().toString());
        int number2=Integer.parseInt(num2.getText().toString());
        result.setText("The Answer is: "+String.valueOf((number1+number2)));
    }

    public void substract(View view) {
        int number1=Integer.parseInt(num1.getText().toString());
        int number2=Integer.parseInt(num2.getText().toString());
        result.setText("The Answer is: "+String.valueOf((number1-number2)));
    }

    public void multiplication(View view) {
        int number1=Integer.parseInt(num1.getText().toString());
        int number2=Integer.parseInt(num2.getText().toString());
        result.setText("The Answer is: "+String.valueOf((number1*number2)));
    }

    public void division(View view) {
        int number1=Integer.parseInt(num1.getText().toString());
        int number2=Integer.parseInt(num2.getText().toString());
        result.setText("The Answer is: "+String.valueOf((number1/number2)));
    }
}
