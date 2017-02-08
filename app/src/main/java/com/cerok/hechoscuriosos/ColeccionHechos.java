package com.cerok.hechoscuriosos;

import java.util.Random;

/**
 * Created by cerok on 08/02/2017.
 */

public class ColeccionHechos {
    public String[] mHechos = {"Las hormigas se estiran al despertarse.",
            "Los avestruces pueden correr más rápido que los caballos.",
            "Las medallas de oro olímpicas están compuestas mayormente de plata.",
            "Al nacer tenemos 300 huesos, cuando somos adultos tenemos sólo 206.",
            "La luz del Sol tarda 8 minutos en alcanzar la tierra.",
            "Algunas plantas de bambú pueden crecer casi un metro en un sólo día.",
            "El estado de Florida es más grande que Inglaterra.",
            "Algunos pingüinos pueden saltar 2-3 metros fuera del agua.",
            "En promedio, toma 66 días adquirir un nuevo hábito.",
            "Los Mamuts todavía caminaban sobre la tierra mientras se construía la gran piramide.",
            "Hecho de prueba"};
    
    public String obtenerHecho(){
        //El boton fue presionado, actualizar con un nuevo hecho
        //String hecho = "";
        //Seleccionar un hecho aleatorio
        Random generador = new Random();
        int numeroAleatorio = generador.nextInt(mHechos.length);
        return(mHechos[numeroAleatorio]);
    }
}
