package com.example.myinterest;


import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void pressDateActivity(View view){
        EditText amount=(EditText)findViewById(R.id.amtText);
        EditText rate=(EditText)findViewById(R.id.editText3);
        EditText noYears=(EditText)findViewById(R.id.editText4);
        String strAmount=amount.getText().toString();
        String strRate=rate.getText().toString();
        String strNoYears=noYears.getText().toString();
        Intent intent=new Intent(this,FindingActivity.class);
        intent.putExtra("amount",strAmount);
        intent.putExtra("rate",strRate);
        intent.putExtra("noYears",strNoYears);
        startActivity(new Intent(this,DateActivity.class));
        finish();
    }



}
