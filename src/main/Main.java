package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Ejercicio Somos PNT.

Imaginemos un supermercado de barrio.
Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza
lo siguiente por consola y se termina la ejecución:

Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
Nombre: Shampoo Sedal /// Contenido: 500ml /// Precio: $19
Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
=============================
Product más caro: Frutillas

Product más barato: Coca-Cola

La solución debe cumplir con los siguientes requisitos:

Diseñar una solución orientada a objetos.
La salida es por consola y exactamente como se requiere.
Usar solamente las clases provistas por Java 8..
Cargar la lista de productos en un único método. No hay ingreso por pantalla de ningún tipo.
El algoritmo usado para la impresión no tiene que depender de la cantidad o tipo de productos.
Para mostrar el mayor / menor, utilizar la interfaz Comparable.
Para imprimir por pantalla, sobrescribir el método toString()
 */
public class Main {
    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        Products prod = new Products();
        
        prod.uploadProduct(new Drink(1.5, "Coca-Cola Zero", 20));
        prod.uploadProduct(new Drink(1.5, "Coca-Cola", 18));
        prod.uploadProduct(new PersonalCleanliness(500, "Shampoo Sedal", 19));
        prod.uploadProduct(new Fruit("kilo", "Frutillas",64));

        prod.printList();

        product = prod.getProducts();
        
        //Ordeno la lista de productos
        Collections.sort(product);
        
        System.out.println("=============================");

        prod.printMax();
        prod.printMin();
    }
}
