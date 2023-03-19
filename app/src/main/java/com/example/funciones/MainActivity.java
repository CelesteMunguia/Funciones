package com.example.funciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText val1, val2;

    Button suma, resta, multipli, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        val1=(EditText)findViewById(R.id.valor1);
        val2=(EditText)findViewById(R.id.valor2);
        suma=(Button)findViewById(R.id.suma);
        resta=(Button)findViewById(R.id.resta);
        multipli=(Button)findViewById(R.id.multi);
        division=(Button)findViewById(R.id.division);

        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma();
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resta();
            }
        });
        multipli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multipli();
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division();
            }
        });

    }
    private void suma(){
        double x, y;
        double r;
        x=Float.parseFloat(val1.getText().toString());
        y=Float.parseFloat(val2.getText().toString());
        r=x+y;
        Toast.makeText(getApplicationContext(), "El resultado es:"+r, Toast.LENGTH_LONG).show();
    }
    private void resta(){
        double x, y;
        double r;
        x=Float.parseFloat(val1.getText().toString());
        y=Float.parseFloat(val2.getText().toString());
        r=x-y;
        Toast.makeText(getApplicationContext(), "El resultado es:"+r, Toast.LENGTH_LONG).show();
    }
    private void multipli(){
        double x, y;
        double r;
        x=Float.parseFloat(val1.getText().toString());
        y=Float.parseFloat(val2.getText().toString());
        r=x*y;
        Toast.makeText(getApplicationContext(), "El resultado es:"+r, Toast.LENGTH_LONG).show();
    }
    private void division(){
        double x, y;
        double r;
        x=Float.parseFloat(val1.getText().toString());
        y=Float.parseFloat(val2.getText().toString());
        r=x/y;
        Toast.makeText(getApplicationContext(), "El resultado es:"+r, Toast.LENGTH_LONG).show();
    }

}