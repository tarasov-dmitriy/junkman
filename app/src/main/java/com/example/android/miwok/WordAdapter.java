package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by admin on 7/31/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID list_item_miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.list_item_miwok_text_view);
        // Get the miwok translation object and set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID list_item_default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.list_item_default_text_view);
        // Get the english translation object and set this text on the name TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        return listItemView;
    }
}
