package com.cerok.hechoscuriosos;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by cerok on 09/02/2017.
 */

public class ColeccionColor {
    public String[] mColores = {"#39add1", // Azul Claro
            "#3079ab", // Azul Oscuro
            "#c25975", // Malva
            "#e15258", // Rojo
            "#f9845b", // Naranja
            "#838cc7", // Lavanda
            "#7d669e", // Púrpura
            "#53bbb4", // Aguamarina
            "#51b46d", // Verde
            "#e0ab18", // Mostaza
            "#637a91", // Gris Oscuro
            "#f092b0", // Rosa
            "#b7c0c7"  // Gris Claro
            };

    public int obtenerColor(){

        //Seleccionar un hecho aleatorio
        Random generador = new Random();
        int numeroAleatorio = generador.nextInt(mColores.length);
        int color = Color.parseColor(mColores[numeroAleatorio]);
        return(color);
    }
}
