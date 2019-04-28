package com.example.udacity.gradle.builditbigger.paid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.udacity.gradle.builditbigger.EndPointsAsyncTask;
import com.udacity.gradle.builditbigger.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tellJoke(View view) {
        //Toast.makeText(this, "derp", Toast.LENGTH_SHORT).show();
        new EndPointsAsyncTask(this).execute();

    }
}

