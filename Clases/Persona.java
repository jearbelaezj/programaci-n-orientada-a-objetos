package Clases;

public class Persona {
    String nombre;
    String apellido;
    String altura;
    String edad;
    public Persona(String nombre, String apellido, String altura, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.altura = altura;
        this.edad = edad;

    }
    public void caminar(){
        System.out.println("caminando");
    }
}
