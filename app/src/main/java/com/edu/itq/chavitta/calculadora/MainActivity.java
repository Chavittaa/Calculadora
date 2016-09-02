package com.edu.itq.chavitta.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                char[] operacionDisp = disp.toString().toCharArray();

                boolean hayPunto=false;
                for (int i=0; i<operacionDisp.length;i++){
                    if(operacionDisp[i]=='.'){
                        hayPunto=true;
                    }
                }

                if(operacionDisp.length <=13){
                    if(operacionDisp[0]=='0'&&!hayPunto){
                        display.setText("1");
                    }else {
                        display.setText(disp + "1");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Limite de numeros", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                char[] operacionDisp = disp.toString().toCharArray();

                boolean hayPunto=false;
                for (int i=0; i<operacionDisp.length;i++){
                    if(operacionDisp[i]=='.'){
                        hayPunto=true;
                    }
                }

                if(operacionDisp.length <=13){
                    if(operacionDisp[0]=='0'&&!hayPunto){
                        display.setText("2");
                    }else {
                        display.setText(disp + "2");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Limite de numeros", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                char[] operacionDisp = disp.toString().toCharArray();

                boolean hayPunto=false;
                for (int i=0; i<operacionDisp.length;i++){
                    if(operacionDisp[i]=='.'){
                        hayPunto=true;
                    }
                }

                if(operacionDisp.length <=13){
                    if(operacionDisp[0]=='0'&&!hayPunto){
                        display.setText("3");
                    }else {
                        display.setText(disp + "3");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Limite de numeros", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                char[] operacionDisp = disp.toString().toCharArray();

                boolean hayPunto=false;
                for (int i=0; i<operacionDisp.length;i++){
                    if(operacionDisp[i]=='.'){
                        hayPunto=true;
                    }
                }

                if(operacionDisp.length <=13){
                    if(operacionDisp[0]=='0'&&!hayPunto){
                        display.setText("4");
                    }else {
                        display.setText(disp + "4");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Limite de numeros", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                char[] operacionDisp = disp.toString().toCharArray();

                boolean hayPunto=false;
                for (int i=0; i<operacionDisp.length;i++){
                    if(operacionDisp[i]=='.'){
                        hayPunto=true;
                    }
                }

                if(operacionDisp.length <=13){
                    if(operacionDisp[0]=='0'&&!hayPunto){
                        display.setText("5");
                    }else {
                        display.setText(disp + "5");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Limite de numeros", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                char[] operacionDisp = disp.toString().toCharArray();

                boolean hayPunto=false;
                for (int i=0; i<operacionDisp.length;i++){
                    if(operacionDisp[i]=='.'){
                        hayPunto=true;
                    }
                }

                if(operacionDisp.length <=13){
                    if(operacionDisp[0]=='0'&&!hayPunto){
                     display.setText("6");
                    }else {
                        display.setText(disp + "6");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Limite de numeros", Toast.LENGTH_SHORT).show();
                }


            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                char[] operacionDisp = disp.toString().toCharArray();

                boolean hayPunto=false;
                for (int i=0; i<operacionDisp.length;i++){
                    if(operacionDisp[i]=='.'){
                        hayPunto=true;
                    }
                }

                if(operacionDisp.length <=13){
                    if(operacionDisp[0]=='0'&&!hayPunto){
                        display.setText("7");
                    }else {
                        display.setText(disp + "7");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Limite de numeros", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                char[] operacionDisp = disp.toString().toCharArray();

                boolean hayPunto=false;
                for (int i=0; i<operacionDisp.length;i++){
                    if(operacionDisp[i]=='.'){
                        hayPunto=true;
                    }
                }

                if(operacionDisp.length <=13){
                    if(operacionDisp[0]=='0'&&!hayPunto){
                        display.setText("8");
                    }else {
                        display.setText(disp + "8");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Limite de numeros", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                char[] operacionDisp = disp.toString().toCharArray();

                boolean hayPunto=false;
                for (int i=0; i<operacionDisp.length;i++){
                    if(operacionDisp[i]=='.'){
                        hayPunto=true;
                    }
                }

                //if(operacionDisp.length <=13){
                    if(operacionDisp[0]=='0'&&!hayPunto){
                        display.setText("9");
                    }else {
                        display.setText(disp + "9");
                    }
                //}else{
                 //   Toast.makeText(MainActivity.this, "Limite de numeros", Toast.LENGTH_SHORT).show();
                //}

            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                char[] operacionDisp = disp.toString().toCharArray();

                boolean hayPunto=false;
                for (int i=0; i<operacionDisp.length;i++){
                    if(operacionDisp[i]=='.'){
                        hayPunto=true;
                    }
                }

                if(operacionDisp.length <=13){
                    if(operacionDisp[0]=='0'&&!hayPunto){
                        display.setText("0");
                    }else {
                        display.setText(disp + "0");
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Limite de numeros", Toast.LENGTH_SHORT).show();
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
                    Toast toastPunto = Toast.makeText(getApplicationContext(), "Ya tienes un punto", Toast.LENGTH_SHORT);
                    toastPunto.show();
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
                    band=true;
                }
            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"-");
                band=true;
            }
        });
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText(disp+"+");
                band=true;
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
                    band=true;
            }}
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Editable disp = display.getText();
                display.setText("0");
                band = true;
            }
        });
        btnLimpia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                display.setText("0");
                band = true;
            }
        });


    }
}
