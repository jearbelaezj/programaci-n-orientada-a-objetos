package Clases;

public class Main {
    public static void main(String[] args) {
        Animal perro= new Animal("","");
        perro.morder();
        Persona juan = new Persona("juan","alcantara","1.12","18");
        System.out.println("nombre: "+juan.nombre);
        System.out.println("apellido: "+juan.apellido);
        System.out.println("edad: "+juan.edad);
        System.out.println("altura: "+juan.altura);
        juan.caminar();
    }

}
