package com.example.jokerandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokerMainActivity extends AppCompatActivity {
    TextView jokerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joker_activity_main);
        jokerTextView = findViewById(R.id.joke_textview);
        if (getIntent() != null) {
            if (getIntent().hasExtra("EXTRA_JOKE")) {
                String getJoke = getIntent().getStringExtra("EXTRA_JOKE");
                jokerTextView.setText(getJoke);
            }
            else
            {
                jokerTextView.setText("ERROR");
            }
        }


    }
}
