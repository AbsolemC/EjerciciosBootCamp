package Creacionales.Builder; //utilizxa un metodo de programacion fluida

public class Main {
    public static void main(String[] args) {

        Vehiculo coche = new CocheBuilder("Ford")
                .setPuertas(5)
                .setMotor("Diesel")
                .build();

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Puertas: " + coche.getPuertas());
        System.out.println("Motor: " + coche.getMotor());


        StringBuilder cadena = new StringBuilder("Hola");
        cadena.append(" esto").append(" es una").append(" cadena");
        System.out.println(cadena);
    }
}
