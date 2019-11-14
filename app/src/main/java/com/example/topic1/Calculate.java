package com.example.topic1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculate extends AppCompatActivity {

    EditText etDisplay;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnPlus,
            btnMinus,btnMultiply,btnDot,btnModulus,btnEqualsTo,btnClear,btnDivide;

    float firstNum, secNum;

    boolean addition,substraction,multiplication,division,mod;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);



        btnClear = findViewById(R.id.btnClear);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        etDisplay = findViewById(R.id.etDisplay);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDot = findViewById(R.id.btnDot);
        btnModulus = findViewById(R.id.btnModulus);
        btnEqualsTo = findViewById(R.id.btnEqualsTo);
        btnDivide = findViewById(R.id.btnDivide);




        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + "3");
            }
        });

        btn4.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + "4");
            }
        }));

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + "9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etDisplay == null){
                    etDisplay.setText("");
                } else {
                    firstNum = Float.parseFloat(etDisplay.getText() + "");
                    addition = true;
                    etDisplay.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etDisplay == null){
                    etDisplay.setText("");
                } else {
                    firstNum = Float.parseFloat(etDisplay.getText() + "");
                    substraction = true;
                    etDisplay.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etDisplay == null){
                    etDisplay.setText("");
                } else {
                    firstNum = Float.parseFloat(etDisplay.getText() + "");
                    division = true;
                    etDisplay.setText(null);
                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etDisplay == null){
                    etDisplay.setText("");
                } else {
                    firstNum = Float.parseFloat(etDisplay.getText() + "");
                    multiplication = true;
                    etDisplay.setText(null);
                }
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etDisplay.setText(etDisplay.getText() + ".");
            }
        });

        btnModulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etDisplay == null){
                    etDisplay.setText("");
                } else {
                    firstNum = Float.parseFloat(etDisplay.getText() + "");
                    mod = true;
                    etDisplay.setText(null);

                }
            }
        });

        btnEqualsTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secNum = Float.parseFloat(etDisplay.getText() + "");

                if(addition == true){
                    etDisplay.setText(firstNum + secNum + "");
                    addition = false;
                }

                if(substraction == true){
                  etDisplay.setText(firstNum - secNum + "");
                    substraction = false;
                }

                if(multiplication == true){
                    etDisplay.setText(firstNum * secNum + "");
                    multiplication = false;
                }

                if(division == true){
                    etDisplay.setText(firstNum / secNum + "");
                }

                if(mod == true){
                    etDisplay.setText(firstNum % secNum + "");
                    mod = false;
                }
            }
        });

    }
}
