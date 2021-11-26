package com.example.loginpagedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {
    EditText email,passwd,confirmpasswd,username;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        userRegister();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
            }
        });
    }
    public void userRegister(){
        email=(EditText)findViewById(R.id.editEmail);
        passwd=(EditText)findViewById(R.id.editpassword);
        confirmpasswd=(EditText)findViewById(R.id.editconfirmpassword);
        username=(EditText)findViewById(R.id.edituserName);
        register=(Button)findViewById(R.id.button);
    }
}
