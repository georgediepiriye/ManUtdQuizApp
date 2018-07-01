package com.example.android.manutdquiz;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreActivity extends AppCompatActivity {

    TextView textName,scoreText;  // variables that holds the text view for the name and score

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
         scoreText=findViewById(R.id.score_text_view);
         textName = findViewById(R.id.name_text_view); //text view score should replace

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int extras = getIntent().getExtras().getInt("score");


        textName.setText(name);         //replaces the name with the textview
        scoreText.setText(extras + "");  // replaces the score with the textview




        //displays a the score toast message to the screen
        Context context = getApplicationContext();
        CharSequence text = "Your Score is " + extras ;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }

    /**this method is called when the home button is clicked*/
    public void home(View view) {
       Intent i = new Intent(ScoreActivity.this, MainActivity.class);
       startActivity(i);
        finish();


    }
    /**this method is called when the answer button is clicked*/
    public void answer(View view) {
        Intent i = new Intent(ScoreActivity.this, AnswersActivity.class);
        startActivity(i);
        finish();


    }





}
