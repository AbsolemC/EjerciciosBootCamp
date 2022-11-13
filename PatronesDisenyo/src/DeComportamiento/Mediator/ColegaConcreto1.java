package DeComportamiento.Mediator;

public class ColegaConcreto1 extends Colega {

    @Override
    void recibe() {
        System.out.println("He recibido un mensaje. ColegaConcreto1");
    }

    @Override
    void envia() {
        System.out.println("Enviando un mensaje. ColegaConcreto1");
        mediator.reenvia(this);
    }
}
