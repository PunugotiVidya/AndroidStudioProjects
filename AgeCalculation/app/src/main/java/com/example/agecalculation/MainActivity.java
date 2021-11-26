package com.example.agecalculation;

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

    public void findAge(View view) {


        EditText stDay = (EditText) findViewById(R.id.date);
        EditText stMonth = (EditText) findViewById(R.id.month);
        EditText stYear = (EditText) findViewById(R.id.year);

        EditText endDay = (EditText) findViewById(R.id.endday);
        EditText endMonth = (EditText) findViewById(R.id.endmonth);
        EditText endYear = (EditText) findViewById(R.id.endyear);

        TextView textresult = (TextView) findViewById(R.id.textresult);

        int StartDay=Integer.parseInt(stDay.getText().toString());
        int StartMonth=Integer.parseInt(stMonth.getText().toString());
        int StartYear=Integer.parseInt(stYear.getText().toString());

        int EndDay=Integer.parseInt(endDay.getText().toString());
        int EndMonth=Integer.parseInt(endMonth.getText().toString());
        int EndYear=Integer.parseInt(endYear.getText().toString());

        int i;
        int days=0;
        int months;
        int remdays;
        int Time,Years;
        float Timefloat;
       // double SimpleInterestApproximate,SimpleInterestActual;

        for(i=StartYear;i<=EndYear;i++)
        {
            if(StartYear==EndYear)
            {
                days+=(EndDay+(EndMonth-1)*30)-((StartMonth-1)*30+StartDay);
                break;
            }
            else if(i==EndYear)
                days+=EndDay+(EndMonth-1)*30;
            else if(i==StartYear)
                days+=360-((StartMonth-1)*30+StartDay);
            else
                days+=360;
        }
        Timefloat=(float)days/30;
        months=days/30;
        remdays=days-30*months;

        Years=months/12;
        Time=months;

        textresult.setText("The AGE is: "+String.valueOf(Years)+" years and "+String.valueOf((months-Years*12))+" months");
    }

}
