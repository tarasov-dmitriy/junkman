package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        // creating new array of words
        ArrayList<Word> words = new ArrayList<>();

        words.add(new Word("red", "wetetti"));
        words.add(new Word("green", "chokokki"));
        words.add(new Word("brown", "takaakki"));
        words.add(new Word("gray", "topoppi"));
        words.add(new Word("black", "kululli"));
        words.add(new Word("white", "kelelli"));
        words.add(new Word("dusty yellow", "topiisә"));
        words.add(new Word("mustard yellow", "chiwiitә"));

        WordAdapter itemsAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.colorsList);

        listView.setAdapter(itemsAdapter);
    }
}
