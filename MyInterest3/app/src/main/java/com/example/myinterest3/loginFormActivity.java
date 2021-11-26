package com.example.myinterest3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class loginFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
    }

    public void skippingButton(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }

    public void creatingTheAccount(View view) {
        startActivity(new Intent(this,createAccountActivity.class));
    }

}
