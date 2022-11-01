package main;

import java.util.ArrayList;
import java.util.List;

class Productos {

    private List<Producto> productos = new ArrayList<>();

    public List<Producto> getProductos() {
        return productos;
    }

    public void cargarProducto(Producto producto) {
        productos.add(producto);
    }

    public void imprimirLista() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void imprimirMax() {
        System.out.println("Producto más caro: " + productos.get(productos.size() - 1).getNombre());
    }

    public void imprimirMin() {
        System.out.println("Producto más barato: " + productos.get(0).getNombre());
    }

}
