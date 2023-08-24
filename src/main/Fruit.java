package main;

public class Fruit extends Product{
    private String salesUnit;

    public Fruit(String salesUnit, String price, int precio) {
        super(price, precio);
        this.salesUnit = salesUnit;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getName() + " /// Precio: $" + super.getPrice()+ " /// Unidad De Venta: " + salesUnit;
    }
    
    
}
