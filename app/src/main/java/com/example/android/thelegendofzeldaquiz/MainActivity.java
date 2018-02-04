package com.example.android.thelegendofzeldaquiz;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void endQuest(View view) {


        CheckBox zeldaCheckBox = (CheckBox) findViewById(R.id.answer2_question1);
        boolean zeldaCheckBoxChecked = zeldaCheckBox.isChecked();


        CheckBox linkCheckBox = (CheckBox) findViewById(R.id.answer3_question1);
        boolean linkCheckBoxChecked = linkCheckBox.isChecked();

        if (zeldaCheckBoxChecked) {

            score += 10;

        } else if (linkCheckBoxChecked) {

            score += 10;
        }

        displayScore(score);

        EditText editCharacterName = (EditText) findViewById(R.id.charactername);
        String characterName = editCharacterName.getText().toString();

        if (score == 100) {

            for (int i = 0; i < 2; i++)

            {
                Toast toast = Toast.makeText(this, "Congratulations " + characterName + ", you pass the trial of the sages! Now the treasure of Nayru is yours!", Toast.LENGTH_LONG);
                toast.show();
            }
        } else if (score >= 70) {

            for (int i = 0; i < 2; i++)

            {
                Toast toast = Toast.makeText(this, "The sages still have a trial for you " + characterName + ", but you can have part of the treasure! Take the quest again.", Toast.LENGTH_LONG);
                toast.show();
            }
        }

        if (score < 70) {

            for (int i = 0; i < 2; i++)

            {
                Toast toast = Toast.makeText(this, characterName + " You fail the trial of the sages! Take the quest again.", Toast.LENGTH_LONG);
                toast.show();
            }
        }

    }

    public void takeAgainTheQuest(View view) {


        CheckBox zeldacheckbox = (CheckBox) findViewById(R.id.answer2_question1);

        CheckBox linkcheckbox = (CheckBox) findViewById(R.id.answer3_question1);

        RadioGroup radiogroup2 = (RadioGroup) findViewById(R.id.group_question2);

        RadioGroup radiogroup3 = (RadioGroup) findViewById(R.id.group_question3);

        RadioGroup radiogroup4 = (RadioGroup) findViewById(R.id.group_question4);

        RadioGroup radiogroup5 = (RadioGroup) findViewById(R.id.group_question5);

        RadioGroup radiogroup6 = (RadioGroup) findViewById(R.id.group_question6);

        RadioGroup radiogroup7 = (RadioGroup) findViewById(R.id.group_question7);

        RadioGroup radiogroup8 = (RadioGroup) findViewById(R.id.group_question8);

        RadioGroup radiogroup9 = (RadioGroup) findViewById(R.id.group_question9);

        RadioGroup radiogroup10 = (RadioGroup) findViewById(R.id.group_question10);


        zeldacheckbox.setChecked(false);

        linkcheckbox.setChecked(false);

        radiogroup2.clearCheck();

        radiogroup3.clearCheck();

        radiogroup4.clearCheck();

        radiogroup5.clearCheck();

        radiogroup6.clearCheck();

        radiogroup7.clearCheck();

        radiogroup8.clearCheck();

        radiogroup9.clearCheck();

        radiogroup10.clearCheck();

        score = 0;

        displayScore(score);

        ScrollView mainScrollView = (ScrollView) findViewById(R.id.questScrollView);

        mainScrollView.fullScroll(ScrollView.FOCUS_UP);

    }

    public void displayScore(int score) {
        TextView scoreTextView = (TextView) findViewById(R.id.scoredisplay);
        scoreTextView.setText("x" + score);
    }


    public void answerTwo(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.group_question2);

        RadioButton GoldenGoddesses = (RadioButton) findViewById(R.id.answer4_question2);

        int answer2 = radioGroup.getCheckedRadioButtonId();

        RadioButton selectAnswer2 = (RadioButton) findViewById(answer2);

        if (GoldenGoddesses.isChecked()) score += 10;
    }

    public void answerThree(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.group_question3);

        RadioButton ChuChu = (RadioButton) findViewById(R.id.answer1_question3);

        int answer3 = radioGroup.getCheckedRadioButtonId();

        RadioButton selectAnswer3 = (RadioButton) findViewById(answer3);

        if (ChuChu.isChecked()) score += 10;
    }

    public void answerFour(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.group_question4);

        RadioButton BunnyHood = (RadioButton) findViewById(R.id.answer1_question4);

        int answer4 = radioGroup.getCheckedRadioButtonId();

        RadioButton selectAnswer4 = (RadioButton) findViewById(answer4);

        if (BunnyHood.isChecked()) score += 10;
    }

    public void answerFive(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.group_question5);

        RadioButton Cuccos = (RadioButton) findViewById(R.id.answer4_question5);

        int answer5 = radioGroup.getCheckedRadioButtonId();

        RadioButton selectAnswer5 = (RadioButton) findViewById(answer5);

        if (Cuccos.isChecked()) score += 10;
    }

    public void answerSix(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.group_question6);

        RadioButton Goron = (RadioButton) findViewById(R.id.answer2_question6);

        int answer6 = radioGroup.getCheckedRadioButtonId();

        RadioButton selectAnswer6 = (RadioButton) findViewById(answer6);

        if (Goron.isChecked()) score += 10;
    }

    public void answerSeven(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.group_question7);

        RadioButton Beedle = (RadioButton) findViewById(R.id.answer3_question7);

        int answer7 = radioGroup.getCheckedRadioButtonId();

        RadioButton selectAnswer7 = (RadioButton) findViewById(answer7);

        if (Beedle.isChecked()) score += 10;
    }

    public void answerEight(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.group_question8);

        RadioButton HyruleWarriors = (RadioButton) findViewById(R.id.answer3_question8);

        int answer8 = radioGroup.getCheckedRadioButtonId();

        RadioButton selectAnswer8 = (RadioButton) findViewById(answer8);

        if (HyruleWarriors.isChecked()) score += 10;
    }

    public void answerNine(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.group_question9);

        RadioButton Year = (RadioButton) findViewById(R.id.answer1_question9);

        int answer9 = radioGroup.getCheckedRadioButtonId();

        RadioButton selectAnswer9 = (RadioButton) findViewById(answer9);

        if (Year.isChecked()) score += 10;
    }

    public void answerTen(View view) {

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.group_question10);

        RadioButton Hestu = (RadioButton) findViewById(R.id.answer2_question10);

        int answer10 = radioGroup.getCheckedRadioButtonId();

        RadioButton selectAnswer10 = (RadioButton) findViewById(answer10);

        if (Hestu.isChecked()) score += 10;
    }

}
