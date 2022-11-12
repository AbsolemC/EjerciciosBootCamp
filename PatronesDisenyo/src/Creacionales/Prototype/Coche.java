package Creacionales.Prototype;


public class Coche implements Cloneable {
    public String marca;
    public String modelo;
    int puertas;

    public Coche(){ }

    /*public  Coche clonar(){
        Coche clon = new Coche();

        clon.marca = this.marca;
        clon.modelo = this.modelo;
        clon.puertas = this.puertas;

        return clon;
    }*/
    public  Coche clonar() throws CloneNotSupportedException {
        return (Coche) this.clone();
    }
}
