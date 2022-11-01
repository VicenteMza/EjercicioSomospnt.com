package main;

public class Bebida extends Producto{
    private double litros;

    public Bebida(double litros, String nombre, int precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " /// litros: " + litros + " /// Precio: $" + super.getPrecio();
    }
    
    
}
