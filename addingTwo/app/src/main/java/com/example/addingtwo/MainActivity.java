package com.example.addingtwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addition(View view){
        EditText editText1=(EditText)findViewById(R.id.editText3);
        EditText editText2=(EditText)findViewById(R.id.editText4);
        int num1=Integer.parseInt(editText1.getText().toString());
        int num2=Integer.parseInt(editText2.getText().toString());
        int result=num1+num2;
        String strResult=String.valueOf(result);
        TextView textView=(TextView)findViewById(R.id.textView3);
        textView.setText(" Sum is : "+strResult);
    }
}
