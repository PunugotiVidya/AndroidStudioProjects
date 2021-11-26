package com.example.sampleactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findingSimpleInterest(View view) {
        TextView result=(TextView)findViewById(R.id.textView);
        result.setText("  the result is: ");
    }
}
