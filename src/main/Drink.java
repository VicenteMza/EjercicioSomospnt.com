package main;

public class Drink extends Product{
    private double liters;

    public Drink(double liters, String name, int price) {
        super(name, price);
        this.liters = liters;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getName() + " /// Litros: " + liters + " /// Precio: $" + super.getPrice();
    }
    
    
}
