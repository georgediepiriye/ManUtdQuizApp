package com.example.android.manutdquiz;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {

    int score = 0;
    String name;
    Intent i;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);

        name = getIntent().getStringExtra("name");
        submit = findViewById(R.id.submit);

        /** Displays a toast that welcomes the user */
        Context context = getApplicationContext();
        CharSequence text = "Welcome " + name;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        /**this method is activated when the submit button is clicked*/
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //locates specific radio buttons
                RadioButton radioButton1b = (RadioButton) findViewById(R.id.radio_button1b);
                RadioButton radioButton2b = (RadioButton) findViewById(R.id.radio_button2b);
                RadioButton radioButton3d = (RadioButton) findViewById(R.id.radio_button3d);
                RadioButton radioButton4c = (RadioButton) findViewById(R.id.radio_button4c);


                // adds various scores to the score if the above radio buttons are selected
                if (radioButton1b.isChecked()) {
                    score = score + 5;
                }
                if (radioButton2b.isChecked()) {
                    score = score + 5;
                }
                if (radioButton3d.isChecked()) {
                    score = score + 5;
                }
                if (radioButton4c.isChecked()) {
                    score = score + 5;
                }


                //locates specific checkboxes checkboxes
                CheckBox checkBox5a = (CheckBox) findViewById(R.id.checkbox5a);
                CheckBox checkBox5b = (CheckBox) findViewById(R.id.checkbox5b);
                CheckBox checkBox5c = (CheckBox) findViewById(R.id.checkbox5c);
                CheckBox checkbox5d = (CheckBox) findViewById(R.id.checkbox5d);

// adds various scores to the score if the above checkboxes are selected
                if (checkBox5a.isChecked() && checkBox5c.isChecked()) {
                    score = score + 10;
                } else if (checkBox5a.isChecked() && !checkBox5c.isChecked()) {
                    score = score + 5;
                } else if (!checkBox5a.isChecked() && checkBox5c.isChecked()) {
                    score = score + 5;
                }

                //Gets the name of stadium imputed by user and adds one to the score if correct with mine
                EditText stadiumName = (EditText) findViewById(R.id.stadium_name);
                String userEntry = stadiumName.getText().toString();
                if (userEntry.equals("Old Trafford")) {
                    score = score + 5;
                }


// Displays a toast message containing the score to the screen
                Context context = getApplicationContext();
                CharSequence text = "The Score is " + score;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                i = new Intent(QuestionsActivity.this, ScoreActivity.class);
                i.putExtra("name", name);
                i.putExtra("score", score);
                startActivity(i);
                finish();
            }

        });
    }

}



