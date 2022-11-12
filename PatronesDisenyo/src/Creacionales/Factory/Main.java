package Creacionales.Factory;

public class Main {
    public static void main(String[] args) {

        PrecioFactory precio = new PrecioFactory("españa");
        System.out.println(precio.getPrecio());

        PrecioFactory precio1 = new PrecioFactory("USA");
        System.out.println(precio1.getPrecio());
    }
}
