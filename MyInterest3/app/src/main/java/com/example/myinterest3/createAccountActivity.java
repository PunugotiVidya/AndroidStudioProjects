package com.example.myinterest3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class createAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }
    public void creatingAccount(View view){
        Toast.makeText(createAccountActivity.this,"Clicked",Toast.LENGTH_SHORT).show();
    }
}
