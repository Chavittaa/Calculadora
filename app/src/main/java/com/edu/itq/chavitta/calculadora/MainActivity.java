package com.edu.itq.chavitta.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    boolean band = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);
        Button btn3 = (Button)findViewById(R.id.btn3);
        Button btn4 = (Button)findViewById(R.id.btn4);
        Button btn5 = (Button)findViewById(R.id.btn5);
        Button btn6 = (Button)findViewById(R.id.btn6);
        Button btn7 = (Button)findViewById(R.id.btn7);
        Button btn8 = (Button)findViewById(R.id.btn8);
        Button btn9 = (Button)findViewById(R.id.btn9);
        Button btn0 = (Button)findViewById(R.id.btn0);
        Button btnDiv = (Button)findViewById(R.id.btnDiv);
        Button btnIgual = (Button)findViewById(R.id.btnIgual);
        Button btnMas= (Button)findViewById(R.id.btnMas);
        Button btnMenos= (Button)findViewById(R.id.btnMenos);
        Button btnPor= (Button)findViewById(R.id.btnPor);
        Button btnPunto= (Button)findViewById(R.id.btnPto);
        Button btnLimpia= (Button)findViewById(R.id.btnClear);

        final EditText display = (EditText)findViewById(R.id.display);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                if(disp.equals("0")){
                    display.setText("0");
                }else {
                    display.setText(disp + "0");
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                if(disp.equals("0")){
                    display.setText("0");
                }else {
                    display.setText(disp + "0");
                }
            }
        });

        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                if(band) {
                    display.setText(disp + ".");
                    band = false;
                }else{
                    display.setText(disp);
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                if(disp.equals("0"))
                {
                    display.setText("0");
                }else {
                    display.setText("(" + disp + ")/");
                }
            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"-");
            }
        });
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"+");
            }
        });
        btnPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();

                if(disp.equals("0"))
                {
                    display.setText("0");
                }else{
                display.setText("("+disp+")");
            }}
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText("0");
            }
        });
        btnLimpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("0");
            }
        });


    }
}
