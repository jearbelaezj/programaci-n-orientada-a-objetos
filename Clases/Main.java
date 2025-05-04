package Clases;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal("mylon","perro");
        Animal gato = new Animal("gato", "malparido");
        perro.comer();
        gato.comer();
        perro.morder();


    }
}
