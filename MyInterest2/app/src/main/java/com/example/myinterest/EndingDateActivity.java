package com.example.myinterest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EndingDateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending_date);
    }
    public void pressEndingActivity(View view){
        EditText day=(EditText)findViewById(R.id.editText);
        EditText month=(EditText)findViewById(R.id.editText9);
        EditText year=(EditText)findViewById(R.id.yearEditText);
        String strDay=day.getText().toString();
        String strMonth=day.getText().toString();
        String strYear=day.getText().toString();
        Intent intent=new Intent(this,FindingActivity.class);
        intent.putExtra("endDay",strDay);
        intent.putExtra("endMonth",strMonth);
        intent.putExtra("endYear",strYear);
        startActivity(intent);
        finish();
    }
}
