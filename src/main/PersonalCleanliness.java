package main;

public class PersonalCleanliness extends Product{
    private int quantity;

    public PersonalCleanliness(int quantity, String name, int price) {
        super(name, price);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Nombre: " + super.getName() + " /// Contenido: " + quantity + "ml"+ " /// Precio: $" + super.getPrice();
    }
    
    
}
