package com.example.guessgame2024;

import static com.example.guessgame2024.SecondFlag.compare;
import static com.example.guessgame2024.SecondFlag.generateRandom;
import static com.example.guessgame2024.SecondFlag.giveSecondFlag;
import static com.example.guessgame2024.ThirdFlag.giveThirdFlag;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumber;
    private Button submitButton;
    private Button submitButton2;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNumber = findViewById(R.id.inputGuess);
        submitButton = findViewById(R.id.submitButton);
        submitButton2 = findViewById(R.id.submitButton2);
        resultTextView = findViewById(R.id.resultTextView);
        generateRandom();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkNumber(inputNumber.getText().toString());
                inputNumber.setText("");
                inputNumber.requestFocus();
            }
        });

        submitButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = giveThirdFlag(getApplicationContext());
                if(str.equals("False")){
                    Toast.makeText(getApplicationContext(), "Wrong phone number", Toast.LENGTH_LONG).show();
                }
                Log.d("Third Flag:", "CTF{" + str + "}");
            }
        });
    }

    public void checkNumber(String number){
        SecondFlag.checkNumber(number);
    }
}
