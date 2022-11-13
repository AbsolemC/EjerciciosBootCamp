package DeComportamiento.State;

public class HacerFoto extends Estado{

    public HacerFoto(Telefono telefono){
        super(telefono);
    }
    @Override
    public String desbloquear() {
        return "El móvil ya está desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        return "La cámara ya esta en ejecución";
    }

    @Override
    public String hacerFoto() {
        telefono.cambiaEstado(new EstadoBloqueado(telefono));
        return "Hermosa fotografía!";
    }
}


