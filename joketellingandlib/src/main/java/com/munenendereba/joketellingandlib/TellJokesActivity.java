package com.munenendereba.joketellingandlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class TellJokesActivity extends AppCompatActivity {

    TextView textView;

    public static final String JOKES_INTENT_EXTRA = "jokeFromJavaLibViaApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_jokes);

        textView = findViewById(R.id.textViewJokes);

        tellJoke();
    }

    private void tellJoke() {
        Intent intent = getIntent();
        String theJoke = intent.getStringExtra(JOKES_INTENT_EXTRA);

        textView.setText(theJoke);
        Toast.makeText(this, theJoke, Toast.LENGTH_LONG).show();
    }
}
