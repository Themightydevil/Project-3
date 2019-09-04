package com.example.saura.biologyquizapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    private RadioGroup ques1, ques2, ques3, ques4, ques5, ques6, ques7, ques8, ques9, ques10;
    int scoreTracker = 0;
    int checkerAnswer1 = 0, checkerAnswer2 = 0, checkerAnswer3 = 0, checkerAnswer4 = 0, checkerAnswer5 = 0,
            checkerAnswer6 = 0, checkerAnswer7 = 0, checkerAnswer8 = 0, checkerAnswer9 = 0, checkerAnswer10 = 0;
    TextView textView;
    String scoreToText = "";

    /**
     * This method is called when this intent is launched
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ques1 = findViewById(R.id.ques_1);
        ques2 = findViewById(R.id.ques_2);
        ques3 = findViewById(R.id.ques_3);
        ques4 = findViewById(R.id.ques_4);
        ques5 = findViewById(R.id.ques_5);
        ques6 = findViewById(R.id.ques_6);
        ques7 = findViewById(R.id.ques_7);
        ques8 = findViewById(R.id.ques_8);
        ques9 = findViewById(R.id.ques_9);
        ques10 = findViewById(R.id.ques_10);
        textView = findViewById(R.id.score_calculator);
        displayScore(scoreTracker);
    }

    public void submitScore(View view) {
        if (ques1.getCheckedRadioButtonId() != -1) {
            int id = ques1.getCheckedRadioButtonId();
            View radioButton = ques1.findViewById(id);
            int radioId = ques1.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) ques1.getChildAt(radioId);
            String selection = (String) btn.getText();
            if (selection.equals(getString(R.string.answer_1_a)) && checkerAnswer1 < 1) {
                scoreTracker += 1;
                checkerAnswer1 += 1;
            }
        }
        if (ques2.getCheckedRadioButtonId() != -1) {
            int id = ques2.getCheckedRadioButtonId();
            View radioButton = ques2.findViewById(id);
            int radioId = ques2.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) ques2.getChildAt(radioId);
            String selection = (String) btn.getText();
            if (selection.equals(getString(R.string.answer_2_a)) && checkerAnswer2 < 1) {
                scoreTracker += 1;
                checkerAnswer2 += 1;
            }
        }
        if (ques3.getCheckedRadioButtonId() != -1) {
            int id = ques3.getCheckedRadioButtonId();
            View radioButton = ques3.findViewById(id);
            int radioId = ques3.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) ques3.getChildAt(radioId);
            String selection = (String) btn.getText();
            if (selection.equals(getString(R.string.answer_3_a)) && checkerAnswer3 < 1) {
                scoreTracker += 1;
                checkerAnswer3 += 1;
            }
        }
        if (ques4.getCheckedRadioButtonId() != -1) {
            int id = ques4.getCheckedRadioButtonId();
            View radioButton = ques4.findViewById(id);
            int radioId = ques4.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) ques4.getChildAt(radioId);
            String selection = (String) btn.getText();
            if (selection.equals(getString(R.string.answer_4_a)) && checkerAnswer4 < 1) {
                scoreTracker += 1;
                checkerAnswer4 += 1;
            }
        }
        if (ques5.getCheckedRadioButtonId() != -1) {
            int id = ques5.getCheckedRadioButtonId();
            View radioButton = ques5.findViewById(id);
            int radioId = ques5.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) ques5.getChildAt(radioId);
            String selection = (String) btn.getText();
            if (selection.equals(getString(R.string.answer_5_b)) && checkerAnswer5 < 1) {
                scoreTracker += 1;
                checkerAnswer5 += 1;
            }
        }

        if (ques6.getCheckedRadioButtonId() != -1) {
            int id = ques6.getCheckedRadioButtonId();
            View radioButton = ques6.findViewById(id);
            int radioId = ques6.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) ques6.getChildAt(radioId);
            String selection = (String) btn.getText();
            if (selection.equals(getString(R.string.answer_6_b)) && checkerAnswer6 < 1) {
                scoreTracker += 1;
                checkerAnswer6 += 1;
            }
        }

        if (ques7.getCheckedRadioButtonId() != -1) {
            int id = ques7.getCheckedRadioButtonId();
            View radioButton = ques7.findViewById(id);
            int radioId = ques7.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) ques7.getChildAt(radioId);
            String selection = (String) btn.getText();
            if (selection.equals(getString(R.string.answer_7_d)) && checkerAnswer7 < 1) {
                scoreTracker += 1;
                checkerAnswer7 += 1;
            }
        }

        if (ques8.getCheckedRadioButtonId() != -1) {
            int id = ques8.getCheckedRadioButtonId();
            View radioButton = ques8.findViewById(id);
            int radioId = ques8.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) ques8.getChildAt(radioId);
            String selection = (String) btn.getText();
            if (selection.equals(getString(R.string.answer_8_c)) && checkerAnswer8 < 1) {
                scoreTracker += 1;
                checkerAnswer8 += 1;
            }
        }

        if (ques9.getCheckedRadioButtonId() != -1) {
            int id = ques9.getCheckedRadioButtonId();
            View radioButton = ques9.findViewById(id);
            int radioId = ques9.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) ques9.getChildAt(radioId);
            String selection = (String) btn.getText();
            if (selection.equals(getString(R.string.answer_9_c)) && checkerAnswer9 < 1) {
                scoreTracker += 1;
                checkerAnswer9 += 1;
            }
        }

        if (ques10.getCheckedRadioButtonId() != -1) {
            int id = ques10.getCheckedRadioButtonId();
            View radioButton = ques10.findViewById(id);
            int radioId = ques10.indexOfChild(radioButton);
            RadioButton btn = (RadioButton) ques10.getChildAt(radioId);
            String selection = (String) btn.getText();
            if (selection.equals(getString(R.string.answer_10_d)) && checkerAnswer10 < 1) {
                scoreTracker += 1;
                checkerAnswer10 += 1;
            }
        }

        Toast.makeText(this, "Total Score: " + scoreTracker, Toast.LENGTH_SHORT).show();


        if (scoreTracker <= 4 && scoreTracker > 0) {
            scoreToText = getString(R.string.poor_scorer);
            displayScore(scoreTracker);
            textView.setTypeface(null, Typeface.BOLD);
            textView.setTextSize(24);
            textView.setTextColor(Color.RED);
        } else if (scoreTracker < 8 && scoreTracker > 4) {
            scoreToText = getString(R.string.avg_scorer);
            displayScore(scoreTracker);
            textView.setTypeface(null, Typeface.BOLD);
            textView.setTextSize(24);
            textView.setTextColor(Color.BLUE);

        } else if (scoreTracker <= 10 && scoreTracker >= 8) {
            scoreToText = getString(R.string.top_scorer);
            displayScore(scoreTracker);
            textView.setTypeface(null, Typeface.BOLD);
            textView.setTextSize(24);
            textView.setTextColor(Color.GREEN);
        } else if (scoreTracker == 0) {
            scoreToText = getString(R.string.answer_first);
            textView.setTextColor(Color.DKGRAY);
        }


    }


    public void emailIntent(View view) {
        if (!(scoreTracker == 0)) {
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:"));// only email apps should handle this
            intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.email_subject));
            intent.putExtra(Intent.EXTRA_TEXT, getString(R.string.i_scored) + (scoreTracker * 10) + getString(R.string.on_app) +
                    getString(R.string.dare) + MainActivity.name);
            if (intent.resolveActivity(getPackageManager()) != null) {

                startActivity(intent);

            }
        } else {
            Toast.makeText(this, getString(R.string.answer_questions), Toast.LENGTH_SHORT).show();
        }
    }


    private void displayScore(int score) {
        TextView quantityTextView = findViewById(R.id.score_calculator);
        quantityTextView.setText(scoreToText + score + getString(R.string.total_score));
    }
}








