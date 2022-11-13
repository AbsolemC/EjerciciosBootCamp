package DeComportamiento.Mediator;

public class ColegaConcreto2 extends  Colega{

        @Override
        void recibe() {
            System.out.println("He recibido un mensaje. ColegaConcreto2");
        }

        @Override
        void envia() {
            System.out.println("Enviando un mensaje. ColegaConcreto2");
            mediator.reenvia(this);
        }
    }

