package Creacionales.Prototype; //tiene como objetivo clonarse a si mismo, es decir
//que una clase se herede a si misma, que clone metodos propiedades y su estado
//como un molde

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Coche coche = new Coche();
        coche.puertas = 5;
        coche.marca = "Ford";
        coche.modelo = "K";

        System.out.println(coche.marca + " " + coche.modelo + " " + coche.puertas);

        try {
            Coche clonado = coche.clonar();
            clonado.puertas = 3;
            System.out.println(clonado.marca + " " + clonado.modelo + " " + clonado.puertas);
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar" + e.getMessage());
            Coche clonado = new Coche();
        }

    }
}
