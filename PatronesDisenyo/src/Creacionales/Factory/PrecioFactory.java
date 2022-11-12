package Creacionales.Factory;
//sirve para crear una jerarquia de clases y utilizar una u otra de forma transparente
//factoría que segun el pais en el que estemos nos de un precio u otro
//habitualmente comenzamos con una abstract class o interface
//ya que se debe definir el método que va a utilizar por debajo nuestra jerarquía

public class PrecioFactory {
    Precio precio;

    private PrecioFactory(){};

    public PrecioFactory (String pais){
        if (pais.equalsIgnoreCase("españa")){
            System.out.println("España, precio EUR");
            precio = new PrecioEUR();
        } else {
            System.out.println("Otro pais, precio USD");
            precio = new PrecioUSD();

        }
    }
    public double getPrecio(){
        return precio.getPrecio();
    }
}
