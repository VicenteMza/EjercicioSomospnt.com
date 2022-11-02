package main;

public class Fruta extends Producto{
    private String unidadDeVenta;

    public Fruta(String unidadDeVenta, String nombre, int precio) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " /// Precio: $" + super.getPrecio()+ " /// Unidad De Venta: " + unidadDeVenta;
    }
    
    
}
