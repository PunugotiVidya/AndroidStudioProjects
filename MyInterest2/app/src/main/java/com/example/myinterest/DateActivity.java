package com.example.myinterest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
    }
    public void pressFinalActivity(View view) {
        EditText day=(EditText)findViewById(R.id.editText23);
        EditText month=(EditText)findViewById(R.id.editText15);
        EditText year=(EditText)findViewById(R.id.EditText20);
        String strDay=day.getText().toString();
        String strMonth=day.getText().toString();
        String strYear=day.getText().toString();
        Intent intent=new Intent(this,FindingActivity.class);
        intent.putExtra("day",strDay);
        intent.putExtra("month",strMonth);
        intent.putExtra("year",strYear);
        startActivity(new Intent(this,EndingDateActivity.class));
        finish();
    }


}
