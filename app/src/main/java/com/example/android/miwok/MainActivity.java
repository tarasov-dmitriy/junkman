package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the view that shows numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);

        // Set a click listener on numbers view
        numbers.setOnClickListener(new View.OnClickListener() {
            // Code to execute when numbers view is clicked on
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find the view that shows family category
        TextView family = (TextView) findViewById(R.id.family);

        // Set a click listenet on family view
        family.setOnClickListener(new View.OnClickListener() {
            // Code to execute when family view is clicked on
            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyMembersActivity.class);
                startActivity(familyIntent);
            }
        });

        // Find the view that shows colors activity
        TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on colors view
        colors.setOnClickListener(new View.OnClickListener() {
            // Code to execute when colors is clicked on
            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        // Find the view that shows phrases activity
        TextView phrases = (TextView) findViewById(R.id.phrases);

        // Set a click listener on phrases view
        phrases.setOnClickListener(new View.OnClickListener() {
            // Code to execute when phrases view is clicked on
            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });


    }

}
