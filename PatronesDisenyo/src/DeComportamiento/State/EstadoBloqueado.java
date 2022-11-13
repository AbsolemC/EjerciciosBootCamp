package DeComportamiento.State;

public class EstadoBloqueado extends Estado{

    public EstadoBloqueado(Telefono telefono){
        super(telefono);
    }
    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "Móvil desbloqueado";
    }

    @Override
    public String abrirCamara() {
        return "Desbloquea el móvil para utilizar la cámara";
    }

    @Override
    public String hacerFoto() {
        return "Desbloquea el móvil para utilizar la hacer una foto";
    }
}
