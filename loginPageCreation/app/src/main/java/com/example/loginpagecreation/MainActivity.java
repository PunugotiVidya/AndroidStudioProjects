package com.example.loginpagecreation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    TextView attempts,signup;
    Button login;
    int count=5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email=(EditText)findViewById(R.id.etEmail);
        password=(EditText)findViewById(R.id.etPassword);
        attempts=(TextView)findViewById(R.id.etAttempts);
        login=(Button)findViewById(R.id.Button);
        signup=(TextView)findViewById(R.id.txtSignupNew);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(email.getText().toString(),password.getText().toString());
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,signupActivity.class));
            }
        });
    }
    private void validate(String username,String pswd){
        if(username.equals("admin")&&pswd.equals("1234")){
            startActivity(new Intent(MainActivity.this,secondActivity.class));
        }
        else {
            count--;
            attempts.setText("no of attempts: "+String.valueOf(count));
            if(count==0){
                login.setEnabled(false);
            }

        }
    }
}
