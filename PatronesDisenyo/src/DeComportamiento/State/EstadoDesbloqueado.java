package DeComportamiento.State;

public class EstadoDesbloqueado extends Estado{

    public EstadoDesbloqueado(Telefono telefono){
        super(telefono);
    }
    @Override
    public String desbloquear() {
        return "El móvil ya está desbloqueado.";
    }

    @Override
    public String abrirCamara() {
    telefono.cambiaEstado(new EstadoCamaraAbierta(telefono));
    return "Camara abierta";
    }

    @Override
    public String hacerFoto() {
        return "No es posible hacer una foto sin abrir la cámara";
    }
}
