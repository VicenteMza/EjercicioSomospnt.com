package main;

import java.util.ArrayList;
import java.util.List;

class Products {

    private List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public void uploadProduct(Product product) {
        products.add(product);
    }

    public void printList() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void printMax() {
        System.out.println("Producto más caro: " + products.get(products.size()-1));
    }
    public void printMin() {
        System.out.println("Producto más barato: " + products.stream().findFirst().orElseThrow());
    }

}
