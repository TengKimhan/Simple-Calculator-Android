package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText showText;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClear = findViewById(R.id.btnClear);
        Button btnNegPos = findViewById(R.id.btnNegPos);
        Button btnBack = findViewById(R.id.btnBack);
        Button btnDivide = findViewById(R.id.btnDivide);
        Button btnSeven = findViewById(R.id.btnSeven);
        Button btnEight = findViewById(R.id.btnEight);
        Button btnNine = findViewById(R.id.btnNine);
        Button btnMultiple = findViewById(R.id.btnMultiple);
        Button btnFour = findViewById(R.id.btnFour);
        Button btnFive = findViewById(R.id.btnFive);
        Button btnSix = findViewById(R.id.btnSix);
        Button btnSubstract = findViewById(R.id.btnSubstract);
        Button btnOne = findViewById(R.id.btnOne);
        Button btnTwo = findViewById(R.id.btnTwo);
        Button btnThree = findViewById(R.id.btnThree);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnZero = findViewById(R.id.btnZero);
        Button btnComma = findViewById(R.id.btnComma);
        Button btnEqual = findViewById(R.id.btnEqual);

        btnClear.setOnClickListener(this);
        btnNegPos.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnMultiple.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSubstract.setOnClickListener(this);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnComma.setOnClickListener(this);
        btnEqual.setOnClickListener(this);

        showText = findViewById(R.id.etInputNumber);


    }

    @Override
    public void onClick(View view) {
        Button btn = ((Button) view);

        text += btn.getText().toString();

        showText.setText(text);

    }
}