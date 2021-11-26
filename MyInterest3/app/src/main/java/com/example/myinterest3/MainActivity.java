package com.example.myinterest3;

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

    public void findInterest(View view) {
        TextView textViewApproximateResult=(TextView)findViewById(R.id.textViewResult);
        TextView textViewDetails=(TextView)findViewById(R.id.textViewDetails);
        TextView textViewRemaingingDays=(TextView)findViewById(R.id.textViewRemaingingDays);
        TextView textViewAcutlaResult=(TextView) findViewById(R.id.textViewActualResult);

        EditText amount=(EditText)findViewById(R.id.editAmount);
        EditText rate=(EditText)findViewById(R.id.editRate);

        EditText stDay=(EditText)findViewById(R.id.editStartingDay);
        EditText stMonth=(EditText)findViewById(R.id.editStartingMonth);
        EditText stYear=(EditText)findViewById(R.id.editStartingYear);

        EditText endDay=(EditText)findViewById(R.id.editEndingDay);
        EditText endMonth=(EditText)findViewById(R.id.editEndingMonth);
        EditText endYear=(EditText)findViewById(R.id.editEndingYear);

        long Amount=Integer.parseInt(amount.getText().toString());
        float Rate=Float.parseFloat(rate.getText().toString());

        int StartDay=Integer.parseInt(stDay.getText().toString());
        int StartMonth=Integer.parseInt(stMonth.getText().toString());
        int StartYear=Integer.parseInt(stYear.getText().toString());

        int EndDay=Integer.parseInt(endDay.getText().toString());
        int EndMonth=Integer.parseInt(endMonth.getText().toString());
        int EndYear=Integer.parseInt(endYear.getText().toString());

        int i,days=0,months,remdays,Time;
        float Timefloat,Years;
        double SimpleInterestApproximate,SimpleInterestActual;

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

        SimpleInterestApproximate=(Amount*Rate*Time)/100;
        SimpleInterestActual=(Amount*Rate*Timefloat)/100;
        textViewApproximateResult.setText("  Approximate Interest is : "+String.valueOf(SimpleInterestApproximate));
        textViewAcutlaResult.setText(" Actual Interest is : "+String.valueOf(SimpleInterestActual));
        textViewDetails.setText(" Total Months is : "+String.valueOf(months));
        textViewRemaingingDays.setText(" Remainging Days is : "+String.valueOf(remdays));

    }
}
