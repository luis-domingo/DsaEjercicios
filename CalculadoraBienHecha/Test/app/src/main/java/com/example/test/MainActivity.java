package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String linea;
    public String linea2;
    public int operacion;
    public double ans;
    public int aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operacion = 0;
        aux = 0;
        linea="";
        linea2="";
    }

    public void mostrar(){
        if(operacion==1){
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea+" + "+linea2);
        }else if (operacion == 2) {
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea+" - "+linea2);
        }else if (operacion == 3) {
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea+" * "+linea2);
        }else if (operacion == 4) {
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea+" / "+linea2);
        }
    }

    public void onCeroClicked(View v){
        if(aux==0) {
            linea = String.valueOf(linea) + String.valueOf(0);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea);
        } else{
            linea2 = String.valueOf(linea2) + String.valueOf(0);
            mostrar();
        }
    }

    public void onUnoClicked(View v){
        if(aux==0) {
            linea = String.valueOf(linea) + String.valueOf(1);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea);
        } else{
            linea2 = String.valueOf(linea2) + String.valueOf(1);
            mostrar();
        }
    }

    public void onDosClicked(View v){
        if(aux==0) {
            linea = String.valueOf(linea) + String.valueOf(2);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea);
        } else{
            linea2 = String.valueOf(linea2) + String.valueOf(2);
            mostrar();
        }
    }

    public void onTresClicked(View v){
        if(aux==0) {
            linea = String.valueOf(linea) + String.valueOf(3);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea);
        } else{
            linea2 = String.valueOf(linea2) + String.valueOf(3);
            mostrar();
        }
    }

    public void onCuatroClicked(View v){
        if(aux==0) {
            linea = String.valueOf(linea) + String.valueOf(4);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea);
        } else{
            linea2 = String.valueOf(linea2) + String.valueOf(4);
            mostrar();
        }
    }

    public void onCincoClicked(View v){
        if(aux==0) {
            linea = String.valueOf(linea) + String.valueOf(5);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea);
        } else{
            linea2 = String.valueOf(linea2) + String.valueOf(5);
            mostrar();
        }
    }

    public void onSeisClicked(View v){
        if(aux==0) {
            linea = String.valueOf(linea) + String.valueOf(6);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea);
        } else{
            linea2 = String.valueOf(linea2) + String.valueOf(6);
            mostrar();
        }
    }

    public void onSieteClicked(View v){
        if(aux==0) {
            linea = String.valueOf(linea) + String.valueOf(7);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea);
        } else{
            linea2 = String.valueOf(linea2) + String.valueOf(7);
            mostrar();
        }
    }

    public void onOchoClicked(View v){
        if(aux==0) {
            linea = String.valueOf(linea) + String.valueOf(8);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea);
        } else{
            linea2 = String.valueOf(linea2) + String.valueOf(8);
            mostrar();
        }
    }

    public void onNueveClicked(View v){
        if(aux==0) {
            linea = String.valueOf(linea) + String.valueOf(9);
            TextView textView = (TextView)findViewById(R.id.textView);
            textView.setText(linea);
        } else{
            linea2 = String.valueOf(linea2) + String.valueOf(9);
            mostrar();
        }
    }

    public void onSumaClicked(View v){
        operacion = 1;
        aux = 1;
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(linea+" + ");
    }

    public void onRestaClicked(View v){
        operacion = 2;
        aux = 1;
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(linea+" - ");
    }

    public void onMultiplicacionClicked(View v){
        operacion = 3;
        aux = 1;
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(linea+" * ");
    }

    public void onDivisionClicked(View v) {
        operacion = 4;
        aux = 1;
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(linea+" / ");
    }

    public void onIgualClicked(View v){
        double lineauno = Integer.parseInt(linea);
        double lineados = Integer.parseInt(linea2);
        if(operacion == 1){
            ans = lineauno + lineados;
        } else if(operacion == 2){
            ans = lineauno - lineados;
        } else if(operacion == 3){
            ans = lineauno * lineados;
        } else if(operacion == 4){
            ans = lineauno / lineados;
        }
        if(operacion != 0){
            TextView textView2 = (TextView)findViewById(R.id.textView2);
            textView2.setText(String.valueOf(ans));
        }
    }
}