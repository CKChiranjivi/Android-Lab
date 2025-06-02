package com.example.checkoddeven;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numberInput;
    Button checkButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        checkButton = findViewById(R.id.checkButton);
        resultText = findViewById(R.id.resultText);

        checkButton.setOnClickListener(v -> {
            String input = numberInput.getText().toString();

            if (!input.isEmpty()) {
                int number = Integer.parseInt(input);
                if (number % 2 == 0) {
                    resultText.setText("The number is Even");
                } else {
                    resultText.setText("The number is Odd");
                }
            } else {
                Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
