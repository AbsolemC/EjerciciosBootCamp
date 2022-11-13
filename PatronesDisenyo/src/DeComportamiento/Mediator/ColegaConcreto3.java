package DeComportamiento.Mediator;

public class ColegaConcreto3 extends  Colega{

    @Override
    void recibe() {
        System.out.println("He recibido un mensaje. ColegaConcreto3");
    }

    @Override
    void envia() {
        System.out.println("Enviando un mensaje. ColegaConcreto3");
        mediator.reenvia(this);
    }
}
