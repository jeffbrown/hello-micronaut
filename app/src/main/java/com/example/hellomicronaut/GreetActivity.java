package com.example.hellomicronaut;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.inject.Inject;

public class GreetActivity extends AppCompatActivity {

    @Inject
    GreetingClient greetingClient;

    private EditText nameText;
    private TextView greetingView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet);

        nameText = findViewById(R.id.nameText);
        greetingView = findViewById(R.id.greetingView);
    }

    public void greetButtonClicked(View view) {
        String name = nameText.getText().toString();

        String greeting = greetingClient.getGreeting(name);

        greetingView.setText(greeting);
    }
}
