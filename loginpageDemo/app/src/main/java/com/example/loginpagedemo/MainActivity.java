package com.example.loginpagedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText email,passwd;
    Button login;
    TextView register,skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userRegistration();
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,RegistrationActivity.class));
            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,interestActivity.class));
            }
        });

    }
    public void userRegistration(){
        email=(EditText)findViewById(R.id.editEmail);
        passwd=(EditText)findViewById(R.id.editpassword);
        login=(Button)findViewById(R.id.button);
        register=(TextView)findViewById(R.id.txtregister);
        skip = (TextView)findViewById(R.id.txtskip);
    }

}
