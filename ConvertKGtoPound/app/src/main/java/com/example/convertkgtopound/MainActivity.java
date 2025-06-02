package com.example.convertkgtopound;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText kgInput;
    Button convertButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kgInput = findViewById(R.id.kgInput);
        convertButton = findViewById(R.id.convertButton);
        resultText = findViewById(R.id.resultText);

        convertButton.setOnClickListener(v -> {
            String input = kgInput.getText().toString();

            if (!input.isEmpty()) {
                double kg = Double.parseDouble(input);
                double pounds = kg * 2.205;
                resultText.setText("Weight in Pounds: " + pounds);
            } else {
                Toast.makeText(this, "Please enter a weight", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
