package Clases;

public class Animal {
    public String nome;
    public String raca;
    public Animal(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
    }
    public void  morder(){
        System.out.println("joda me a mordido");
    }
}
