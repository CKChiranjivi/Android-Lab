package com.example.fahrenheittocelsius;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText fahrenheitInput;
    Button convertButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fahrenheitInput = findViewById(R.id.fahrenheitInput);
        convertButton = findViewById(R.id.convertButton);
        resultText = findViewById(R.id.resultText);

        convertButton.setOnClickListener(v -> {
            String input = fahrenheitInput.getText().toString();

            if (!input.isEmpty()) {
                double fahrenheit = Double.parseDouble(input);
                double celsius = (fahrenheit - 32) * 5 / 9;
                resultText.setText("Celsius: " + String.format("%.2f", celsius) + " °C");
            } else {
                Toast.makeText(this, "Please enter a temperature", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
