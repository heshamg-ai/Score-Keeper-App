package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA =0;
    public void plus3A(View view){
        scoreA=scoreA+3;
        displayA(scoreA);
    }

    public void plus2A(View view){
        scoreA=scoreA+2;
        displayA(scoreA);
    }

    public void freeA(View view){
        scoreA=scoreA+1;
        displayA(scoreA);
    }
    int scoreB=0;
    public void plus3B(View view){
        scoreB=scoreB+3;
        displayB(scoreB);
    }

    public void plus2B(View view){
        scoreB=scoreB+2;
        displayB(scoreB);
    }

    public void freeB(View view){
        scoreB=scoreB+1;
        displayB(scoreB);
    }

    public void Reset(View view){
        displayA(0);
        displayB(0);
        scoreA=0;
        scoreB=0;
    }

    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.zeroA);
        quantityTextView.setText("" + number);
    }

    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.zeroB);
        quantityTextView.setText("" + number);
    }









}
