package com.example.simplecalculator;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, num3;
    Button calcBtn;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        calcBtn = findViewById(R.id.calcBtn);
        result = findViewById(R.id.result);

        calcBtn.setOnClickListener(v -> {
            int a = Integer.parseInt(num1.getText().toString());
            int b = Integer.parseInt(num2.getText().toString());
            int c = Integer.parseInt(num3.getText().toString());

            int avg = (a + b + c) / 3;

            result.setText("Average: " + avg);
        });
    }
}
