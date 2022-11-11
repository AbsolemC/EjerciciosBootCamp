package com.ejerciciostemas678;



/*
Patrones creacionales:
.Builder: Ayuda y simplifica la cración de objetos
.Factory:
.Prototype: Crea réplicas de obljetos existentes
.Singleton: Se utiliza para crear una única instancia de un objeto

Patrones estrcuturales:
.Adapter:
.Decorador:
.Facade:

 */


public class Main {
    public static void main(String[] args) {

        Aplicacion aplicacion = Aplicacion.getInstance();

        System.out.println("Aplicación ejecutándose en: " + aplicacion);

        Aplicacion aplicacion1 = Aplicacion.getInstance();

        System.out.println("La aplicación ya esta en ejecución. " + aplicacion);




    }
}
