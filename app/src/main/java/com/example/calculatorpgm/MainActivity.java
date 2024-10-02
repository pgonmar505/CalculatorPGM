package com.example.calculatorpgm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private String currentNumber = "";
    private String operator = "";
    private int firstValue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar el TextView para mostrar resultados
        tvResult = findViewById(R.id.tvResult);

        // Inicializar los botones numéricos y de operaciones
        initializeButtons();
    }

    private void initializeButtons() {
        // Botón de "0"
        findViewById(R.id.btn0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber += "0";
                tvResult.setText(currentNumber);
            }
        });

        // Botón de "1"
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber += "1";
                tvResult.setText(currentNumber);
            }
        });

        // Botón de "2"
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber += "2";
                tvResult.setText(currentNumber);
            }
        });

        // Botón de "3"
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber += "3";
                tvResult.setText(currentNumber);
            }
        });

        // Botón de "4"
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber += "4";
                tvResult.setText(currentNumber);
            }
        });

        // Botón de "5"
        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber += "5";
                tvResult.setText(currentNumber);
            }
        });

        // Botón de "6"
        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber += "6";
                tvResult.setText(currentNumber);
            }
        });

        // Botón de "7"
        findViewById(R.id.btn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber += "7";
                tvResult.setText(currentNumber);
            }
        });

        // Botón de "8"
        findViewById(R.id.btn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber += "8";
                tvResult.setText(currentNumber);
            }
        });

        // Botón de "9"
        findViewById(R.id.btn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber += "9";
                tvResult.setText(currentNumber);
            }
        });

        // Botones de operaciones
        findViewById(R.id.btnPlus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.parseInt(currentNumber);
                operator = "+";
                currentNumber = "";
            }
        });

        findViewById(R.id.btnMinus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.parseInt(currentNumber);
                operator = "-";
                currentNumber = "";
            }
        });

        findViewById(R.id.btnMultiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.parseInt(currentNumber);
                operator = "*";
                currentNumber = "";
            }
        });

        findViewById(R.id.btnDivide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstValue = Integer.parseInt(currentNumber);
                operator = "/";
                currentNumber = "";
            }
        });

        // Botón de igual
        findViewById(R.id.btnEquals).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int secondValue = Integer.parseInt(currentNumber);
                int result = 0;

                switch (operator) {
                    case "+":
                        result = firstValue + secondValue;
                        break;
                    case "-":
                        result = firstValue - secondValue;
                        break;
                    case "*":
                        result = firstValue * secondValue;
                        break;
                    case "/":
                        if (secondValue == 0) {
                            tvResult.setText("Error"); // Si se divide entre 0
                            return;
                        }
                        result = firstValue / secondValue;
                        break;
                }

                tvResult.setText(String.valueOf(result));
                currentNumber = String.valueOf(result);
            }
        });


        // Botón de borrar (C)
        findViewById(R.id.btnC).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNumber = "";
                firstValue = 0;
                operator = "";
                tvResult.setText("0");
            }
        });
    }
}
