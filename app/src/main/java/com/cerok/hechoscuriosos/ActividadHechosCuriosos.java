package com.cerok.hechoscuriosos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static android.graphics.Color.RED;
import static android.widget.Toast.LENGTH_LONG;

public class ActividadHechosCuriosos extends AppCompatActivity {
    static final String TAG =ActividadHechosCuriosos.class.getSimpleName();
    private ColeccionHechos mColeccionHechos = new ColeccionHechos();
    private ColeccionColor mColeccionColores = new ColeccionColor();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_hechos_curiosos);
        // Declaracion de las vistas y asgnacion de las vistas desde la distribucion
        final TextView etiquetaHecho = (TextView) findViewById(R.id.textoHecho);
        final Button botonMostrarHecho = (Button) findViewById(R.id.botonMostrarHechos);
        final RelativeLayout pantalla = (RelativeLayout) findViewById(R.id.pantalla);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int color = mColeccionColores.obtenerColor();
                etiquetaHecho.setText(mColeccionHechos.obtenerHecho());
                pantalla.setBackgroundColor(color);
                botonMostrarHecho.setTextColor(color);
            }
        };
        botonMostrarHecho.setOnClickListener(listener);


        //Toast.makeText(this,"La actividad fue creada!", LENGTH_LONG).show();
        Log.d(TAG,"Mensaje desde onCreate");
    }
}
