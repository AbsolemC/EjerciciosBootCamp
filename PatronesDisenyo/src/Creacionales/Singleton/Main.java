package Creacionales.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.setContador(15);

        Singleton singleton1 = Singleton.getInstance();

        System.out.println("valor:" + singleton.getContador() + " memoria: " + singleton);
        System.out.println("valor:" + singleton1.getContador() + " memoria: " + singleton1);

    }
}
