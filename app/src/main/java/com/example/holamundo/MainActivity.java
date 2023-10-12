package com.example.holamundo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int resultado = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnSumar = findViewById(R.id.botonSumar);
        final TextView tvResultado = findViewById(R.id.txt_resultado);
        Button botonReinicio = findViewById(R.id.botonReinicio);


        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Sumar 1 + 1
                resultado = resultado + 1;
                // Mostrar el resultado en el TextView
                tvResultado.setText("Resultado: " + resultado);
            }
        });
        botonReinicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reiniciar el contador a 0
                resultado = 0;
                // Mostrar el resultado reiniciado en el TextView
                tvResultado.setText("Resultado: " + resultado);
            }
        });
    }
}




