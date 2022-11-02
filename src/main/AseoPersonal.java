package main;

public class AseoPersonal extends Producto{
    private int contenido;

    public AseoPersonal(int contenido, String nombre, int precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getNombre() + " /// Contenido: " + contenido + "ml"+ " /// Precio: $" + super.getPrecio();
    }
    
    
}
