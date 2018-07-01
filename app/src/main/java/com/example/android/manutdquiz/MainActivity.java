package com.example.android.manutdquiz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

     EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         username =  findViewById(R.id.user_name);


    }

    /**
     * this method is called when the start button is clicked
     */
    public void startButton(View view) {

        Intent i = new Intent(MainActivity.this, QuestionsActivity.class);
        i.putExtra("name", username.getText().toString().trim());
        startActivity(i);


    }

    public void home(View view) {
    }

    public void answer(View view) {
    }
}



