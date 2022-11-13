package DeComportamiento.State;

public class EstadoCamaraAbierta extends Estado{

    public EstadoCamaraAbierta (Telefono telefono){
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
        telefono.cambiaEstado(new HacerFoto(telefono));
        return "Capturando...";
    }
}

