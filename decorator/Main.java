package decorator;

public class Main {

    public static void main(String[] args) {
        Flat flat = new SimpleFlat();
        System.out.println(flat.getSpecification());

        flat = new KitchenDecorator(new SimpleFlat());
        System.out.println(flat.getSpecification());

        flat = new FurnitureDecorator(new KitchenDecorator(new SimpleFlat()));
        System.out.println(flat.getSpecification());

        flat = new GardenDecorator(new FurnitureDecorator(new KitchenDecorator(new SimpleFlat())));
        System.out.println(flat.getSpecification());

        flat = new FurnitureDecorator(new SimpleFlat());
        System.out.println(flat.getSpecification());
    }
}
