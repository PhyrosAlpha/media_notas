package com.example.mediadasnotas;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //   setContentView(R.layout.login);
    }

    public void calcular_media(View view) {  //Calcular a média das notas dos inputs
        try {

            EditText inputNotaOne = findViewById(R.id.inputNotaOne);
            EditText inputNotaTwo = findViewById(R.id.inputNotaTwo);
            EditText inputNotaThree = findViewById(R.id.inputNotaThree);
            TextView resultadoNotaText = findViewById(R.id.resultNumber);

            double notaOne = Double.parseDouble(inputNotaOne.getText().toString());
            double notaTwo = Double.parseDouble(inputNotaTwo.getText().toString());
            double notaThree = Double.parseDouble(inputNotaThree.getText().toString());

            String resultado = Float.toString((float) calcularMedia(notaOne, notaTwo, notaThree));

            resultadoNotaText.setText(resultado);

        } catch (Exception e) {
            msgErro();

        }
    }

    private double calcularMedia(double notaOne, double notaTwo, double notaThree){
        double valor = notaOne + notaTwo + notaThree;
        return valor / 3;
    }

    private void msgErro(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Erro");
        dialog.setMessage("Ocorreu um erro! tente outra vez!!");
        dialog.show();

    }

}