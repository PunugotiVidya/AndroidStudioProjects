package com.example.myinterest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finding);
    }

    public void findingSimpleInterest(View view) {
        Intent intent=getIntent();

        int amount=Integer.parseInt(intent.getStringExtra("amount"));
        int rate=Integer.parseInt(intent.getStringExtra("rate"));
        int year=Integer.parseInt(intent.getStringExtra("year"));

        int stDay=Integer.parseInt(intent.getStringExtra("day"));
        int stMonth=Integer.parseInt(intent.getStringExtra("month"));
        int stYear=Integer.parseInt(intent.getStringExtra("year"));

        int endDay=Integer.parseInt(intent.getStringExtra("endDay"));
        int endRate=Integer.parseInt(intent.getStringExtra("endRate"));
        int endYear=Integer.parseInt(intent.getStringExtra("endYear"));

        TextView result=(TextView)findViewById(R.id.textView100);
        result.setText("  the result is: ");
    }
}
