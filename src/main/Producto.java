package main;

public class Producto implements Comparable<Producto> {

    private String nombre;
    private int precio;

    public Producto() {
    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto o) {
        if (this.precio == o.getPrecio()) {          //si la edad de la primer persona es igual a la edad de la segunda retornamos 0
            return 0;
        } else if (this.precio > o.getPrecio()) {    //si la edad de la primer persona es mayor la edad de la segunda retornamos 1
            return 1;
        } else {                           //si la edad de la primer persona es menor la edad de la segunda retornamos -1
            return -1;
        }
    }

}