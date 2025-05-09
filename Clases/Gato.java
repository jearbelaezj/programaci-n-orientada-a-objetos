package clases;

public class Gato extends Animal{
    Gato(){
        super();
        System.out.println("gato creado");
    }
    public Gato(String raza, String altura, String tamaño,String nombre){
        this.Raza = raza;
        this.Altura=altura;
        this.Tamaño=tamaño;
        this.Nombre=nombre;


    }

    public void hacerSonidi(){
        System.out.println("miau");
    }

}
