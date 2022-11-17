package DeComportamiento.Strategy;

import com.sun.management.UnixOperatingSystemMXBean;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UsuariosFichero usuarios = new UsuariosFichero();


        crear(usuarios, "fulanito");
        crear(usuarios,"pepita");
        crear(usuarios,"menganita");

        for (String usuario : usuarios.listar()){
            System.out.println(usuario);
        }

    }

    public static void crear (Usuarios usuarios, String nombre){
        usuarios.crear(nombre);
    }
    public ArrayList<String> listar(Usuarios usuarios){
        return usuarios.listar();
    }
}