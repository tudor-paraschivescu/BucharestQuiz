package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void endQuiz(View view) {

        RadioGroup radioGroup;
        int answer1;
        int answer2;
        int answer3;

        radioGroup = (RadioGroup) findViewById(R.id.question1);
        answer1 = radioGroup.getCheckedRadioButtonId();

        radioGroup = (RadioGroup) findViewById(R.id.question2);
        answer2 = radioGroup.getCheckedRadioButtonId();

        radioGroup = (RadioGroup) findViewById(R.id.question3);
        answer3 = radioGroup.getCheckedRadioButtonId();

        int score = 0;

        if (answer1 == R.id.answer1b) {
            score++;
        }

        if (answer2 == R.id.answer2a) {
            score++;
        }

        if (answer3 == R.id.answer3a) {
            score++;
        }

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.answer4a);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.answer4b);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.answer4c);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.answer4d);
        CheckBox checkBox5 = (CheckBox) findViewById(R.id.answer4e);

        if (checkBox1.isChecked() && !checkBox2.isChecked() && !checkBox3.isChecked() &&
                checkBox4.isChecked() && checkBox5.isChecked()) {
            score++;
        }

        String result = "You answered correctly " + score + " questions. Congrats!";
        Toast.makeText(getApplicationContext(), result, Toast.LENGTH_LONG).show();
    }

}
