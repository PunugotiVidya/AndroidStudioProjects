package com.example.loginpagecreation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signupActivity extends AppCompatActivity {
    EditText name,email,pswd;
    Button sinup;
    TextView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        setusetUI();
        sinup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){

                }
            }
        });

     login.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             startActivity(new Intent(signupActivity.this,MainActivity.class));
         }
     });
    }
    public void setusetUI(){
        name=(EditText)findViewById(R.id.etName);
        email=(EditText)findViewById(R.id.etSignupEmail);
        pswd=(EditText)findViewById(R.id.etSignupPswd);
        sinup=(Button)findViewById(R.id.Button);
        login=(TextView)findViewById(R.id.txtLogin);
    }
    public boolean validate(){
        boolean result=false;

        String userName=name.getText().toString();
        String userEmail=email.getText().toString();
        String userPswd=pswd.getText().toString();

        if(userName.isEmpty()||userEmail.isEmpty()||userPswd.isEmpty()){
            Toast.makeText(signupActivity.this,"Invalid Details",Toast.LENGTH_SHORT).show();
        }
        else {
            result=true;
        }
        return result;
    }
}
