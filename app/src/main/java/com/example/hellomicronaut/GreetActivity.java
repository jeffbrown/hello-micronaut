package com.example.hellomicronaut;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class GreetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet);
    }

    public void greetButtonClicked(View view) {
        EditText nameText = findViewById(R.id.nameText);
        TextView greetingView = findViewById(R.id.greetingView);

        String name = nameText.getText().toString();

        greetingView.setText("Hello " + name);
    }
}
