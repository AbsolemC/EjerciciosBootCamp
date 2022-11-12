package Estructurales.Decorator;

public class TelefonoNextGen  extends TelefonoDecorator{
    public TelefonoNextGen (Telefono telefono) {
        super(telefono);
    }

    @Override
    public  void crear(){
        super.crear();
        System.out.println(" NEXTGEN: Tambien tengo 5g");
    }
}
