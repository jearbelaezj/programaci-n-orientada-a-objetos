package clases;

public class Facturas {
   private String numero;
   private double total;//atributo privado para controlar el acceso
    //metodo publico con validacion

    public void setTotal(double total)
    {
        if (total < 0) throw new IllegalArgumentException("total invalido");
        this.total = total;
    }

    public double getTotal() {
        return total;
    }
}
