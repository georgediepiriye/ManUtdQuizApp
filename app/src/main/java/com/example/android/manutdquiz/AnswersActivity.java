package com.example.android.manutdquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AnswersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers);
    }

    /**
     * this method is called when the home button is clicked
     */
    public void homeButton(View view) {
        Intent i = new Intent(AnswersActivity.this, MainActivity.class);
        startActivity(i);
        finish();
    }
}
