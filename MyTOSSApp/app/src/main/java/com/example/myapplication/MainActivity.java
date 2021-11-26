package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findToss(View view) {
        TextView textViewToss =(TextView)findViewById(R.id.textViewtoss);
        final int min = 0;
        final int max = 1;
        final int random = new Random().nextInt((max - min) + 1) + min;
        //textViewToss.setText("Got TAILS!!"+String.valueOf(random));
        if(random==0){
            textViewToss.setText("Got TAILS!!");
        }
        else {
            if(random==1){
               textViewToss.setText("Got HEADS!!");
            }
        }

    }
}
