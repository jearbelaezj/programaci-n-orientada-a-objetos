package clases;

public class Perro extends Animal{
    Perro(){
        super();
        System.out.println("perro creado");
    }
    public Perro(String raza, String altura, String tamaño,String nombre) {
        this.Nombre=nombre;
        this.Raza=raza;
        this.Altura=altura;
        this.Tamaño=tamaño;
    }
    public void hacerSonidi(){
        System.out.println("guau");

}}
