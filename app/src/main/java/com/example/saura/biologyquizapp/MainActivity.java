package com.example.saura.biologyquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox checkBox;
    static String name;
    /**
     * This method is called when the app launches
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = findViewById(R.id.age_checker);
    }

    /**
     * This method displays the entered user name on the screen.
     */
    public String displayName() {
        EditText nameTextView = findViewById(R.id.enter_your_name);
        return name = nameTextView.getText().toString();
    }


    /**
     * This method creates a new Intent and changes the activity.
     */

    public void nextActivity(View v) {
        if (!displayName().equals("") && checkBox.isChecked()) {
            Toast.makeText(this, getString(R.string.welcome_tag) + displayName() + getString(R.string.check_scorer_lang),
                    Toast.LENGTH_LONG).show();
            Intent i = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(i);
            i.putExtra("n", name);
        } else if (displayName().equals("")) {
            Toast.makeText(this, getString(R.string.enter_the_name), Toast.LENGTH_SHORT).show();
        } else if (!checkBox.isChecked()) {
            Toast.makeText(this, getString(R.string.age_req), Toast.LENGTH_SHORT).show();
        }
    }
}
