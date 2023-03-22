package com.example.parcial1pablopacheco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText n1, n2;
    Button btnsumar, btnrestar, btnmultipliclar, btndividir;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.et1);
        n2 = (EditText) findViewById(R.id.et2);
        resultado = (TextView) findViewById(R.id.resultado);
        btnsumar =(Button) findViewById(R.id.btn1);
        btnsumar.setOnClickListener(this);
        btnrestar = (Button) findViewById(R.id.btn2);
        btnrestar.setOnClickListener(this);
        btnmultipliclar = (Button) findViewById(R.id.btn3);
        btnmultipliclar.setOnClickListener(this);
        btndividir = (Button) findViewById(R.id.btn4);
        btndividir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int valor1 = Integer.parseInt(n1.getText().toString());
        int valor2 = Integer.parseInt(n2.getText().toString());
        int RESULTADO = 0;


        switch  (v.getId()){
            case R.id.btn1:
                RESULTADO=valor1+valor2;
                break;
            case R.id.btn2:
                RESULTADO = valor1-valor2;
                break;
            case R.id.btn3:
                RESULTADO = valor1 * valor2;
                break;

            case R.id.btn4:
                RESULTADO = valor1 / valor2;
                break;

        }
        resultado.setText(""+RESULTADO);


    }

    }
