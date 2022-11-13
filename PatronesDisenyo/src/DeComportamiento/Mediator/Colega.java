package DeComportamiento.Mediator;

abstract public class Colega {
    Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void recibe();
    abstract void envia();
}
