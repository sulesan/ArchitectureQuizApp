package com.example.android.architecturequizapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

// This is a quiz app for architecture. There are five questions.

public class MainActivity extends AppCompatActivity {

    int point = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Shows results when the 'SHOW RESULTS!' button is clicked.
     */


    public void showResults(View view) {
        answerForQ1();
        answerForQ2();
        answerForQ3();
        answerForQ4();
        answerForQ5();


        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        // The message alternatives that should appear with result.

        if (point >= 4) {
            String message = "Congratulations " + name + "! You scored " + point + "/5";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        } else {
            String message = name + "! You scored " + point + "/5. Try again!";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }

    }

    /**
     * This method unchecks all the radio buttons, clears EditText and resets the score.
     */

    public void resetQuiz(View v) {
        RadioGroup q1RadioGroup = (RadioGroup) findViewById(R.id.question1_radio_group);
        q1RadioGroup.clearCheck();

        RadioGroup q2RadioGroup = (RadioGroup) findViewById(R.id.question2_radio_group);
        q2RadioGroup.clearCheck();

        RadioGroup q3RadioGroup = (RadioGroup) findViewById(R.id.question3_radio_group);
        q3RadioGroup.clearCheck();

        RadioGroup q4RadioGroup = (RadioGroup) findViewById(R.id.question4_radio_group);
        q4RadioGroup.clearCheck();

        RadioGroup q5RadioGroup = (RadioGroup) findViewById(R.id.question5_radio_group);
        q5RadioGroup.clearCheck();

        EditText nameField = (EditText) findViewById(R.id.name_field);
        nameField.setText("");

        point = 0;


    }

    /**
     * This method is called when the 'SHOW RESULTS!' button is clicked. It checks the right answer for Question 1.
     */

    public void answerForQ1() {

        //The right button for first question selection.

        RadioButton q1A3RadioButton = (RadioButton) findViewById(R.id.q1_a3_radio_button);
        boolean isQ1A3 = q1A3RadioButton.isChecked();


        if (isQ1A3) {
            point += 1;

        }

    }

    /**
     * This method is called when the 'SHOW RESULTS!' button is clicked. It checks the right answer for Question 2.
     */

    public void answerForQ2() {

        //The right button for second question selection.

        RadioButton q2A1RadioButton = (RadioButton) findViewById(R.id.q2_a1_radio_button);
        boolean isQ2A1 = q2A1RadioButton.isChecked();


        if (isQ2A1) {
            point += 1;

        }

    }

    /**
     * This method is called when the 'SHOW RESULTS!' button is clicked. It checks the right answer for Question 3.
     */

    public void answerForQ3() {

        //The right button for third question selection.

        RadioButton q3A4RadioButton = (RadioButton) findViewById(R.id.q3_a4_radio_button);
        boolean isQ3A4 = q3A4RadioButton.isChecked();


        if (isQ3A4) {
            point += 1;

        }

    }

    /**
     * This method is called when the 'SHOW RESULTS!' button is clicked. It checks the right answer for Question 4.
     */

    public void answerForQ4() {

        //The right button for forth question selection.

        RadioButton q4A1RadioButton = (RadioButton) findViewById(R.id.q4_a1_radio_button);
        boolean isQ4A1 = q4A1RadioButton.isChecked();


        if (isQ4A1) {
            point += 1;

        }

    }

    /**
     * This method is called when the 'SHOW RESULTS!' button is clicked. It checks the right answer for Question 5.
     */

    public void answerForQ5() {

        //The right button for fifth question selection.

        RadioButton q5A4RadioButton = (RadioButton) findViewById(R.id.q5_a4_radio_button);
        boolean isQ5A4 = q5A4RadioButton.isChecked();


        if (isQ5A4) {
            point += 1;

        }

    }


}
