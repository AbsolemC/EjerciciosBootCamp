package DeComportamiento.Iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("Cam", 27));
        usuarios.crear(new Usuario("Dino", 71));
        usuarios.crear(new Usuario("Erl", 18));
        usuarios.crear(new Usuario("Maca", 35));

        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es: " + usuario.getNombre() + " Su edad es: " + usuario.getEdad());
        }

        usuarios.crear(new Usuario("Pitu", 8));
        Usuario usuario = usuarios.siguiente();
        System.out.println("El siguiente usuario es: " + usuario.getNombre() + " Su edad es: " + usuario.getEdad());

        usuarios.reinicia();

        while (usuarios.hayMas()){
            usuario = usuarios.siguiente();
            System.out.println("Usuario es: " + usuario.getNombre() + " Su edad es: " + usuario.getEdad());
        }




    }
}
