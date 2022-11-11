package com.ejerciciostemas678;

public class Aplicacion {

    private static Aplicacion aplicacion;

    private Aplicacion(){}

    public static Aplicacion getInstance(){
        if (aplicacion == null){
            aplicacion = new Aplicacion();
        }
        return aplicacion;

    }


}
