package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Intent intent=getIntent();
        String dsp=intent.getStringExtra("extramessage");
        TextView view=findViewById(R.id.display_message);
        view.setText(dsp);
    }
    public void sendFinal(View view){
        startActivity(new Intent(this,finalActivity.class));

    }
}
