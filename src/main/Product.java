package main;

public class Product implements Comparable<Product> {

    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int compareTo(Product o) {

        if (this.price == o.getPrice()) {      
            return 0;
        } else if (this.price > o.getPrice()) { 
            return 1;
        } else {   
            return -1;
        }
    }
}