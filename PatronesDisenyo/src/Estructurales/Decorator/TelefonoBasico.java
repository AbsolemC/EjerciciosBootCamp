package Estructurales.Decorator;

public class TelefonoBasico implements Telefono {

    @Override
    public void crear() {
        System.out.println("Telefono Basico");
        this.tengoGSM();
        this.tengoSMS();
    }

    private void tengoGSM(){
        System.out.println("Tengo GSM");
    }

    public  void tengoSMS(){
        System.out.println("Tengo SMS");
    }
}
