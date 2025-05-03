package Clases;

public class Animal {
    public String nombre;
    public String tipo;
    public Animal(String nombre,String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public void comer(){
        System.out.println("Comienza comida");
    }

}
