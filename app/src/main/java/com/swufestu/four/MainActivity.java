package com.swufestu.four;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView ShowScore;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View btn) {

        if(btn.getId()==R.id.score3){
            score+=3;
        }else if(btn.getId() == R.id.score2){
            score+=2;
        }else{
            score++;
        }
        TextView ShowScore = findViewById(R.id.ShowScore);
        ShowScore.setText(String.valueOf(score));
        if(btn.getId()==R.id.reset){
            score=0;
            ShowScore.setText(String.valueOf(0));
        }
    }
}